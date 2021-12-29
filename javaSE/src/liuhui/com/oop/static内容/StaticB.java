package liuhui.com.oop.static内容;

public class StaticB {
    /**
     * 代码块和静态代码块
     * @author Thinkpad
     *
     */
        public int num1;
        public static int num2;
        //初始化代码块-普通代码块:对象被创建后，执行这里的内容 Static代码块只执行一次
        {
            System.out.println("我是普通代码块1");
            num1++;
        }
        {
            System.out.println("我是普通代码块2");
            num1+=2;
        }
        //静态代码块-类在加载时执行
        static {
            System.out.println("我是静态代码块");
            num2++;
        }
}
