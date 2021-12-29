package liuhui.com.oop.抽象类和接口;

/**
 * @author 刘先生
 * 抽象类：
 * <p>
 * 1.抽象类不允许被实例化-抽象类有构造-让子类使用
 * 2.抽象类中可以有抽象方法
 * 3.普通子类需要实现抽象类的抽象方法
 * 4.如果无法实现抽象类的抽象方法时，将当前类改为抽象类，让他的子类进行实现
 * 5.不管继承的层级数量，最终的子类都属于最上层的父类
 * 6.使用继承时，如果父类没有子类的方法，使用父类进行定义的对象，将无法调用子类的方法
 */

public class Test {



    public static void main(String[] args) {
        Usb usb = new Usb();
        usb.connect();
        usb.setData("一个文件");
        System.out.println(usb.getData(0));



    }
}
