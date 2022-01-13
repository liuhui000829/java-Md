package liuhui.com.高级特性.线程.new线程2;

/*
 * lambda表达式的初体验
 *
 *
 *
 * */

public class _02LambdaDemo1 {
    // 3. 静态内部类
    static class Like2 implements ILike {
        @Override
        public void lambda() {
            System.out.println("I like lambda 静态内部类");
        }
    }


    public static void main(String[] args) {
        // 4. 局部内部类
        class Like3 implements ILike {
            @Override
            public void lambda() {
                System.out.println("I like lambda 局部内部类");
            }
        }

//        5. 匿名内部类 没有类的名称，必须借助接口或者接口
//        ILike iLike = new ILike() {
//            @Override
//            public void lambda() {
//                System.out.println("I like lambda 匿名内部类");
//            }
//        };
//        iLike.lambda();


        // 6. 用lambda简化
        ILike iLike = () -> System.out.println("i like lambda 真正的表达式");
        iLike.lambda();




    }

}

// 1. 定义一个函数式接口
interface ILike {
    void lambda();
}

// 2. 实现类
class Like implements ILike {

    @Override
    public void lambda() {
        System.out.println("I like lambda");
    }
}



























