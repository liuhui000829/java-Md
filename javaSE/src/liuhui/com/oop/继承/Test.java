package liuhui.com.oop.继承;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog("二哈", 18, "黑色");
        Cat cat = new Cat("小肥", 20, "黄色");
        dog.print();
        cat.print();


        // equals 对象实例比较的是 内存地址 源码跟 ==比较一样
        Dog dog2 = new Dog("二哈", 18, "黑色");
        Dog dog3 = new Dog("二哈", 18, "黑色");
        System.out.println(dog2 == dog3);                           // false
        System.out.println(dog2.equals(dog3));                      // false


        // equals String比较的是  先比较地址 再比较内容
        String str = "123";
        String str2 = new String("123");
        System.out.println(str == str2);                            // false
        System.out.println(str.equals(str2));                       // true


        int[] arr = {1, 3, 2};
        int[] arr2 = {1, 2, 3};
        System.out.println(arr == arr2);                            // false
        System.out.println(arr.equals(arr2));                       // false


    }
}
