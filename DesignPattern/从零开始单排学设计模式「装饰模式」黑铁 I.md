阅读本文大概需要 3.6 分钟。

  

本篇是设计模式系列的第四篇，虽然之前也写过相应的文章，但是因为种种原因后来断掉了，而且发现之前写的内容也很渣，不够系统。

  

所以现在打算重写，加上距离现在也有一段时间了，也算是自己的一个回顾吧！

  

学而时习之，不亦说乎。

  

**推荐阅读：**  

[从零开始单排学设计模式「UML类图」定级赛](http://mp.weixin.qq.com/s?__biz=MzUyNDkzNzczNQ==&mid=2247485514&idx=1&sn=dd33498d72c50d7facad6f14957f022a&chksm=fa24f722cd537e342f293ce08831d1e7bd31b412be743a2dfeaa0f8f60414e32b726e3478b90&scene=21#wechat_redirect)  

[从零开始单排学设计模式「简单工厂设计模式」黑铁 III](http://mp.weixin.qq.com/s?__biz=MzUyNDkzNzczNQ==&mid=2247485515&idx=1&sn=ad61fd16a315fa15acca3074a0406dca&chksm=fa24f723cd537e35095ff4a2e7d150f63cfaa46378b588abbb7a4548d86ecc9806cee8f6ab57&scene=21#wechat_redirect)  

[从零开始单排学设计模式「策略模式」黑铁 II](http://mp.weixin.qq.com/s?__biz=MzUyNDkzNzczNQ==&mid=2247485617&idx=1&sn=f38fd9b9a63ac7ade48391a8a564b7c6&chksm=fa24f7d9cd537ecfa25a3e911be6754b01e8c6a25f96b3a523b3d75f578082d9ed12d800c4be&scene=21#wechat_redirect)  

  

目前段位：**黑铁 I**

  

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3IthTMOombgIog0M2B8VnxsAw6ggzMbNBrRKbIesUjiaWGX5oet94IU20w/640?wx_fmt=png)

  

Let's Go！

  

**前言**

  

设计模式不是语法，是一种巧妙的写法，能把程序变的更加灵活。架构模式比设计模式大，架构模式是战略，而设计模式是战术。

  

设计模式分为3大类型：创建型，行为型，结构型，总共有23种。

  

**装饰模式**

  

装饰模式（Decorator）指的是在不必改变类文件和使用继承的情况下，动态地扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象。

  

这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。

  

**业务需求**

  

公司接到一个任务，需要为某平台开发一个搭配不同服饰的小项目，比如类似QQ、网络游戏或论坛都有的Avatar系统（为了简化代码，直接使用控制台模拟）。

  

**代码实现**

  

经过公司的慎重讨论（实际就几秒钟），开发这一个项目的重任，又当仁不让的被产品经理交给了我，我：脸上笑嘻嘻，心里MMP。发一下下的小牢骚，不过还是抓紧干活。

  

思索一下，该系统要为不同的人进行装扮，所以定义一个人的类，不用每次装扮其他人时修改该类的代码。

  

然后人身上要有很多的服饰，比如：大T恤、垮裤、鞋子等等，然后穿上之后，需要展示出来。所以这里的话，可以抽象出一个服饰的基类，然后各个具体的服饰都继承该基类即可。

  

代码如下：

Person类

```java
/**
 * @author: LKP
 * @date: 2019/2/16
 */
public class Person {

    private String name;
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮者：" + name);
    }
}
```

服装抽象类

```java
/**
 * @author: LKP
 * @date: 2019/2/16
 */
public class Finery extends Person {

    protected  Person component;
    /**
     * 打扮
     * @param component
     */
    public void decorate(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        if(null != component){
            component.show();
        }
    }
}
```

具体服饰类

```java
/**
 * @author: LKP
 * @date: 2019/2/16
 */
public class TShirts extends Finery {

    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}

class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}

class Sneakers extends Finery{

    @Override
    public void show() {
        System.out.println("破球鞋");
        super.show();
    }
}

class LeatherShoes extends Finery{

    @Override
    public void show() {
        System.out.println("皮鞋");
        super.show();
    }
}

class Tie extends Finery{

    @Override
    public void show() {
        System.out.println("领带");
        super.show();
    }
}

class Suit extends Finery{

    @Override
    public void show() {
        System.out.println("西装");
        super.show();
    }
}
```

这里内部类，只是为了较少代码量，实际开发中可不要偷懒，按实际来创建。

  

客户端代码

```java
/**
 * @author: LKP
 * @date: 2019/2/16
 */
public class Main {

    public static void main(String[] args) {

        Person person = new Person("孤独键客");

        System.out.println("第一种装扮：");

        Finery tShirts = new TShirts();
        Finery bigTrouser = new BigTrouser();
        Finery sneakers = new Sneakers();

        tShirts.show();
        bigTrouser.show();
        sneakers.show();
        person.show();

        System.out.println("\n第二种装扮：");

        Finery suit = new Suit();
        Finery tie = new Tie();
        Finery leatherShoes = new LeatherShoes();

        suit.show();
        tie.show();
        leatherShoes.show();
        person.show();
    }
}
```

  

代码简单搞定，接下来来看一下运行结果

  

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36AMsMtuwgjHeEjAfsP4zuibZTJVD1kIl59pB9Zibrv7ArC9HGuQ3mFgCrJqddCibVUouMseCd8bJU0Aw/640?wx_fmt=png)

搞定收工，审视一下，自我感觉还算不错，如果新装扮只需改变一下调用顺序即可，如果又新人物，只需重新new一个Person类就可以了。

  

接下里将项目提交上传，然后告诉leader一声，over，离下班时间还早，好像还可以做点其他的事情~。

  

正当你准备打开去干点其他事情，leader回复你了：

  

leader：“你仔细看看这段代码，这样写意味着什么？

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36AMsMtuwgjHeEjAfsP4zuibZr64LHY9x78KzsJOp24BDsSMH1icSTyMYytliaoUr7AHlqlHs5ft0SpLA/640?wx_fmt=png)

