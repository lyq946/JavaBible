# 目录

## Java集合22题

1. <a href="#1.1">ArrayList 和 Vector 的区别。</a>

2. <a href="#1.2">说说 ArrayList，Vector，LinkedList 的存储性能和特性。</a>

3. <a href="#1.3">快速失败 (fail-fast) 和安全失败 (fail-safe) 的区别是什么？</a>

4. <a href="#1.4">HashMap 的数据结构。</a>

5. HashMap 的工作原理是什么?

6. Hashmap 什么时候进行扩容呢？

7. List、Map、Set 三个接口，存取元素时，各有什么特点？

8. Set 里的元素是不能重复的，那么用什么方法来区分重复与否呢? 是用 == 还是 equals()? 它们有何区别?

9. 两个对象值相同 (x.equals(y) == true)，但却可有不同的 hash code，这句话对不对?

10. heap 和 stack 有什么区别。

11. Java 集合类框架的基本接口有哪些？

12. HashSet 和 TreeSet 有什么区别？

13. HashSet 的底层实现是什么?

14. LinkedHashMap 的实现原理?

15. 为什么集合类没有实现 Cloneable 和 Serializable 接口？

16. 什么是迭代器 (Iterator)？

17. Iterator 和 ListIterator 的区别是什么？

18. 数组 (Array) 和列表 (ArrayList) 有什么区别？什么时候应该使用 Array 而不是 ArrayList？

19. Java 集合类框架的最佳实践有哪些？

20. Set 里的元素是不能重复的，那么用什么方法来区分重复与否呢？是用 == 还是 equals()？它们有何区别？

21. Comparable 和 Comparator 接口是干什么的？列出它们的区别

22. Collection 和 Collections 的区别。


## JVM与调优21题

1. Java 类加载过程？

2. 描述一下 JVM 加载 Class 文件的原理机制?

3. Java 内存分配。

4. GC 是什么? 为什么要有 GC？

5. 简述 Java 垃圾回收机制

6. 如何判断一个对象是否存活？（或者 GC 对象的判定方法）

7. 垃圾回收的优点和原理。并考虑 2 种回收机制

8. 垃圾回收器的基本原理是什么？垃圾回收器可以马上回收内存吗？有什么办法主动通知虚拟机进行垃圾回收？

9. Java 中会存在内存泄漏吗，请简单描述

10. 深拷贝和浅拷贝。

11. System.gc() 和 Runtime.gc() 会做什么事情？

12. finalize() 方法什么时候被调用？析构函数 (finalization) 的目的是什么？

13. 如果对象的引用被置为 null，垃圾收集器是否会立即释放对象占用的内存？

14. 什么是分布式垃圾回收（DGC）？它是如何工作的？

15. 串行（serial）收集器和吞吐量（throughput）收集器的区别是什么？

16. 在 Java 中，对象什么时候可以被垃圾回收？

17. 简述 Java 内存分配与回收策率以及 Minor GC 和 Major GC。

18. JVM 的永久代中会发生垃圾回收么？

19. Java 中垃圾收集的方法有哪些？

20. 什么是类加载器，类加载器有哪些？

21. 类加载器双亲委派模型机制？


## 并发编程28题

1. Synchronized 用过吗，其原理是什么？

2. 你刚才提到获取对象的锁，这个“锁”到底是什么？如何确定对象的锁？

3. 什么是可重入性，为什么说 Synchronized 是可重入锁？

4. JVM 对 Java 的原生锁做了哪些优化？48
 
5. 为什么说 Synchronized 是非公平锁？49

6. 什么是锁消除和锁粗化？49

7. 为什么说 Synchronized 是一个悲观锁？乐观锁的实现原理又是什么？什么是 CAS，它有什么特性？

8. 乐观锁一定就是好的吗？

9. 跟 Synchronized 相比，可重入锁 ReentrantLock 其实现原理有什么不同？

10. 那么请谈谈 AQS 框架是怎么回事儿？

11. 请尽可能详尽地对比下 Synchronized 和 ReentrantLock 的异同。

12. ReentrantLock 是如何实现可重入性的？

13. 除了 ReetrantLock，你还接触过 JUC 中的哪些并发工具？

14. 请谈谈 ReadWriteLock 和 StampedLock。

