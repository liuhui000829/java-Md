### 1. java基础文件内容

#### 2. liuhui.com.oop.a1 a2 a3 day1

```
// 1. a1
Person  Test  简单实例化类

// 2. a2
一个景区根据游人的年龄收取不同价格的门票 根据年龄段收取
Test   Bill  User	简单的面向对象	

// 3. a3
简单的创建学生类数组 添加5个学生  然后根据学生姓名在某个区间内查询这个学生
Student StudentServer Test 

// 4. day 1
1. 插入一个学员的成绩 并且保持降序
2. 插入一个学员的成绩 并且保持升序
3. 冒泡排序
4. Arrays类常用


```

#### 3. liuhui.com.oop.作用域问题

```
1. 一个类在两个包都有 怎么解决

2. 测试 public private 默认修饰符 protected 访问权限
```

#### 4. liuhui.com.oop.继承

```
Animal Dog Cat Test 简单的实现继承
```

#### 5.liuhui.com.oop.static内容

```
1.satic 修饰属性, 代码块, 方法问题 各种情况的简单练习
```

#### 6. liuhui.com.oop.static选民投票

```
	模拟实现选民投票过程：
 * 有四个候选人，每个选民只允许投一次票，并且有三分之一的概率不投或者弃权
 * 并且当投票总数达到100时，就停止投票 输出总投票数 以及候选人的票数 以及结果
```

#### 7. liuhui.com.oop.static测试类

```1.
一个类只能new 10次怎么办
```

#### 8. liuhui.com.oop.多态

```
1. 简单的实现了多态   2.向上转型 向下转型  
2. 写了个overload 尝试了下重载  
3. Master 模拟多态
```

#### 9. liuhui.com.oop.抽象类和接口

```
1. 抽象类和接口
Ⅳ个类 usb连接等

2. 抽象类和接口2
用户买机票的接口练习

3. 抽象类和接口3
打印机的一个接口 Ⅳ个类

```

#### 10. liuhui.com.oop.异常

```
6个类 自定义异常等
```



#### 11. liuhui.com.高级特性.集合

```
ArrayList linkedList HashSet HashMap lambda表达式 泛型等等
```



#### 12. liuhui.com.高级特性.IO

```
1. 文件的操作
2. io 字节流  读写   (对象形式不一样)
3. io 字符流  读写	(对象形式不一样)
```



### 概念

#### 1.面向对象

##### 1.继承

**继承是Java中实现代码重用的重要手段之一。Java中只支持单根继承，即一个类只能有一个直接父类**

```
		一 .子类访问父类的问题?
 *      
 		1.访问父类构造方法   super();   super(name)
 *      2.访问父类属性   	  super.name;   
 		3.访问父类方法      super.print();

 *      (1)使用super关键字,super代表父类对象
 *      (2)在子类构造方法中调用且必须是第一句
 		(3)不可以访问父类中定义为private的属性和方法
 
 *		二 .继承条件下的构造方法

 *          1. 子类构造方法没有通过super显式调用父类的有参构造方法，也没通过this显式调用自身其他构造方法
 *             注意 :系统默认调用父类的无参构造方法
 
 *          2. 子类构造方法通过super显式调用父类的有参构造方法
 *             注意: 执行父类相应构造方法，而不执行父类无参构造方法
 
 *          3. 子类构造方法通过this显式调用自身的其他构造方法，在相应构造方法中应用以上两条规则
 *
		三 .子类继承父类的什么？
 *          
 *          1. 继承public和protected修饰的属性和方法，不管子类和父类是否在同一个包里
 *          2. 继承默认权限修饰符修饰的属性和方法，但子类和父类必须在同一个包里
 
 *		四 .子类可以继承父类的所有资源吗?
 *          
 *          1. private修饰的成员
 *          2.子类与父类不在同包，并且使用默认访问权限的成员
 *          3.构造方法

```

##### 2. 修饰符 与 作用域问题

```
 一个类在两个包都有 那么就得用   liuhui.com.oop.作用域问题.Student stu2=new liuhui.com.oop.作用域问题.Student()形式
```

```

*  scope/修饰符     当前类中    同一个包中   子类中     任何地方

*  private          √             X        X           X
*  默认修饰符         √             √        X           X
*  protected        √             √        √           X
*  public           √             √        √           √
```

##### 3. static

```
static可以用来修饰

1. 成员变量  静态变量，可以直接通过类名访问
2. 成员方法  静态方法，可以直接通过类名访问
3. 代码块    静态代码块，当Java虚拟机加载类时，就会执行该代码块

JVM加载类时，加载静态代码块
    1. 如果有多个静态块，按顺序加载
    2. 每个静态代码块只会被执行一次



1. static变量（静态变量 或者类变量）
        1.被static修饰的变量在内存中只有一个拷贝，
        2.类内部，可在任何方法内直接访问静态变量，
        3.其他类中，可以直接通过类名访问
        
        
        
2. 实例变量
		1.每创建一个实例，就会为实例变量分配一次内存，实例变量可以在内存中有多个拷贝，互不影响
		
 static变量的作用：
（1）能被类的所有实例共享，可作为实例之间进行交流的共享数据
（2）如果类的所有实例都包含一个相同的常量属性，可把这个属性定义为静态常量类型，从而节省内存空间


static修饰符  
    1. 静态方法：
    	1. 可直接通过类名访问
    	2. 静态方法中不能使用this和super
    
    	3. 只能访问类的 静态变量和静态方法
    	4. 静态方法必须被实现(就是要有方法体)
    
    2. 实例方法
    	1. 可以访问 静态变量、静态方法
    

```

