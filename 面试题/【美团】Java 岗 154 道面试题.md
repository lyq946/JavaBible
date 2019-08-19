# 目录

## Java集合22题

1. <a href="#1.1">ArrayList 和 Vector 的区别。</a>

2. <a href="#1.2">说说 ArrayList，Vector，LinkedList 的存储性能和特性。</a>

3. <a href="#1.3">快速失败 (fail-fast) 和安全失败 (fail-safe) 的区别是什么？</a>

4. <a href="#1.4">HashMap 的数据结构。</a>

5. <a href="#1.5">HashMap 的工作原理是什么？</a>

6. <a href="#1.6">Hashmap 什么时候进行扩容呢？</a>

7. <a href="#1.7">List、Map、Set 三个接口，存取元素时，各有什么特点？</a>

8. <a href="#1.8">Set 里的元素是不能重复的，那么用什么方法来区分重复与否呢？ 是用 == 还是 equals()? 它们有何区别？</a>

9. <a href="#1.9">两个对象值相同 (x.equals(y) == true)，但却可有不同的 hash code，这句话对不对？</a>

10. <a href="#1.10">Heap 和 Stack 有什么区别。</a>

11. <a href="#1.11">Java 集合类框架的基本接口有哪些？</a>

12. <a href="#1.12">HashSet 和 TreeSet 有什么区别？</a>

13. <a href="#1.13">HashSet 的底层实现是什么？</a>

14. <a href="#1.14">LinkedHashMap 的实现原理？</a>

15. <a href="#1.15">为什么集合类没有实现 Cloneable 和 Serializable 接口？</a>

16. <a href="#1.16">什么是迭代器 (Iterator)？</a>

17. <a href="#1.17">Iterator 和 ListIterator 的区别是什么？</a>

18. <a href="#1.18">数组 (Array) 和列表 (ArrayList) 有什么区别？什么时候应该使用 Array 而不是 ArrayList？</a>

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
| 1、实现原理：采用动态对象数组实现，默认构造方法创建了一个空数组 | 1、实现原理：采用动态对象数组实现，默认构造创建了一个大小为10的对象数组 |
| 2、第一次添加元素，扩展容量为 10，之后的扩充算法：原来数组大小+原来数组的一半 | 2、扩充的算法：当增量为0时，扩充为原来大小的 2 倍，当增量大于 0 时，扩充为原来大小+增量 |
| 3、不适合进行删除或插入操作 | 3、不适合删除或插入操作 |
| 4、为了防止数组动态扩充次数过多，建议创建 ArrayList 时，给定初始容量 | 4、为了防止数组动态扩充次数过多，建议创建 Vector 时，给定初始容量 |
| 5、多线程中使用不安全，适合在单线程访问时使用，效率较高 | 5、线程安全，适合在多线程访问时使用，效率较低 |


### <p id="1.2">2、说说 ArrayList，Vector， LinkedList 的存储性能和特性。</p>

ArrayList 采用的是数组形式来保存对象的，这种方式将对象放在连续的位置中，所以最大的缺点就是插入删除时非常麻烦。

LinkedList 采用的将对象存放在独立的空间中，而且在每个空间中还保存下一个链接的索引，但是缺点就是查找非常麻烦，要丛第一个索引开始。

ArrayList 和 Vector 都是用数组方式存储数据，此数组元素数要大于实际的存储空间以便进行元素增加和插入操作，他们都允许直接用序号索引元素，但是插入数据元素涉及到元素移动等内存操作，所以索引数据快而插入数据慢。

Vector 使用了 synchronized 方法(线程安全)，因此 Vector 是线程安全的容器，但性能上比 ArrayList 要差些。（Vector 是 Java 中的遗留容器）

LinkedList 使用双向链表方式存储数据（将内存中零散的内存单元通过附加的引用关联起来，形成一个可以按序号索引的线性结构，这种链式存储方式与数组的连续存储方式相比，内存的利用率更高），按序号索引数据需要前向或后向遍历数据，所以索引数据慢，插入数据时只需要记录前后项即可，所以插入的速度快。


### <p id="1.3">3、快速失败（fail-fast）和安全失败（fail-safe）的区别是什么？</p>

**快速失败（fail-fast）**

