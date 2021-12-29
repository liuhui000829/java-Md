package liuhui.com.oop.static内容;

public class TestB {
    public static void main(String[] args) {
        StaticB a = new StaticB();
        StaticB b = new StaticB();
        System.out.println(a.num1 + " " + StaticB.num2);

        // 我是静态代码块
        // 我是普通代码块1
        // 我是普通代码块2
        // 我是普通代码块1
        // 我是普通代码块2
        // 3 1
    }
}
