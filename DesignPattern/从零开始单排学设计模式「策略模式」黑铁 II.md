阅读本文大概需要 1.7 分钟。

  

本篇是设计模式系列的第三篇，虽然之前也写过相应的文章，但是因为种种原因后来断掉了，而且发现之前写的内容也很渣，不够系统。所以现在打算重写，加上距离现在也有一段时间了，也算是自己的一个回顾吧！

  

学而时习之，不亦说乎。

  

**推荐阅读：**  

[从零开始单排学设计模式「UML类图」定级赛](http://mp.weixin.qq.com/s?__biz=MzUyNDkzNzczNQ==&mid=2247485514&idx=1&sn=dd33498d72c50d7facad6f14957f022a&chksm=fa24f722cd537e342f293ce08831d1e7bd31b412be743a2dfeaa0f8f60414e32b726e3478b90&scene=21#wechat_redirect)  

[从零开始单排学设计模式「简单工厂设计模式」黑铁III](http://mp.weixin.qq.com/s?__biz=MzUyNDkzNzczNQ==&mid=2247485515&idx=1&sn=ad61fd16a315fa15acca3074a0406dca&chksm=fa24f723cd537e35095ff4a2e7d150f63cfaa46378b588abbb7a4548d86ecc9806cee8f6ab57&scene=21#wechat_redirect)  

  

目前段位：**黑铁 II**

  

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3IthTMOombgIog0M2B8VnxsAw6ggzMbNBrRKbIesUjiaWGX5oet94IU20w/640?wx_fmt=png)

  

Let's Go！

  

**前言**

  

设计模式不是语法，是一种巧妙的写法，能把程序变的更加灵活。架构模式比设计模式大，架构模式是战略，而设计模式是战术。

  

设计模式分为3大类型：创建型，行为型，结构型，总共有23种。

  

**策略模式**

  

策略模式是对算法的包装，是把使用算法的责任和算法本身分割开来，委派给不同的对象管理。策略模式通常把一个系列的算法包装到一系列的策略类里面，作为一个抽象策略类的子类。  

  

用一句话来说，就是：“准备一组算法，并将每一个算法封装起来，使得它们可以互换”。

  

在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。

  

设计原则有很多，这里直说策略模式中使用到的，参看实例思考哪些地方有用到下面的设计模式：   
1\. 封装变化（找出应用中可能需要变化之处，把它们独立出来，不要和哪些不需要变化的代码混在一起。）   
2\. 针对接口，超类编程，而不是针对实现编程。   
3\. 多用组合，少用继承。

  

**业务需求**

  

如果让你设计一个商场收银软件，营业员根据客户所购买商品的单价和数量，向客户收费。  

  

**代码实现**

  

看到需求的你，对它进行了一个分析，只需要把数量乘以单价就可以得出总费用了，这可难不倒我，然后写出了最初版本。  

  

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36BjupOrhxkPgvCBgL9BymJBHqianLr0lMYp9dANNCrRLS9D6qt7uHy9k82Vc5HEwTlibibAAtuOtk4Hw/640?wx_fmt=png)

  

很简单，直接声明方法然后就计算出结算的总价了。

  

当你准备提交代码的时候，万恶的产品找到你，给出了一个新版的需求。（暗地里画个圈圈咒诅产品...）

  

**新的业务需求**

  

如果让你设计一个商场收银软件，营业员根据客户所购买商品的单价和数量，向客户收费。就是现在商场需要搞活动，会给顾客购买的商品进行打折，比如七五折，九五折等等。

  

**代码实现**

  

这不是计算完总价格之后，在后面乘以一下折扣就可以了。

  

经过改版，新的代码如下：

  

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36BjupOrhxkPgvCBgL9BymJBCwTgt8iaUdqr4ibDiaUgZibktolQvVHgiab0AhAIMRJEmAyS2UibJU7wKfqw/640?wx_fmt=png)

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36BjupOrhxkPgvCBgL9BymJB2um62reFn946vYrc2cg00ShrhKvprWV5IVnxtjPEFncXHXW2tl3VRQ/640?wx_fmt=png)

  