在使用迭代器对集合对象进行遍历的时候，如果 A 线程正在对集合进行遍历，此时 B 线程对集合进行修改（增加、删除、修改），或者 A 线程在遍历过程中对集合进行修改，都会导致 A 线程抛出 ConcurrentModificationException 异常。

**安全失败（fail-safe）**

采用安全失败机制的集合容器，在遍历时不是直接在集合内容上访问的，而是先复制原有集合内容，在拷贝的集合上进行遍历。

由于迭代时是对原集合的拷贝进行遍历，所以在遍历过程中对原集合所作的修改并不能被迭代器检测到，故不会抛 ConcurrentModificationException 异常。

**区别**

Iterator 的安全失败是基于对底层集合做拷贝，因此，它不受源集合上修改的影响。

java.util 包下面的所有的集合类都是快速失败的，而 java.util.concurrent 包下面的所有的类都是安全失败的。

快速失败的迭代器会抛出 ConcurrentModificationException 异常，而安全失败的迭代器永远不会抛出这样的异常。


### <p id="1.4">4、HashMap 的数据结构。</p>

**HashMap 的底层实现**

**JDK1.8 之前**

JDK1.8 之前 HashMap 的底层是 **数组和链表** 结合在一起使用也就是 链表散列。

HashMap 通过 key 的 HashCode 经过扰动函数处理后得到 hash 值，然后通过（n-1）& hash 判断当前元素存放的位置（这里 n 指的是数组的长度），如果当前位置存在元素的话，就判断元素与要存入的元素的 hash 值以及 key 是否相同，如果相同的话，直接覆盖，不相同就通过拉链法解决冲突。

所谓扰动函数指的就是 HashMap 的 hash 方法。

使用 hash 方法也就是扰动函数是为了防止一些实现较差的 hashCode（）方法，换句话说就是使用扰动函数之后可以减少碰撞。

JDK1.8 HashMa p的 hash 源码：

```java
static final int hash(Object key) {
    int h;
    // key.hashCode()：返回散列值也就是hashcode
    // ^ ：按位异或
    // >>>:无符号右移，忽略符号位，空位都以0补齐
    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
}
```

JDK1.8 的 hash 方法相比于 JDK1.7 hash 方法更加简化，但是原理不变。

对比一下 JDK1.7 的 HashMap 的 hash 方法源码：

```java
static int hash(int h) {
    // This function ensures that hashCodes that differ only by
    // constant multiples at each bit position have a bounded
    // number of collisions (approximately 8 at default load factor).

    h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);
}
```

相比于 JDK1.8 的 hash 方法，JDK1.7 的 hash 方法的性能会少差一点点，因为毕竟扰动了 4 次。

所谓“拉链法”就是：将链表和数组相结合。也就是说创建一个链表数组，数组中每一格就是一个链表。若遇到哈希冲突，则将冲突的值加到链表中即可。

