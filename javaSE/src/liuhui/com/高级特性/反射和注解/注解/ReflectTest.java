package liuhui.com.高级特性.反射和注解.注解;

import java.lang.reflect.Method;

@Pro(className = "liuhui.com.高级特性.反射和注解.注解.Person", methodName = "print")
@SuppressWarnings("All")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 1.解析注解
        // 1.1. 获取该类的字节码文件
        Class<ReflectTest> reflectClass = ReflectTest.class;
        // 2.获取字节码文件的对象 (其实是在内存中生成了一个该注解接口的子类实现对象)
        Pro pro = reflectClass.getAnnotation(Pro.class);
        // 3.调用注解对象中定义的抽象方法 获取返回值
        String className = pro.className();
        String methodName = pro.methodName();

        // 加载对象进内存
        Class cls = Class.forName(className);
        // 创建对象
        Object obj = cls.newInstance();
        // 获取对象方法
        Method method = cls.getMethod(methodName,String.class);
        // 执行方法
        method.invoke(obj, "文件123");




    }
}