15. 如何让 Java 的线程彼此同步？你了解过哪些同步器？请分别介绍下。

16. CyclicBarrier 和 CountDownLatch 看起来很相似，请对比下呢？

17. Java 线程池相关问题

18. Java 中的线程池是如何实现的？

19. 创建线程池的几个核心构造参数？

20. 线程池中的线程是怎么创建的？是一开始就随着线程池的启动创建好的吗？

21. 既然提到可以通过配置不同参数创建出不同的线程池，那么 Java 中默认实现好的线程池又有哪些呢？请比较它们的异同

22. 如何在 Java 线程池中提交线程？

23. 什么是 Java 的内存模型，Java 中各个线程是怎么彼此看到对方的变量的？

24. 请谈谈 volatile 有什么特点，为什么它能保证变量对所有线程的可见性？

25. 既然 volatile 能够保证线程间的变量可见性，是不是就意味着基于 volatile 变量的运算就是并发安全的？

26. 请对比下 volatile 对比 Synchronized 的异同。

27. 请谈谈 ThreadLocal 是怎么解决并发安全的？

28. 很多人都说要慎用 ThreadLocal，谈谈你的理解，使用 ThreadLocal 需要注意些什么？


## spring 25题

1. 什么是 Spring 框架？Spring 框架有哪些主要模块？

2. 使用 Spring 框架能带来哪些好处？

3. 什么是控制反转(IOC)？什么是依赖注入？

4. 请解释下 Spring 框架中的 IoC？

5. BeanFactory 和 ApplicationContext 有什么区别？

6. Spring 有几种配置方式？

7. 如何用基于 XML 配置的方式配置 Spring？

8. 如何用基于 Java 配置的方式配置 Spring？

9. 怎样用注解的方式配置 Spring？

10. 请解释 Spring Bean 的生命周期？

11. Spring Bean 的作用域之间有什么区别？

12. 什么是 Spring inner beans？

13. Spring 框架中的单例 Beans 是线程安全的么？

14. 请举例说明如何在 Spring 中注入一个 Java Collection？

15. 如何向 Spring Bean 中注入一个 Java.util.Properties？

16. 请解释 Spring Bean 的自动装配？

17. 请解释自动装配模式的区别？

18. 如何开启基于注解的自动装配？

19. 请举例解释@Required 注解？

20. 请举例解释@Autowired 注解？

21. 请举例说明@Qualifier 注解？

22. 构造方法注入和设值注入有什么区别？

23. Spring 框架中有哪些不同类型的事件？

24. FileSystemResource 和 ClassPathResource 有何区别？

25. Spring 框架中都用到了哪些设计模式？


## 设计模式 10题

1. 请列举出在 JDK 中几个常用的设计模式？

2. 什么是设计模式？你是否在你的代码里面使用过任何设计模式？

3. Java 中什么叫单例设计模式？请用 Java 写出线程安全的单例模式

4. 在 Java 中，什么叫观察者设计模式（observer design pattern）？

5. 使用工厂模式最主要的好处是什么？在哪里使用？

6. 举一个用 Java 实现的装饰模式(decorator design pattern)？它是作用于对象层次还是类

层次？

7. 在 Java 中，为什么不允许从静态方法中访问非静态变量？

8. 设计一个 ATM 机，请说出你的设计思路？

9. 在 Java 中，什么时候用重载，什么时候用重写？

10. 举例说明什么情况下会更倾向于使用抽象类而不是接口


## SpringBoot 22题

1. 什么是 Spring Boot？

2. Spring Boot 有哪些优点？

3. 什么是 JavaConfig？

4. 如何重新加载 Spring Boot 上的更改，而无需重新启动服务器？

5. Spring Boot 中的监视器是什么？

6. 如何在 Spring Boot 中禁用 Actuator 端点安全性？

7. 如何在自定义端口上运行 Spring Boot 应用程序？

8. 什么是 YAML？

9. 如何实现 Spring Boot 应用程序的安全性？

10. 如何集成 Spring Boot 和 ActiveMQ？

11. 如何使用 Spring Boot 实现分页和排序？

12. 什么是 Swagger？你用 Spring Boot 实现了它吗？

13. 什么是 Spring Profiles？

14. 什么是 Spring Batch？

15. 什么是 FreeMarker 模板？