![1.7HashMap 数据结构演示图](https://mmbiz.qpic.cn/mmbiz_png/ABIWtj6YasQXzyRD5vxDpofr6eKevUxYUvia1ribkJKBo5msWTzUAZgrDcibA2gyUKqpOiaucLIvKxzzPQrf4aH26A/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

**JDK1.8 之后**
相比于之前的版本，JDK1.8 之后在解决哈希冲突时有了较大的变化，当链表长度大于阈（yu 四声）值（默认为 8）时，将链表转换为红黑树，以减少搜索时间。

![1.8HashMap 数据结构演示图](https://mmbiz.qpic.cn/mmbiz_png/ABIWtj6YasQXzyRD5vxDpofr6eKevUxYUQpxaamTYUBUO77RjMavbVEUfCo8fzrRuVSicFrydHiaMFm4v3EIKbMw/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

> TreeMap、TreeSet 以及 JDK1.8 之后的 HashMap 底层都用了红黑树。红黑树就是为了解决二叉查找树的缺陷，因为二叉查找树在某些情况下会退化成一个线程结构。


### <p id="1.5">HashMap 的工作原理是什么？</p>

HashMap 是基于 Hashing（散列法）的原理，以键值对（key-value）的形式存储元素的，我们使用put（key, value）存储对象到HashMap中，使用 get（key）从 HashMap 中获取对象。 

mark：**HashMap 的键值对也叫作 Entry，而每个 Entry 都是存储在数组当中，因此这个数组就是 HashMap 的主干。**

它需要一个 hash 函数，使用 HashCode() 和 equals() 方法来向集合/从集合添加和检索元素。

它需要一个 hash 函数，使用 hashCode() 和 equals() 方法来向集合/从集合添加和检索元素。

当调用 put() 方法的时候，HashMap会计算 key 的 hash 值，然后把键值对存储在集合中合适的索引上。如果 key 已经存在了，value 会被更新成新值。

HashMap 数组中的每一个元素的初始值都是 NULL。

![HashMap 底层图](https://mmbiz.qpic.cn/mmbiz_png/ABIWtj6YasQXzyRD5vxDpofr6eKevUxY6VqqnKiaPFzAY7lzTR0ibJ0ZYH8FBgaJibvkZuLje5R02tfkycx9hBCSQ/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

HashMap 的一些重要的特性是它的容量(capacity)，负载因子(load factor)和扩容极限(threshold resizing)。

**1、Put 方法的实现原理**

HaspMap 的一种重要的方法是 put() 方法，当我们调用 put() 方法时，比如 hashMap.put("Java",0)，此时要插入一个 Key 值为“Java”的元素，这时首先需要一个 Hash 函数来确定这个 Entry 的插入位置，设为 index，即 index = hash("Java")，假设求出的 index 值为 2，那么这个 Entry 就会插入到数组索引为 2 的位置。

![HashMap底层实现图](https://mmbiz.qpic.cn/mmbiz_png/ABIWtj6YasQXzyRD5vxDpofr6eKevUxYwhC0MG4ffIuQyDrTGD3DQicjJSA7stCs5dibictrrdKSQz4K0cyJJXLEA/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

但是 HaspMap 的长度肯定是有限的，当插入的 Entry 越来越多时，不同的 Key 值通过哈希函数算出来的 index 值肯定会有冲突，此时就可以利用链表来解决。

其实HaspMap数组的每一个元素不止是一个 Entry 对象，也是一个链表的头节点，每一个 Entry 对象通过 Next 指针指向下一个 Entry 对象，这样，当新的 Entry 的 hash 值与之前的存在冲突时，只需要插入到对应点链表即可。

![HashMap 底层实现](https://mmbiz.qpic.cn/mmbiz_png/ABIWtj6YasQXzyRD5vxDpofr6eKevUxYK3mAjodJUHmppFic15HKss9mg2BpLNRvR001PiaPyiaRvbpBpKVKfSMkA/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

需要注意的是，新来的 Entry 节点采用的是“头插法”，而不是直接插入在链表的尾部，这是因为 HashMap 的发明者认为，新插入的节点被查找的可能性更大。

**2、Get 方法的实现原理**

get() 方法用来根据 Key 值来查找对应点 Value，当调用 get() 方法时，比如 hashMap.get("apple")，这时同样要对 Key 值做一次 Hash 映射，算出其对应的 index 值，即 index = hash("apple")。

前面说到的可能存在 Hash 冲突，同一个位置可能存在多个 Entry，这时就要从对应链表的头节点开始，一个个向下查找，直到找到对应的 Key 值，这样就获得到了所要查找的键值对。

例如假设我们要找的 Key 值是"apple"：

![HashMap 底层实现](https://mmbiz.qpic.cn/mmbiz_png/ABIWtj6YasQXzyRD5vxDpofr6eKevUxYIqoia9pPQUB85E9UYA75j9vHIL2OGVg6qTN3EyaxCdL6nABWbs74tEw/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

第一步，算出 Key值“apple”的 hash 值，假设为 2。

第二步，在数组中查找索引为2的位置，此时找到头节点为 Entry6，Entry6 的 Key 值是 banana，不是我们要找的值。

第三步，查找 Entry6 的 Next 节点，这里为 Entry1，它的 Key 值为 apple，是我们要查找的值，这样就找到了对应的键值对，结束。


### <p id="1.6">HashMap 什么时候进行扩容呢？</p>

当 HashMap 中的元素个数超过 数组大小 * loadFactor 时，就会进行数组扩容，loadFactor 的默认值为 0.75。

也就是说，默认情况下，数组大小为 16，那么当 HashMap 中元素个数超过 16*0.75=12 的时候，就把数组的大小扩展为 2*16=32，即扩大一倍。

然后重新计算每个元素在数组中的位置，而这是一个非常消耗性能的操作，所以如果我们已经预知 HashMap 中元素的个数，那么预设元素的个数能够有效的提高 HashMap 的性能。

比如说，我们有 1000 个元素 new HashMap(1000)，但是理论上来讲 new HashMap(1024) 更合适，不过上面已经说过，即使是 1000，HashMap 也自动会将其设置为 1024。

但是 new HashMap(1024) 还不是更合适的，因为 0.75*1000 < 1000，也就是说为了让 0.75 * size > 1000，我们必须这样 new HashMap(2048) 才最合适，既考虑了 & 的问题，也避免了 resize 的问题。

**resize：原数组中的数据必须重新计算其在新数组中的位置，并放进去，这就是 resize**


### <p id="1.7">List、Map、Set 三个接口，存取元素时，各有什么特点？</p>

List 与 Set 都是单列元素的集合，它们有一个功共同的父接口 Collection。

**Set 里面不允许有重复的元素**

存元素：add 方法有一个 boolean 的返回值，当集合中没有某个元素，此时add方法可成功加入该元素时，则返回 true；当集合含有与某个元素 equals 相等的元素时，此时 add 方法无法加入该元素，返回结果为 false。

取元素：没法说取第几个，只能以 Iterator 接口取得所有的元素，再逐一遍历各个元素。

**List 表示有先后顺序的集合**

存元素：多次调用 add(Object) 方法时，每次加入的对象按先来后到的顺序排序，也可以插队，即调用 add(int index,Object) 方法，就可以指定当前对象在集合中的存放位置。

取元素：

1. Iterator 接口取得所有，逐一遍历各个元素。

2. 调用 get(index i) 来明确说明取第几个。

**Map 是双列的集合**

存放用 put 方法：put(obj key，obj value)，每次存储时，要存储一对 key/value，不能存储重复的 key，这个重复的规则也是按 equals 比较相等。

取元素：

1. 用 get(Object key) 方法根据 key 获得相应的 value。

2. 也可以获得所有的 key 的集合，还可以获得所有的 value 的集合。

3. 还可以获得key和value组合成的 Map.Entry 对象的集合。


* List 以特定次序来持有元素，可有重复元素。

* Set 无法拥有重复元素，内部排序。

* Map 保存 key-value 值，value 可多值。


### <p id="1.8">Set 里的元素是不能重复的，那么用什么方法来区分重复与否呢？是用 == 还是 equals()？它们有何区别？</p>

Set 里的元素是不能重复的，元素重复与否是使用 equals() 方法进行判断的。

equals() 和 == 方法决定引用值是否指向同一对象，equals() 在类中被覆盖，为的是当两个分离的对象的内容和类型相配的话，返回真值。

**equals（）和 == 的区别**

== 操作符专门用来比较两个变量的值是否相等，也就是用于比较变量所对应的内存中所存储的数值是否相同，要比较两个基本类型的数据或两个引用变量是否相等，只能用 == 操作符。

如果一个变量指向的数据是对象类型的，那么，这时候涉及了两块内存， 对象本身占用一块内存（堆内存），变量也占用一块内存。

例如 Objet obj = new Object()；变量 obj 是一个内存，new Object()是另一个内存，此时，变量 obj 所对应的内存中存储的数值就是对象占用的那块内存的首地址。

对于指向对象类型的变量，如果要比较两个变量是否指向同一个对象，即要看这两个变量所对应的内存中的数值是否相等，这时候就需要用==操作符进行比较。

equals 方法是用于比较两个独立对象的内容是否相同，就好比去比较两个人的长相是否相同，它比较的两个对象是独立的。

**总结**

**==**

基本类型：比较的是值是否相同

引用类型：比较的是地址值是否相同

**equals（）**

引用类型：默认情况下，比较的是地址值，可进行重写，比较的是对象的成员变量值是否相同。


### <p id="1.9">9、两个对象值相同（x.equals(y) == true），但却可有不同的 hash code，这句话对不对？</p>

不对，如果两个对象 x 和 y 满足 x.equals(y) == true，它们的哈希码（hashCode）应当相同。

Java 对于 equals 方法和 hashCode 方法是这样规定的：

1）如果两个对象相同（equals 方法返回 true），那么它们的 hashCode 值一定要相同；

2）如果两个对象的 hashCode 相同，它们并不一定相同。

当然，你未必要按照要求去做，但是如果你违背了上述原则就会发现在使用容器时，相同的对象可以出现在 Set 集合中，同时增加新元素的效率也会大大下降（对于是哟个哈希存储的系统，如果哈希码频繁的冲突将会造成存取性能极具下降）。

首先 equals 方法必须满足：

+ 自反性（x.equals(x) 必须返回 true）
+ 对称性（x.equals(y) 返回 true 时，y.equals(x) 也必须返回 true）
+ 传递性（x.equals(y) 和 y.equals(z) 都返回 true 时，x.equals(z) 也必须返回 true）
+ 一致性（当 x 和 y 引用的对象信息没有被修改时，多次调用 x.equals(y)应该得到同样的返回值），而且对于任何非 null 值得引用 x，x.equals(null)必须返回false。

实现高质量得 equals 方法得诀窍包括：

1. 使用 == 操作符检查 “参数是否为这个对象得引用”；

2. 使用 instanceof 操作符检查 “参数是否为正确得类型”；

3. 对于类中得关键属性，检查参数传入对象的属性是否与之相匹配；

4. 编写完 equals 方法后，问自己它是否满足对称性、传递性、一致性；

5. 重写 equals 时总是要重写 hashCode；

6. 不要将 equals 方法参数中的 Object 对象替换为其他的类型，在重写时不要忘记 @Override 注解。


### <p id="1.10">10、Heap 和 Stack 有什么区别</p>

**堆栈的概念：堆栈是两种数据结构。**

堆栈都是一种数据项按序排列的数据结构，只能在一端（称为栈顶（top））对数据项进行插入和删除。

在单片机应用中，堆栈是个特殊的存储区，主要功能是暂时存放数据和地址，通常用来保护断点和现场。

要点：

+ 堆，队列优先，先进先出（FIFO - first in first out）。

+ 栈，先进后出（FILO - first in last out）。

**Java中栈和堆的区别**

栈(stack)与堆(heap)都是Java用来在Ram中存放数据的地方。与C++不同，Java自动管理栈和堆，程序员不能直接地设置栈或堆。 

在函数中定义的一些基本类型的变量和对象的引用变量都在函数的栈内存中分配。

当在一段代码块定义一个变量时，Java就在栈中为这个变量分配内存空间，当超过变量的作用域后，Java会自动释放掉为该变量所分配的内存空间，该内存空间可以立即被另作他用。 

堆内存用来存放由new创建的对象和数组，在堆中分配的内存，由Java虚拟机的自动垃圾回收器来管理。

在堆中产生了一个数组或对象后，还可以在栈中定义一个特殊的变量，让栈中这个变量的取值等于数组或对象在堆内存中的首地址，栈中的这个变量就成了数组或对象的引用变量。

引用变量就相当于是为数组或对象起的一个名称，以后就可以在程序中使用栈中的引用变量来访问堆中的数组或对象。 


### <p id="1.11">Java 集合类框架的基本接口有哪些？</p>

总共有两大接口：Collection 和Map ，一个元素集合，一个是键值对集合；

其中List和Set接口继承了Collection接口，一个是有序元素集合，一个是无序元素集合； 

而ArrayList和 LinkedList 实现了List接口，HashSet实现了Set接口，这几个都比较常用； 

HashMap 和HashTable实现了Map接口，并且HashTable是线程安全的，但是HashMap性能更好；

Java集合类里最基本的接口有：

+ Collection：单列集合的根接口

+ List：元素有序  可重复 

+ ArrayList：类似一个长度可变的数组 。适合查询，不适合增删

+ LinkedList：底层是双向循环链表。适合增删，不适合查询。

+ Set：元素无序，不可重复

+ HashSet：根据对象的哈希值确定元素在集合中的位置

+ TreeSet: 以二叉树的方式存储元素，实现了对集合中的元素排序

+ Map：双列集合的根接口，用于存储具有键（key）、值（value）映射关系的元素。

+ HashMap：用于存储键值映射关系，不能出现重复的键key

+ TreeMap：用来存储键值映射关系，不能出现重复的键key，所有的键按照二叉树的方式排列
 

### <p id="1.12">12、HashSet 和 TreeSet 有什么区别？</p>

**相同点**：单例集合，数据不可重复

**不同点1**：底层使用的储存数据结构不同：

1、Hashset底层使用的是HashMap哈希表结构储存

2、而Treeset底层用的是TreeMap树结构储存。

**不同点2**：储存的数据保存唯一方式不用。

1、Hashset是通过复写hashCode()方法和equals()方法来保证的。

2、而Treeset是通过Compareable接口的compareto方法来保证的。

**不同点3**：hashset无序   Treeset有序

**储存原理**

hashset：底层数据结构是哈希表，本质就是哈希值储存。通过判断元素的hashcode方法和equals方法来保证元素的唯一性。当哈希值不同时就直接进行储存。如果相同，会判断一次equals方式是否返回为true ，如果是true 则视为用的同一个元素，不用再储存。如果是false，这俄格相同哈希值不同内容的元素会放在同一个桶里（当哈希表中有一个桶结构，每一个捅都有一个哈希值）。

Treeset：底层数据结构式一个二叉树，可以对set集合中的元素进行排序，这种结构，可以提高排序性能。根据比较方法的返回值决定的，只要返回的是0，就代表元素重复。


### <p id="1.13">13、HashSet 的底层实现是什么？</p>

众所周知，HashSet 里面存储的元素都具有无序性，标识唯一性，HashSet 里面大多数的内容都是在 HashMap 的基础上进行修改的。

![HashSet源码](https://mmbiz.qpic.cn/mmbiz_png/ABIWtj6YasS8ZKbnvGm61XaWOyWZpxn9ZOibhOr3W0mD27BURnSicQLcibWXhiaEwlrF6lsS6NJqvHiaZvxIiaVlVYDw/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

上图可以看出，HashSet 是通过将相应的内容存储在了一个 HashMap 里的 key 中，然后再去读取的。

为了保证 HashSet 里面的数据唯一性，这里将 HashSet 存放的元素作为了 HashMap 里面唯一的 Key 变量，value 部分用了一个 PERSENT 对象来存储，也就是源码里面的这一句内容：

```java
private static final Object PRESENT = new Object();
```

其实 HashSet 底层的很多部分都是引用了 HashMap 来进行实现的。


### <p id="1.14">14、LinkedHashMap 的实现原理？</p>

LinkedHashMap 是 Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。此实现提供所有可选的映射操作，并允许使用 null 值和 null 键，但不保证映射的顺序，特别是它不保证该顺序恒久不变。

LinkedHashMap 实现与 HashMap 的不同之处在于，后者维护着一个运行于所有条目的双重链接列表。此链接列表定义了迭代顺序，该迭代顺序可以是插入顺序或者是访问顺序。

注意，此实现不是同步的。如果多个线程同时访问链接的哈希映射，而其中至少一个线程从结构上修改了该映射，则它必须保持外部同步。

对于 LinkedHashMap 而言，它继承与 HashMap、底层使用哈希表与双向链表来保存所有元素。其基本操作与父类 HashMap 相似，它通过重写父类相关的方法，来实现自己的链接列表特性。

来看一个简单的 LinkedHashMap 程序：

![LinkedHashMap程序](https://mmbiz.qpic.cn/mmbiz_png/ABIWtj6YasQ7x28FWiaVVTVV52xgrW2ibbPEGVFpQBTjduxPQt4f5CEAskBZ3v2VIGoGykEJpV07iamBzJIVnK4sw/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

运行结果是：

![运行结果](https://mmbiz.qpic.cn/mmbiz_png/ABIWtj6YasQ7x28FWiaVVTVV52xgrW2ibbSNBwQs8NXhXHaCj752HbQBYJf0hFMnxogib0XfgdFm0Q18wo20mEcNQ/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

我们可以观察到，和 HashMap 的运行结果不同，LinkedHashMap 的迭代输出的结果保持了插入顺序。

是什么样的结构使得 LinkedHashMap 具有如此特性呢？

我们还是一样的看看 LinkedHashMap 的内部结构，对它有一个感性的认识：

![LinkedHashMap 内部结构](https://mmbiz.qpic.cn/mmbiz_jpg/ABIWtj6YasQ7x28FWiaVVTVV52xgrW2ibbvuQESWAKua7PO3tlg07lOhfhF8K63Bv6Ban68TxzDqYEibbs0sicfYxA/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)


### <p id="1.15">15、为什么集合类没有实现 Cloneable 和 Serializable 接口？</p>

克隆（cloning）或者序列化（serialization）的语义和含义是跟具体的实现相关的。因此应该由集合类的具体实现类来决定如何被克隆或者序列化。

1）什么是克隆？

克隆是把一个对象里面的属性值，复制给另外一个对象，而不是对象引用的复制。

2）实现 Serializable 序列化的作用

1、将对象的状态保存在存储媒体中，以便在重写时创建出完全相同的副本

2、按值将对象从一个应用程序域发向另一个应用程序域

实现 Serializable 接口的作用就是可以把对象存到字节流，然后可以恢复。

所以对象没有序列化，怎么能在网络传输呢？**要网络传输就得转为字节流**，在分布式应用中，你就得实现序列化。如果不需要分布式引用，那就没必要实现序列化。


### <p id="1.16">16、什么是迭代器 (Iterator)？</p>

Iterator接口提供了很多对集合元素进行迭代的方法，每一个集合类都包括了可以返回迭代器实例的迭代方法。

迭代器可以在迭代过程中删除底层集合的元素，但是不可以直接调用集合的remove(Object obj)删除，可以通过迭代器的remove()方法删除。


### <p id="1.17">17、Iterator 和 ListIterator 的区别是什么？</p>

Iterator和ListIterator是Java三个游标中的两个，都是由Java.UTIL包中的集合框架定义的。

**Iterator是什么？**

Iterator代表迭代器，是Collection框架中的一个接口；用于遍历集合元素。

它允许逐个迭代集合中的每个元素，从集合中获取元素或从集合中删除元素；但无法使用Iterator修改集合中的任何元素。

Iterator有一个iterator()方法，它会将迭代器返回到集合的开头。一旦得到一个集合开头的迭代器，然后遍历集合中的元素，就建立一个循环，每次循环迭代时调用hasNext()。

hasNext()如果返回true，则表示集合中存在下一个元素；如果返回false，则表示遍历所有元素。然后在循环内部，可以使用next()获取集合中的每个元素。next()方法返回集合的下一个元素。

缺点：

●　使用Iterator，就只能向前移动集合。
●　使用Iterator，就无法操纵或修改集合中的元素。

**ListIterator是什么？**

ListIterator是Collection框架中的一个接口；是用于扩展Iterator接口的。

使用ListIterator，可以向前和向后遍历集合的元素。还可以添加、删除或修改集合中的任何元素。简而言之，我们可以说它消除了Iterator的缺点。

ListIterator的方法如下：

●　hasNext()：如果返回true，则确认集合中有更多元素。

●　next()：返回列表的下一个元素。

●　nextIndex()：返回列表中下一个元素的索引。

●　hasPrevious()：如果集合中有相反的元素，则返回true。

●　previous()：返回集合中的上一个元素。

●　previousIndex()：返回集合中上一个元素的索引。

●　remove()：从集合中删除元素。

●　set()：修改集合中的元素。

●　add()：在集合中添加新元素。


**Iterator和ListIterator之间的主要区别**

1、遍历

使用Iterator，可以遍历所有集合，如Map，List，Set；但只能在向前方向上遍历集合中的元素。

使用ListIterator，只能遍历List实现的对象，但可以向前和向后遍历集合中的元素。

2、添加元素

Iterator无法向集合中添加元素；而，ListIteror可以向集合添加元素。

3、修改元素

Iterator无法修改集合中的元素；而，ListIterator可以使用set()修改集合中的元素。

4、索引

Iterator无法获取集合中元素的索引；而，使用ListIterator，可以获取集合中元素的索引。


### <p id="1.18">18、数组 (Array) 和列表 (ArrayList) 有什么区别？什么时候应该使用 Array 而不是 ArrayList？</p>

**Array**：它是数组，申明数组的时候就要初始化并确定长度，长度不可变，而且它只能存储同一类型的数据，比如申明为String类型的数组，那么它只能存储S听类型数据。

**ArrayList**：它是一个集合，需要先申明，然后再添加数据，长度是根据内容的多少而改变的，ArrayList可以存放不同类型的数据，在存储基本类型数据的时候要使用基本数据类型的包装类。

**区别**：

当能确定长度并且数据类型一致的时候就可以用数组，其他时候使用ArrayList。



