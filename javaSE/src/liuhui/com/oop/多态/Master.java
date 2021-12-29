package liuhui.com.oop.多态;

public class Master {
    // 使用父类作为方法的返回值，也是Java中实现和使用多态的主要方式
    // 使用父类作为方法的形参， 是Java中实现和使用多态的主要方式

    public void show (Animal animal){
        animal.print();
    }
}