16. 如何使用 Spring Boot 实现异常处理？

17. 您使用了哪些 starter maven 依赖项？

18. 什么是 CSRF 攻击？

19. 什么是 WebSockets？

20. 什么是 AOP？

21. 什么是 Apache Kafka？

22. 我们如何监视所有 Spring Boot 微服务？


## Netty10题

1. BIO、NIO和AIO的区别？

2. NIO的组成？

3. Netty的特点？

4. Netty的线程模型？

5. TCP 粘包/拆包的原因及解决方法？

6. 了解哪几种序列化协议？

7. 如何选择序列化协议？

8. Netty的零拷贝实现？

9. Netty的高性能表现在哪些方面？

10. NIOEventLoopGroup源码？


## Redis 16题

1. 什么是redis?

2. Reids的特点

4. Redis支持的数据类型

5. Redis是单进程单线程的

6. 虚拟内存

7. Redis锁

8. 读写分离模型

9. 数据分片模型

10. Redis的回收策略

11. 使用Redis有哪些好处？

12. redis相比memcached有哪些优势？

13. redis常见性能问题和解决方案

14. MySQL里有2000w数据，redis中只存20w的数据，如何保证redis中的数据都是热点数据245

15. Memcache与Redis的区别都有哪些？

16. Redis 常见的性能问题都有哪些？如何解决？

17. Redis 最适合的场景

# 解析

## Java集合22题

### <p id="1.1">1、ArrayList 和 Vector 的区别。</p>

| ArrayList  | Vector |
|-------|-------|
| 1、实现原理：采用动态对象数组实现，默认构造方法创建了一个空数组 | 1、实现原理：采用动态数组实现，默认构造创建了一个大小为10的对象数组 |
| 2、第一次添加元素，扩展容量为10，之后的扩充算法：原来数组大小+原来数组的一半 | 2、扩充的算法：当增量为0时，扩充为原来大小的2倍，当增量大于0时，扩充为原来大小+增量 |
| 3、不适合进行删除或插入操作 | 3、不适合删除或插入操作 |
| 4、为了防止数组动态扩充次数过多，建议创建ArrayList时，给定初始容量 | 4、为了防止数组动态扩充次数过多，建议创建Vector时，给定初始容量 |
| 5、多线程中使用不安全，适合在单线程访问时使用，效率较高 | 5、线程安全，适合在多线程访问时使用，效率较低 |

### <p id="1.2">2、说说 ArrayList，Vector， LinkedList 的存储性能和特性。</p>

ArrayList 采用的是数组形式来保存对象的，这种方式将对象放在连续的位置中，所以最大的缺点就是插入删除时非常麻烦。

LinkedList 采用的将对象存放在独立的空间中，而且在每个空间中还保存下一个链接的索引，但是缺点就是查找非常麻烦，要丛第一个索引开始。

ArrayList 和 Vector 都是用数组方式存储数据，此数组元素数要大于实际的存储空间以便进行元素增加和插入操作，他们都允许直接用序号索引元素，但是插入数据元素涉及到元素移动等内存操作，所以索引数据快而插入数据慢。

Vector 使用了 synchronized 方法(线程安全)，因此 Vector 是线程安全的容器，但性能上比 ArrayList 要差些。（Vector 是 Java 中的遗留容器）

LinkedList 使用双向链表方式存储数据（将内存中零散的内存单元通过附加的引用关联起来，形成一个可以按序号索引的线性结构，这种链式存储方式与数组的连续存储方式相比，内存的利用率更高），按序号索引数据需要前向或后向遍历数据，所以索引数据慢，是插入数据时只需要记录前后项即可，所以插入的速度快。

### <p id="1.3">3、快速失败（fail-fast）和安全失败（fail-safe）的区别是什么？</p>

**▌快速失败（fail-fast）**

在使用迭代器对集合对象进行遍历的时候，如果 A 线程正在对集合进行遍历，此时 B 线程对集合进行修改（增加、删除、修改），或者 A 线程在遍历过程中对集合进行修改，都会导致 A 线程抛出 ConcurrentModificationException 异常。

**▌安全失败（fail-safe）**

采用安全失败机制的集合容器，在遍历时不是直接在集合内容上访问的，而是先复制原有集合内容，在拷贝的集合上进行遍历。

