package liuhui.com.高级特性.线程.new线程2;

/*
 * 测试线程优先级
 *
 * */
public class _09ThreadPriority {
    public static void main(String[] args) {
        // 主线程默认优先级  5
        System.out.println(Thread.currentThread().getName() + "   ->" + Thread.currentThread().getPriority());

        MyPriority myPriority = new MyPriority();

        Thread t1 = new Thread(myPriority,"t1");
        Thread t2 = new Thread(myPriority,"t2");
        Thread t3 = new Thread(myPriority,"t3");
        Thread t4 = new Thread(myPriority,"t4");
        Thread t5 = new Thread(myPriority,"t5");
        Thread t6 = new Thread(myPriority,"t6");

        t1.start();

        t2.setPriority(2);
        t2.start();

        t3.setPriority(3);
        t3.start();

        t4.setPriority(4);
        t4.start();

        t5.setPriority(5);
        t5.start();

        t6.setPriority(Thread.MAX_PRIORITY);
        t6.start();


    }
}

class MyPriority implements Runnable {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "   ->" + Thread.currentThread().getPriority());
    }
}


