package liuhui.com.高级特性.反射和注解.反射;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;

/**
 * 反射: 框架设计的灵魂
 * * 框架: 半成品软件,可以在框架的基础上进行软件开发，简化编码
 * * 反射: 将类的各个组成部分封装成其他对象,这就是反射机制
 * * 好处
 * 1. 可以在程序运行的过程中,操作这些对象
 * 2. 可以解耦,提高程序的可扩展性
 */
@SuppressWarnings("All")
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        memberMethods();

    }

    // 获取成员变量们
    public static void memberVariable() throws Exception {
        // 1.获取Person的class对象
        Class personClass = Person.class;

        // 2.Field[] getFields()   获取所有public修饰的成员变量
//        Field[] fields = personClass.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }

        // 3. Field getField() 获取指定名称的 public修饰的成员变量
        Person person = new Person();
        Field a = personClass.getField("a");

        // get set 可以获取与设置值

        // get()
        Object value = a.get(person);
        System.out.println(value);


        // set()
        a.set(person, "张三");
        System.out.println(person);

        System.out.println("=======================================");


        // 1. Field[] getDeclaredFields()  获取任何修饰符的成员变量
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);  // 让私有的成员变量可以被访问
        Object value2 = d.get(person);
        System.out.println(value2);     // null
        d.set(person, "456");
        System.out.println(d.get(person));  // 456


    }

    // 获取构造方法们
    public static void constructorMethods() throws Exception {
        Class personClass = Person.class;
        // 获取所有的构造方法
        Constructor[] constructors = personClass.getConstructors();
        System.out.println(Arrays.toString(constructors));

        // 获取特定的构造方法

        // 1. 有参构造 Constructor<T> getConstructor(...parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, Integer.class, String.class);
        // 创建对象
        Object person = constructor.newInstance("张三", 18, "001");
        System.out.println(person);


        // 2. 无参构造直接使用 personClass.newInstance()
//        Object person2 = personClass.newInstance();
//        System.out.println(person2);

        // 获取全部的构造方法
        System.out.println(
                Arrays.toString(
                        personClass.getDeclaredConstructors()
                )
        );
    }

    // 获取所有的成员方法
    public static void memberMethods() throws Exception {
        Class personClass = Person.class;
        // 获取所有的方法名称
        Method[] methods = personClass.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(
                    m.getName()
            );
        }
        // 获取指定名称的方法名称  有参
        Method eat_Method = personClass.getMethod("eat", String.class);
        // 执行方法
        eat_Method.invoke(new Person(), "蛋糕");

        // 获取指定名称的方法名称  无参
        Method eat_Method2 = personClass.getMethod("eat");
        eat_Method2.invoke(new Person());

    }

    // 配置文件反射
    public static void reflectTest() throws Exception {
        // 创建Properties对象
        Properties pro = new Properties();
        // 获取class目录下的配置文件
        // 加载配置文件 转换为一个集合
        // 获取class 目录下的配置文件
        ClassLoader classLoader = ReflectDemo.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        // 有中文所以没有成功  ?????????????????????????

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        // 加载进内存
        Class cls = Class.forName(className);
        // 创建对象
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName,String.class);
        method.invoke(obj, "蛋糕");

    }
}

