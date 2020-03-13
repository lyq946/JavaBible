将java类文件放置到com.lkp.demo.test.two.five.three.gp;包下面

生成的 $Proxy0.class 代码

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