你想象一下，是不是把‘大T恤’、‘垮裤’、‘破球鞋’、‘装扮者’一个一个词显示出来，是不是相当于你光着身子，一个一个把这些穿上，这可有点像脱衣舞哦~”。

  

我：“你意思是，这些应该都在内部组装完毕，然后在显示出来？”。

  

leader："宾果，而且还要按照正确的顺序串联起来控制，这里有点难度，修改好之后再给我"。

  

这似乎和某种设计模式有关，难道是建造者模式吗？不对，建造者模式要求建造的过程必须是稳定的，而这个穿搭的过程是不固定的，一个有个性的人又无数种方案。

  

经过一番查找，这恰恰最适合用装饰模式了。

  

我们修改一下具体的服饰类

```java
/**
 * @author: LKP
 * @date: 2019/2/16
 */
public class TShirts extends Finery {

    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}

class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}

class Sneakers extends Finery{

    @Override
    public void show() {
        System.out.println("破球鞋");
        super.show();
    }
}

class LeatherShoes extends Finery{

    @Override
    public void show() {
        System.out.println("皮鞋");
        super.show();
    }
}

class Tie extends Finery{

    @Override
    public void show() {
        System.out.println("领带");
        super.show();
    }
}

class Suit extends Finery{

    @Override
    public void show() {
        System.out.println("西装");
        super.show();
    }
}
```

再修改一下客户端代码：

```java
/**
 * @author: LKP
 * @date: 2019/2/16
 */
public class Main {

    public static void main(String[] args) {

        Person person = new Person("孤独键客");
        System.out.println("第一种装扮：");
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        sneakers.decorate(person);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);
        tShirts.show();
        System.out.println("第二种装扮：");
        LeatherShoes leatherShoes = new LeatherShoes();
        Tie tie = new Tie();
        Suit suit = new Suit();
        leatherShoes.decorate(person);
        tie.decorate(leatherShoes);
        suit.decorate(tie);
        suit.show();
    }
}
```

第二版的程序写完了，来测试一下

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36AMsMtuwgjHeEjAfsP4zuibZdby1fymmYkqNmF6xtQQX3NwV4OQaKWbbMiaMzcLB9E5JrAyWSFf7hqQ/640?wx_fmt=png)

完美搞定，哈哈，我还可以换种装饰方式

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36AMsMtuwgjHeEjAfsP4zuibZzmPVf2vzqQ7RPctCApz2MeDaWBnoJACP4JR85D9SUfeMelHDpvHCwA/640?wx_fmt=png)

看下结果

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36AMsMtuwgjHeEjAfsP4zuibZyib6kHfsvQAZmCUQB44dlL951B2MfEzUGqibGDaXI5qRIf2LqLiboXX5A/640?wx_fmt=png)

光着膀子、打着领带、下身垮裤、脚上皮鞋，绝对的极具个性。

  

最后，完美搞定，提交代码~~~

  

**装饰模式UML类图**

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36AMsMtuwgjHeEjAfsP4zuibZUYvnT1u9EO3LLjPEnUJ2MGlUELGE9dialQN9fVgpWGYHrE1nZ31tkoA/640?wx_fmt=png)

  

**总结**

  

来总结一下装饰模式：

  

**主要解决**：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。

  

**何时使用**：在不想增加很多子类的情况下扩展类。

  

**如何解决**：将具体功能职责划分，同时继承装饰者模式。

  

**关键代码**： 1、Component 类充当抽象角色，不应该具体实现。 2、修饰类引用和继承 Component 类，具体扩展类重写父类方法。

  

**应用实例**： 1、孙悟空有 72 变，当他变成"庙宇"后，他的根本还是一只猴子，但是他又有了庙宇的功能。 2、不论一幅画有没有画框都可以挂在墙上，但是通常都是有画框的，并且实际上是画框被挂在墙上。在挂在墙上之前，画可以被蒙上玻璃，装到框子里；这时画、玻璃和画框形成了一个物体。

  

**优点**：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。

  

**缺点**：多层装饰比较复杂。

  

**使用场景**： 1、扩展一个类的功能。 2、动态增加功能，动态撤销。

  

**注意事项**：可代替继承。
