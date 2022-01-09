package liuhui.com.数据结构.递归;


public class recursionDemo1 {

    public static int i = 0;

    public static void main(String[] args) {

        a(5);
        System.out.println("执行完毕");

    }

    public static void a(int i) {
        // 递归一定要有限定条件 否则会发生栈内存溢出
        System.out.println(i);
        if (i <= 0) {
            return;
        }
        a(--i);
    }
}