##### 4. 重写 重载 多态 上下转型

```
1. 重写
	子类重写父类方法注意事项

(1) 静态修饰符必须一致
(2) 方法名 参数列表 必须一致
(3) 访问权限不能严于父类
(4) 构造方法不能重写
(5) 父类的私有方法不能被子类覆盖-看不见
(6) 返回值类型必须是父类 或者是其子类
(7) 抛出的异常不能多于父类

2. 重载
 主要是跟返回值类型 无关 


2.重载跟重写 VS

比较项		 位置	  方法名	参数表	    返回值	           访问修饰符
 
方法重写	子类	  相同	相同	     相同或是其子类	 不能比父类更严格

方法重载	同类	  相同	不相同	    无关	            无关


3. 多态  
父类的引用指向子类 实现多态
	形式 
 	// 使用父类作为方法的返回值，也是Java中实现和使用多态的主要方式
    // 使用父类作为方法的形参， 是Java中实现和使用多态的主要方式


4. 向上转型 自动转换
   向下转型 需要强转  (如果需要调用子类特有的方法 必须进行转换)


```

##### 5. 抽象类和接口

```
												抽象类
// 抽象类VS普通类

1. 抽象类不能被实例化
2. 但可以创建一个引用变量，其类型是一个抽象类，指向非抽象的子类实例 Pet dog=new Dog();
3. 普通类可以被实例化

// 抽象方法VS普通方法

1. 有无方法体


二.
抽象类与抽象方法的使用
1. 抽象类中可以没有抽象方法，但包含了抽象方法的类必须被定义为抽象类
2. 如果子类没有实现父类的所有抽象方法，子类必须被定义为抽象类
3. 没有抽象构造方法，也没有抽象静态方法
4. 抽象类中可以有非抽象的构造方法，创建子类的实例时可能调用


												接口

抽象类和抽象法约束了继承了自己的子类必须要实现的方法

问题：子类中需要自己定义的方法无法进行有效的约束
接口：约束实现接口的类需要必须实现的功能。

1. 抽象类多用于实体类的继承处理
2. 接口多用于定义一组需要实现的功能




										接口的使用
										
1. 接口中的成员变量默认都是public static final的，必须显式初始化
2. 接口中的方法默认都是public abstract的
3. 接口没有构造方法，不能被实例化 
4. 一个接口不能实现另一个接口，但可以继承多个其他接口
5.一个子类必须实现接口的抽象方法（implements），除非这个类也是抽象类



									抽象类和接口的区别
相同点:

1. 代表系统的抽象层
2. 都不能被实例化
3. 都能包含抽象方法
4. 用于描述系统提供的服务，不必提供具体实现

不同点

1. 在抽象类中可以为部分方法提供默认实现，而接口中只能包含抽象方法
2. 抽象类便于复用，接口便于代码维护
3. 一个类只能继承一个直接的父类，但可以实现多个接口

									接口和抽象类的使用原则


1. 接口做系统与外界交互的窗口
2. 接口提供服务
3. 接口本身一旦制定，就不允许随意修改
4. 抽象类可完成部分功能实现，还有部分功能可作为系统的扩展点

									面向对象设计原则
									
1. 多用组合，少用继承
2. 针对接口编程
3. 针对扩展开放，针对改变关闭


									接口总结
									
Java中的接口
1. 属性全都是全局静态常量
2. 方法都是全局抽象方法
3. 无构造方法
4. 一个类可以实现多个接口，非抽象类实现接口时必须实现接口中的全部方法
5. 抽象类利于代码复用，接口利于代码维护

```



#### 2 . 常用类

##### 1.Object

```
Object类被子类经常重写的方法

toString()	返回当前对象本身的有关信息，按字符串对象返回
equals()	比较两个对象是否是同一个对象，是则返回true
hashCode()	返回该对象的哈希代码值
getClass()	获取当前对象所属的类信息，返回Class对象

```

##### 2.Arrays

```
Arrays 工具类的使用
        
* 1. boolean equals(array1,array2) 比较两个数组是否相等
* 2. void sort(array)              对数组的元素进行升序排列
* 3. String toString(array)        将一个数组元素转换成字符串
* 4. void fill(array,val)          将数组所有元素赋值为val
* 5. copyOf(array,length)          把数组array复制成一个长度为length的新数组 返回类型与复制数组一致
* 6. int binarySearch(array,val)   查询元素值val在数组中的下标 (要求数组中元素已经按升序排列)
```

