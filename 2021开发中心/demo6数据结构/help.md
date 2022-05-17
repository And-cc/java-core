# Java数据结构和Map集合（量子编程老师笔记）

# 数据结构

> ```
> 数据结构的常用数据结构有：栈，数组，队列，链表，红黑树
> ```

## 栈(stack又称堆栈)

> 它是运算受限的运算表，其限制是仅允许在标的一端进行插入和删除操作，不允许在其他任何位置进行添加、查找、删除等操作

### 特点

> ```java
> 1.先进后出（弹夹）
> 2.栈的出入口都是栈的顶端位置
> ```

## 队列(queue，简称队)

> ```java
> 他跟堆栈一样，也是运算受限的运算表，其限制是仅允许在表的一端进行插入，而在表的另一端删除
> ```

### 特点

> ```java
> 1.先进先出（火车过山洞）
> 2.队列的入口、出口各占一侧
> ```

## 数组(Array)

> ```java
> 是有序的元素序列，数组是在内存中开辟一段连续的空间并再次空间存放元素
> ```

### 特点

> ```java
> 1.查询块
> 2.增删慢：每当更改内容，就会创建一个新的数组，把原数组改后的值赋予新数组
> ```

## 链表(LinkedList)

> ```java
> 由一系列结点node(链表中的每一个元素称为结点)组成，结点可以在运行时动态生成。
>                 [每个结点包括两个部分:1.存储数据元素的数据域2.存储下一个结点地址的指针域]
> ```

### 特点

> ```java
> 1.多个结点之间，通过地址进行链接（手拉手）
> 2.查询慢（链表中地址不是连续的，每次查询需要从头开始）
> 3.增删块
> ```

## 红黑树

> ```java
> 趋近于平衡树（左右相等，分支不超过2）查询叶子结点的最大次数和最小次数不超过两倍
> ```

### 特点

> ```java
> 1.查询速度非常块
> ```

# List接口

> ```java
> java.util.List:接口继承自Collection接口，是单列集合的一个重要分支，习惯性的会将实现了list接口的对象称为list集合
> 特点：
> 1.元素存取有序的集合
> 2.带索引，(可通过索引操作集合中的元素，与数组索引是一个道理)
> 3.集合中可以有重复的元素，(通过元素的equals方法，比较是否为重复的元素)
> list接口中带索引的方法（特有）：
> 1.public void add(int index,E element):将指定的元素，添加到该集合中指定位置上
> 2.public E get(int index):返回集合中指定位置的元素
> 3.public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素
> 4.public E set(int index,E element):用指定元素替换集合中指定位置的元素，返回值的更新前的元素
> ```

## ArrayList

> ```java
> java.util.ArrayList:集合数据存储的结构是数组结构
> ```

## LinkedList

> ```java
> java.util.LinkedList:集合数据存储的结构是链表结构，
> 
> 注意：使用linkedlist集合特有的方法不能使用多态
> 
>      void addFirst(E e)  在该列表开头插入指定的元素。
>      void addLast(E e)   将指定的元素追加到此列表的末尾。
>      void  push(E e)   将元素推送到由此列表表示的堆栈上。        ==void addFirst(E e)
> 
>      E    getFirst()     返回此列表中的第一个元素。
>      E    getLast()      返回此列表中的最后一个元素。
> 
>      E removeFirst()   从此列表中删除并返回第一个元素。
>      E removeLast()    从此列表中删除并返回最后一个元素。
>      E  pop()          从此列表表示的堆栈中弹出一个元素。         ==E  removeFirst()
> ```

## Vector

> ```java
> java.util.vector:Vector是同步的。 如果不需要线程安全的实现，建议使用ArrayList代替Vector 。
> ```

# Set接口

> ```java
> java.util.Set:extends Collection接口
>           特点:
>              1.不允许存储重复的元素
>              2.没有索引，没有带索引的方法，也不能通过普通的for循环遍历
> java.util.HashSet:implements set接口
>            特点:
>              1.不允许重复元素
>              2.没有索引，没有带索引的方法，也不能通过普通的for循环遍历
>              3.是一个无序的集合，存储元素的顺序和取出元素的顺序有可能不一致
>              4.底层是一个hash表结构（查询速度非常快）
> ```

## HashSet

> ```java
> 给Hashset中存放自定义类型元素时，需要对象的hashcode和equals方法，建立自己的比较方式，才能保证HashSet集合中对象唯一
> ```

## LinkedHashSet

> ```java
> java.util.linkedHashset：extends HashSet
>              特点：
>                1.底层是一个hash表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序）
> ```

# Map集合

> ```java
> Map<k,v>常用方法:
>             1. V   put(K key, V value)               :把指定的键与值添加到Map集合中
>             2. V   remove(Object key)         :把指定的键所对应的键值对元素在Map集合中删除，返                                                回被删除元素的值
>             3. V   get(Object key)                  :根据指定的键，在Map集合中获取对应的值
>             4. boolean  containsKey(Object key)    :判断集合中是否含有指定的键
>             5. Set<k> keySet()                     :获取map集合中所有的键，存储到set集合中
>             6. Set<Map.Entry<K,V>> entrySet()      :获取map集合中所有的键值对对象的集合（set                                                      集合）
> ```

> ```java
> java.util.Map<k,v> 集合：
>     特点:
>        1.map集合是一个双列集合，几个元素包含两个值（一个key，一个value）
>        2.map集合中的元素，key和value的数据类型可以不相同，也可以相同
>        3.map集合中的元素，key是不允许重复的，value是可以重复的
>        4.map集合中的元素，key和value是一一对应的
> 
> java.util.hashMap<k,v>集合 implement Map<k,v>接口：
>     特点:
>        1.HashMap集合底层是哈希表，查询速度块
>        2.HashMap是一个无序集合，存储元素和取出元素的顺序有可能不一致
> 
>  java.util.LinkedHashMap<k,v>集合 implement hashMap<k,v>接口：
>     特点:
>        1.LinkedHashMap集合底层是哈希表+链表（保证迭代的顺序）
>        2.HashMap是一个有序序集合，存储元素和取出元素的顺序一致
> ```

## HashMap

> java.util.hashMap<k,v>集合 implement Map<k,v>接口：
>     特点:
>        1.HashMap集合底层是哈希表，查询速度块
>        2.HashMap是一个无序集合，存储元素和取出元素的顺序有可能不一致

## LinkedHashMap

>```java
>java.util.LinkedHashMap<k,v>集合 implement hashMap<k,v>接口：
>    特点:
>       1.LinkedHashMap集合底层是哈希表+链表（保证迭代的顺序）
>       2.HashMap是一个有序序集合，存储元素和取出元素的顺序一致
>```

## HashTable

> ```java
> java.util.HashTable<K,V>集合 implements Map<K,V>接口
>         HashTable底层也是以是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
>         HashMap底层也是以是一个哈希表，是一个线程不安全的集合，是多线程集合，速度块
> 
>         HashMap集合：可以存储null值，null键
>         HashTable集合：不可以存储null值和null键
> 
> HashTable和Vector集合一样，在jdk1.2版本之后被更先进的集合（hashMap,ArrayList）取代了
> HashTable的子类Properties依然活跃在历史舞台
> Properties集合是一个位移和IO流相结合的集合
> ```

