package liuhui.com.oop.多态;

public class Test {
    public static void main(String[] args) {

        //向上转型  自动转换
        Animal dog = new Dog("二哈", 18, "黑色");
        Animal cat = new Cat("小肥", 20, "黄色");
        Master master = new Master();
        master.show(dog);




        // 向下转型 需要强转  (调用子类特有的方法)
        if(dog instanceof Dog){     // instanceof  防止转换过程中出现异常
            Dog dog1 = (Dog) dog;
            dog1.DogPlay();
        }
        Cat cat1 = (Cat) cat;

    }
}