##### 3. ArrayList & LinkedList

```
1. ArrayList

boolean add(Object o)	在列表的末尾顺序添加元素，起始索引位置从0开始
void add(int index,Object o)	在指定的索引位置添加元素。索引位置必须介于0和列表中元素个数之间
int size()	返回列表中的元素个数
Object get(int index)	返回指定索引位置处的元素。取出的元素是Object类型，使用前需要进行强制类型转换
boolean contains(Object o)	判断列表中是否存在指定元素
boolean remove(Object o)	从列表中删除元素
Object remove(int index)	从列表中删除指定位置元素，起始索引位置从0开始

Collection接口常用通用方法还有：clear()、isEmpty()、iterator()、toArray()


2. LinkedList
void  addFirst(Object o)	在列表的首部添加元素
void  addLast(Object o)	在列表的末尾添加元素
Object  getFirst()	返回列表中的第一个元素
Object  getLast()	返回列表中的最后一个元素
Object  removeFirst()	删除并返回列表中的第一个元素
Object  removeLast()	删除并返回列表中的最后一个元素
```

##### 4.Map

```
Object put(Object key, Object val)	以“键-值”对的方式进行存储
Object get(Object key)	根据键返回相关联的值，如果不存在指定的键，返回null
Object remove(Object key)	删除由指定的键映射的“键-值对”
int size()	返回元素个数
Set keySet()	返回键的集合
Collection values()	返回值的集合
boolean containsKey(Object key)	如果存在由指定的键映射的“键-值对”，返回true
```









#### 3. 高级特性

##### 1.集合

```
Java集合框架提供了一套性能优良、使用方便的接口和类，它们位于java.util包中

Collection 接口

LIst    	和 		Set																		Map

ArrayList  linkedList  HashSet  TreeSet						 HashMap   TreeMap



具体类算法  Collections 提供了对集合进行排序 遍历等多种算法实现



1. Collection 接口存储一组不唯一 无须的对象

2. List 接口存储一组不唯一，有序（插入顺序）的对象

3. Set 接口存储一组唯一 无序的对象

4. Map接口存储一组键值对象 提供key到Value的映射



// ArrayList 和 LinkedList 比较

1. ArrayList实现了长度可变的数组，在内存中分配连续的空间，遍历元素和随机访问元素的效率比较高

2. LinkedList采用链表存储方式，插入、删除元素时效率比较高
3. 



// Set 

1. Set接口存储一组唯一，无序的对象
   HashSet是Set接口常用的实现类
   Set中存放对象的引用



2. Set接口如何判断加入对象是否已经存在呢？
   采用对象的equals()方法比较两个对象是否相等

3. Set接口不存在get()方法



4. 如何遍历Set集合呢？

方法1：通过迭代器Iterator实现遍历 
获取Iterator ：Collection 接口的iterator()方法
Iterator的方法
boolean hasNext(): 判断是否存在另一个可访问的元素 
Object next(): 返回要访问的下一个元素
方法2：增强型for循环

方法3: lambda 表达式



// 泛型集合

泛型集合可以约束集合内的元素类型 
典型泛型集合ArrayList<E>、HashMap<K,V>
<E>、<K,V>表示该泛型集合中的元素类型
泛型集合中的数据不再转换为Object



// Collections

Collections 算法类

Java集合框架将针对不同数据结构算法的实现都保存在工具类中
Collections类定义了一系列用于操作集合的静态方法





Collections类常用方法

Collections和Collection不同，前者是集合的操作类，后者是集合接口
Collections提供的常用静态方法
sort():排序
binarySearch()：查找
max()\min():查找最大\最小值



Collections类可以对集合进行排序、查找和替换操作
实现一个类的对象之间比较大小，该类要实现Comparable接口
重写compareTo()方法


```

##### 2.IO

```

文件的读写

1. 写入流
1. (字节流) FileInputStream    InputStream

   (字符流) InputStreamReader   Reader 
   
   
                // 缓冲的字符流-
   				//1. 创建 FileInputStream
                InputStream is = new FileInputStream(path);
                //2. 创建 InputStreamReader
                Reader reader = new InputStreamReader(is);
                //3. 创建 BufferedReader
                BufferedReader bd = new BufferedReader(reader);   （配合 StringBuilder）
   
   
2. StringBuffer   sb.append((char) i); 一般只能一个一个存储
   
   StringBuilder  sb.append(str)	
   
   
   
   
2. 输出流

FileOutputStream  (字节流)        		  OutputStream(父类型)   				 write(byte [])

FileWriter(path, isAppend)(字符流)       OutputStreamWriter(父类型)    		 write(str)   

// 字符流 输出
BufferedWriter bw = new BufferedWriter(new FileWriter(path, isAppend))

 对象的写入
// 使用文件输出流创建对象输出
  ObjectOutput oos = new ObjectOutputStream( new FileOutputStream(path) )
  对象 需要序列化   Alt +enter 生成一个序列化


```

### Y纠错集

```
1. create asm serializer error   json转换 检查路径是否有中文
```





