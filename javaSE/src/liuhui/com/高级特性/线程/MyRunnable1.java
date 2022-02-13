package liuhui.com.高级特性.线程;

public class MyRunnable1 implements Runnable {

    private Integer num;
    private boolean flag = true;
    private int a, b, c;


    public MyRunnable1(Integer num) {
        this.num = num;
    }


    @Override
    public void run() {

        while (flag) brickMoving();


    }

    public synchronized void brickMoving() {

        if (num <= 0) {
            flag = false;

            System.out.println("张三"+a);
            System.out.println("李四"+b);
            System.out.println("王五"+c);
            return;

        }
        if (Thread.currentThread().getName().equals("张三")) {
            a++;
        }
        if (Thread.currentThread().getName().equals("李四")) {
            b++;
        }
        if (Thread.currentThread().getName().equals("王五")) {
            c++;
        }

        System.out.println(Thread.currentThread().getName() + "正在搬砖, 还剩" + (--num) + "块砖");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {
        // 定义任务
        MyRunnable1 mr = new MyRunnable1(100);
        new Thread(mr, "张三").start();
        new Thread(mr, "李四").start();
        new Thread(mr, "王五").start();


    }
}
