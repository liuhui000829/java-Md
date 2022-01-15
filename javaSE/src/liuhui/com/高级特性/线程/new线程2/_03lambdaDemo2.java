package liuhui.com.高级特性.线程.new线程2;


public class _03lambdaDemo2 {

    public static void main(String[] args) {
        Love love = a -> a * a;
        int num = love.show(5);
        System.out.println(num);


    }
}

interface Love {
    abstract int show(int i);
}