由于迭代时是对原集合的拷贝进行遍历，所以在遍历过程中对原集合所作的修改并不能被迭代器检测到，故不会抛 ConcurrentModificationException 异常。

**▌区别**

Iterator 的安全失败是基于对底层集合做拷贝，因此，它不受源集合上修改的影响。

java.util 包下面的所有的集合类都是快速失败的，而java.util.concurrent 包下面的所有的类都是安全失败的。

快速失败的迭代器会抛出 ConcurrentModificationException 异常，而安全失败的迭代器永远不会抛出这样的异常。

**▌总结**

快速失败是对遍历集合的一种检查机制（只能被用来检测错误，因为 JDK 并不保证 fail-fast 机制一定会发生），如果要求数据保持最新，避免遍历被修改后的数据，快速失败可以直接中断抛出异常。

安全失败就是对于数据实时性要求不高而采用的一种机制，不管在多线程时如何修改我遍历的都是复印件，并且不抛出异常。

若在多线程环境下使用fail-fast机制的集合，建议使用“java.util.concurrent 包下的类”去取代“java.util 包下的类”。

### <p id="1.4">4、HashMap 的数据结构。</p>

**HashMap的底层实现**

**JDK1.8之前**

JDK1.8之前HashMap的底层是 **数组和链表** 结合在一起使用也就是 链表散列。

HashMap通过key的HashCode经过扰动函数处理后得到Hash值，然后通过（n-1）& Hash判断当前元素存放的位置（这里n指的是数组的长度），如果当前位置存在元素的话，就判断元素与要存入的元素的hash值以及key是否相同，如果相同的话，直接覆盖，不相同就通过拉链法解决冲突。

所谓扰动函数指的就是HashMap的hahs方法。

使用hahs方法也就是扰动函数是为了防止一些实现较差的 hashCode（）方法，换句话说就是使用扰动函数之后可以减少碰撞。

JDK1.8HashMap的hash源码：
```java
static final int hash(Object key) {
    int h;
    // key.hashCode()：返回散列值也就是hashcode
    // ^ ：按位异或
    // >>>:无符号右移，忽略符号位，空位都以0补齐
    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
}
```
JDK1.8的hash方法相比于JDK1.7hash方法更加简化，但是原理不变。
对比一下JDK1.7的HashMap的hash方法源码：
```java
static int hash(int h) {
    // This function ensures that hashCodes that differ only by
    // constant multiples at each bit position have a bounded
    // number of collisions (approximately 8 at default load factor).

    h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);
}
```
相比于JDK1.8的hash方法，JDK1.7的hash方法的性能会少差一点点，因为毕竟扰动了4次。

所谓“拉链法”就是：将链表和数组相结合。也就是说创建一个链表数组，数组中每一格就是一个链表。若遇到哈希冲突，则将冲突的值加到链表中即可。

![1.7HashMap数据结构演示图](https://mmbiz.qpic.cn/mmbiz_png/ABIWtj6YasQXzyRD5vxDpofr6eKevUxYUvia1ribkJKBo5msWTzUAZgrDcibA2gyUKqpOiaucLIvKxzzPQrf4aH26A/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

**JDK1.8之后**
相比于之前的版本，JDK1.8之后在解决哈希冲突时有了较大的变化，当链表长度大于阈（yu四声）值（默认为8）时，将链表转换为红黑树，以减少搜索时间。

![1.8HashMap数据结构演示图](https://mmbiz.qpic.cn/mmbiz_png/ABIWtj6YasQXzyRD5vxDpofr6eKevUxYUQpxaamTYUBUO77RjMavbVEUfCo8fzrRuVSicFrydHiaMFm4v3EIKbMw/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

> TreeMap、TreeSet以及JDK1.8之后的HashMap底层都用了红黑树。红黑树就是为了解决二叉查找树的缺陷，因为二叉查找树在某些情况下会退化成一个线程结构。




**1.8之后**
关键字：数组+链表+红黑树（超过8个节点会转换为红黑树）

### <p id="1.5">HashMap的工作原理是什么？</p>

### <p id="1.6">HashMap什么时候进行扩容呢？</p>

### <p id="1.7">List、Map、Set三个接口，存取元素时，各有什么特点？</p>




