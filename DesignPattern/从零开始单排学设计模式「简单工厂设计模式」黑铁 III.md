阅读本文大概需要 2 分钟。

  

本篇是设计模式系列的第二篇，虽然之前也写过相应的文章，但是因为种种原因后来断掉了，而且发现之前写的内容也很渣，不够系统。所以现在打算重写，加上距离现在也有一段时间了，也算是自己的一个回顾吧！

  

学而时习之，不亦说乎。

  

**推荐阅读：**  

[从零开始单排学设计模式「UML类图」定级赛](http://mp.weixin.qq.com/s?__biz=MzUyNDkzNzczNQ==&mid=2247485514&idx=1&sn=dd33498d72c50d7facad6f14957f022a&chksm=fa24f722cd537e342f293ce08831d1e7bd31b412be743a2dfeaa0f8f60414e32b726e3478b90&scene=21#wechat_redirect)  

  

目前段位：**黑铁 III**

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3IthTMOombgIog0M2B8VnxsAw6ggzMbNBrRKbIesUjiaWGX5oet94IU20w/640?wx_fmt=png)

  

Let's Go！

  

**前言**

  

设计模式不是语法，是一种巧妙的写法，能把程序变的更加灵活。架构模式比设计模式大，架构模式是战略，而设计模式是战术。

  

设计模式分为3大类型：创建型，行为型，结构型，总共有23种。

  

**简单工厂模式**

  

简单工厂模式设计模式属于创建型设计模式，但不属于23种设计模式范围内，属于23种设计模式中工厂方法的入门模式，又叫静态工厂方法模式。

  

简单工厂模式是一个工厂对象决定创建出哪一种产品类的实例。它的好处是隐藏对象创建，不用依赖对象，可以随意更换对象。

  

在工厂模式中，工厂类中的所有方法返回同一个抽象产品类，代码的升级和扩展只需要在这个工厂类中注入新的功能方法，返回抽象产品类即可，或是另外写接口，将这个抽象产品类强制转换成这个接口，让具体产品类去实现。

  

**业务需求**

  

如果让你设计一个简单的计算器，实现两位数的简单加减乘除运算，你会怎么设计呢？  

  

**代码实现**

  

刚接到需求的你，绝对会发现，需求是如此so easy(很容易)，刷刷刷的就完成了任务。

  

实现思路很简单，一个运算类，用来计算结果的，一个计算器类，用来实现交互并接收参数的。

  

写完的代码如下

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3ItqGiaL4iaDAjzM1QOL8BNibbU11icdG06UAKjp9qVC4jrY1c6IXibF7DZDZA/640?wx_fmt=png)  

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3Itt8EZlXZHlbp28oNd1fd29xF11iclztib6FcDqsaUjLk9Tu5dfUjbGeYQ/640?wx_fmt=png)

我们来运行一遍，看下结果  

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3ItCdNH09Yz1bllKDxdwOPl1xBwibQO0xCtfj3TCRPC0j5racLbPlSWC1A/640?wx_fmt=png)

是不是很简单，哈哈，我真是个天才（自恋一下），写完之后看着自己写的代码，总觉得似乎不妥。

  

Java的特点是面向对象，而面向对象的三大特征是封装、继承和多态。我这里好像只用到了封装，将运算类进行一个简单封装，但是继承和多态却没有体现出来.....要是这样提交代码，被leader(领导)看到那岂不是要被拖出去枪毙，不行，还得再改改。

  

再次改版之后运算类Operation代码如下

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3It997AvrkNXiaiaqkcUpGYDT5bm6LPF0VpbeP75ibQE3AYENNNQd8nMXfUw/640?wx_fmt=png)

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3ItBoGE32N5zpib0coM8hURs9Sxw18ekDtzTZEt0t7GicjDzKeEpFDVn57w/640?wx_fmt=png)

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3ItjfNS3fjeBrWBoIZ2LWaeQCMG13xhna2IXN78DfHWibzIAgmQmUlmjMw/640?wx_fmt=png)

（PS：这里仅仅是为了方便所以声明的是内部类，实际开发类似的程序时不要这样写，因为如果程序变复杂之后，这种编写方式不利于维护）

  

新创建了一个简单工厂类，用于实现业务逻辑。

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3ItwKd77UWlSVb7vOv1xh5cb0Sdw5eTPl543ayBc0zicCm8bJZVJnHHia8Q/640?wx_fmt=png)

计算器类改动不大

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3ItRblwsNlT5Yg8BB6qqURAWxOiasyrOoggciaaLyFybKIbGAlsrqUKLV8w/640?wx_fmt=png)

来试试新版的计算器，看一下结果

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3ItDTOibVKylDHsppOlpLXfDLuS4jAFfichGibRq3EqT7nJ8kPk8hUEUL80w/640?wx_fmt=png)

这样提交代码问题应该不大了。

  

新版的代码中，你只需要输入运算符号，工厂就实例化出合适的对象，通过多态，返回父类的方式实现了计算器的结果。同时，如果后续需要对程序维护，如要维护加法类，那么只需要提供新增方法的代码即可，不需要全部代码都提供，提高了整个项目的安全性。

  

**简单工厂模式UML类图**

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3ItTQS4iaqE1G3X1ln1oAvpLRKGovSPIbyiaExOM5yVbjuvAic1lhAYKA07Q/640?wx_fmt=png)

  

**总结**

工厂（Factory）：用一个单独的类来做这个类创造实例的过程，这就是工厂。

  

简单工厂模式解决的就是对象创建问题。

  

![](https://mmbiz.qpic.cn/mmbiz_png/TeYk478W36Ba9cUE7U4f1yJOrEDGA3ItoGDzYbtPXptMFdFaExBRzMLXeu0wYmcGtqIVnajQGd1A3OrMBUOSsQ/640?wx_fmt=png)

当我们已知的某些条件后，对类的选择，而这些类都是同一父类的子类，那么我们就可以使用简单工厂模式。