还没有等你进行测试，产品就又找上门来了，我们可能后面会实现满300送100、满200送50....等等的很多活动，所以你程序需要设计灵活一点哈，不然到时候我的需求可以还会有变动的。

  

看到这里，没办法，还是得继续完善程序了，想偷个懒都没有办法，思考这种种得可能，你找寻这有没有能完美贴切这种需求得处理方法。

  

打一折和打九折只是形式的不同，抽象分析出来，所有的打折算法都是一样的，所以打折算法应该是一个类。冥思苦想下，你又写出了第三版程序：

  

这里抽离出来一个现金收费类，现金收取类的抽象方法，收取现金，参数为原价，返回当前价。

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36BjupOrhxkPgvCBgL9BymJBlOQULNNgQjdBOK5CsE4ibrTvqtEpODLd3pOVzzzBDibK87B03cBUB3Lg/640?wx_fmt=png)

  

正常收费子类，正常收费，原价返回。

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36BjupOrhxkPgvCBgL9BymJBhgKXPINQv9r7dbvcO9f8kIBMRZSTQQmjGj2Ourhm2XxbCnb9VyqpnQ/640?wx_fmt=png)

  

打折收费子类

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36BjupOrhxkPgvCBgL9BymJBjqsBasuVkbvqkCz1NHVUIic8Lk513uD9Acr2v0WW5d5ctlrHY9RWUyw/640?wx_fmt=png)

  

返利收费子类

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36BjupOrhxkPgvCBgL9BymJB3lOYdhjfRsdTfH19oRpLQUGSZ5AKRtGZ0vibpzAkMIIQRxjKD6kj84g/640?wx_fmt=png)

  

CashContext类，通过构造方法，传入具体的收费策略。

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36BjupOrhxkPgvCBgL9BymJBukKTjrI9AMheKcqdXrI0QoD9fKFW3icfsIXw2BmSz5TzdeibL4vZ8pfQ/640?wx_fmt=png)

客户端主要代码

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36BjupOrhxkPgvCBgL9BymJBX8iaI8Vh4e9FUracxicRLbYKmnYCcicNhYiakQNdN6dwaEarNaaW7Gn89g/640?wx_fmt=png)

  

运行结果

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36BjupOrhxkPgvCBgL9BymJBqGHKHH60UW0iaWc1jb5ZLh9CxGrVicdZwLdDtwOWYNIgibyd8qq5cFGoA/640?wx_fmt=png)

  

现在就再也不怕了，如果再增加新的功能，只需要创建新的子类即可。

  

**策略模式UML类图**

  

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Dfg1G11fMcctX10zvQmUKeaKfRtG8JnfWa4cBBLfyMQfsCVeia3HiageIqEPgvTsvwdqjgXGLA7XyA/640?wx_fmt=png)

  

**总结**

  

**意图**：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。

  

**主要解决**：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。

  

**何时使用**：一个系统有许多许多类，而区分它们的只是他们直接的行为。

  

**如何解决**：将这些算法封装成一个一个的类，任意地替换。

  

**关键代码**：实现同一个接口。

  

**应用实例**： 

        1、诸葛亮的锦囊妙计，每一个锦囊就是一个策略。 

        2、旅行的出游方式，选择骑自行车、坐汽车，每一种旅行方式都是一个策略。 

    3、JAVA AWT 中的 LayoutManager。

  

**优点**： 

        1、算法可以自由切换。

        2、避免使用多重条件判断。 

        3、扩展性良好。

  

**缺点**： 

        1、策略类会增多。 

        2、所有策略类都需要对外暴露。

  

**使用场景**： 

        1、如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。 

        2、一个系统需要动态地在几种算法中选择一种。 

        3、如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。

  

**注意事项**：如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。
