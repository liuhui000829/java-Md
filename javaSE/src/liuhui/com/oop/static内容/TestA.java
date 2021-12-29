package liuhui.com.oop.static内容;

public class TestA {
    public static void main(String[] args) {


        /**
         * static 静态 在内存中一直存在的内容就是静态
         *
         * static 修饰属性，称为静态属性
         * 		  属于类，在内存中只有一份  可以使用类的对象操作静态属性 和 通过类名直接操作
         *
         * static 修饰的方法，称为静态方法
         * 		  属于类，在内存中只有一份  可以使用类的对象操作 和 通过类名直接操作
         *
         * @author liu先生
         *
         */


        /**
         * 可以在 31行debug测试
         *
         */

        StaticA st1 = new StaticA();
        st1.add();
        StaticA st2 = new StaticA();
        st2.add();

        System.out.println("st1:" + st1.num1 + "," + st2.num2); // 1, 2
        System.out.println("st2:" + st2.num1 + "," + st2.num2); // 1, 2
        System.out.println(StaticA.num2);       // 2

        st1.staticAdd();
        StaticA.staticAdd();
        System.out.println(st2.num2);           // 4
    }
}
