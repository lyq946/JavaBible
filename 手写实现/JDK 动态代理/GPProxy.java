package com.lkp.demo.test.two.five.three.gp;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 用来生成原代码的工具类
 *
 * @author: LKP
 * @date: 2020/3/11
 */
public class GPProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader classLoader, Class<?>[] interfaces
            , GPInvocationHandler invocationHandler) {
        try {
            // 动态生成源代码.java文件
            String src = generateSrc(interfaces);

            // java文件输出磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            File file = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(file);
            fw.write(src);
            fw.flush();
            fw.close();

            // 把生成的.java文件编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null
                    , null, null);
            Iterable iterable = manage.getJavaFileObjects(file);

            JavaCompiler.CompilationTask task = compiler.getTask(null, manage, null
                    , null ,null, iterable);
            task.call();
            manage.close();

            // 把编译生成的.class文件加载到JVM中
            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor constructor = proxyClass.getConstructor(GPInvocationHandler.class);
            file.delete();

            // 返回字节码重组以后的新的代理对象
             return constructor.newInstance(invocationHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.lkp.demo.test.two.five.three.gp;" + ln);
        sb.append("import com.lkp.demo.test.two.five.three.two.macth.maker.Person;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
            sb.append("GPInvocationHandler invocationHandler;" + ln);
            sb.append("public $Proxy0(GPInvocationHandler invocationHandler){ " + ln);
                sb.append("this.invocationHandler = invocationHandler;" + ln);
            sb.append("}" + ln);
        for (Method method : interfaces[0].getMethods()) {
            Class<?>[] params = method.getParameterTypes();

            StringBuilder paramNames = new StringBuilder();
            StringBuilder paramValues = new StringBuilder();
            StringBuilder paramClasses = new StringBuilder();

            for (int i = 0; i < params.length; i++) {
                Class clazz = params[i];
                String type = clazz.getName();
                String paramName = toLowerFirstCase(clazz.getSimpleName());
                paramNames.append(type + " " + paramName);
                paramValues.append(paramName);
                paramClasses.append(clazz.getName() + ".class");

                if(i > 0 && i < params.length - 1){
                    paramNames.append(",");
                    paramValues.append(",");
                    paramClasses.append(",");
                }
            }

            sb.append("public " + method.getReturnType().getName() + " " + method.getName()
                    + "(" + paramNames.toString() + ") {" + ln);
                sb.append("try{"+ln);
                    sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\""
                            + method.getName() + "\", new Class[]{" + paramClasses.toString() + "});" + ln);
                    sb.append((hasReturnValue(method.getReturnType()) ? "return " : "") +
                            getCaseCode("this.invocationHandler.invoke(this, m, new Object[]{"
                                    + paramValues +"})", method.getReturnType()) + ";" + ln);
                sb.append("}catch(Error _ex){ }");
                sb.append("catch(Throwable e){" + ln);
                sb.append("throw new UndeclaredThrowableException(e);" + ln);
                sb.append("}");
                sb.append(getReturnEmptyCode(method.getReturnType()));
            sb.append("}");
        }
        sb.append("}"+ln);
        return sb.toString();
    }

    private static Map<Class, Class> mappings = new HashMap<>();

    static {
        mappings.put(int.class, Integer.class);
    }

    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == void.class) {
            return "";
        }else{
            return "return null;";
        }
    }

    private static String getCaseCode(String code, Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "((" + mappings.get(returnClass).getName() + ")" + code + ")."
                    + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }

    private static boolean hasReturnValue(Class<?> clazz){
        return clazz != void.class;
    }

    private static String toLowerFirstCase(String src){
        char[] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);

    }

}
