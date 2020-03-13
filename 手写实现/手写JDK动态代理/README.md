提示：将java类文件放置到com.lkp.demo.test.two.five.three.gp;包下面

### JDK 动态代理是怎么进行的？

JDK 动态代理采用字节重组，重新生成对象来代替原始对象，以达到动态地代替的目的。

### JDK 动态代理生成对象步骤：
1)  获取被代理对象的引用，并且获取它的所有接口，反射获取。
2) JDK动态代理类重新生成一个新的类，同时新的类要实现被代理类实现的所有接口。
3) 动态生成Java代码，新加的业务逻辑方法由一定的逻辑代码调用（在代码中体现）
4) 编译新生成的Java代码.class文件。
5) 重新加载到JVM中运行。

### 生成的 $Proxy0.class 代码

```java
package com.lkp.demo.test.two.five.three.gp;

import com.lkp.demo.test.two.five.three.two.macth.maker.Person;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

public class $Proxy0 implements Person {
    GPInvocationHandler invocationHandler;

    public $Proxy0(GPInvocationHandler var1) {
        this.invocationHandler = var1;
    }

    public void findLove() {
        try {
            Method var1 = Person.class.getMethod("findLove");
            this.invocationHandler.invoke(this, var1, new Object[0]);
        } catch (Error var2) {
            ;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }

    }
}
```
