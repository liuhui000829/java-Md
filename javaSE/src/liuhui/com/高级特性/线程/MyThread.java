package liuhui.com.高级特性.线程;

public class MyThread extends Thread {
    //任务执行的次数
    public static Integer num;

    public MyThread(Integer num) {
        MyThread.num = num;
    }

    public MyThread() {
    }

    /**
     * 线程要执行的任务体
     */
    @Override
    public void run() {
        // 获取当前线程
        Thread t = Thread.currentThread();
        for (int i = 1; i <= num; i++) {
            System.out.println("线程id为:" + t.getId() + "执行到了第" + i + "次");
        }
    }

    public static void main(String[] args) {

        // 1. 两个线程各执行了5次
//        MyThread myThread=new MyThread(5);
//        MyThread myThread2=new MyThread(5);
//        System.out.println("主线程任务执行结束");
//        myThread.start();
//        myThread2.start();

        // 2. 多个线程 同时执行一个任务 这个任务为10次

        MyThread.num = 10;
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();
        System.out.println("主线程任务执行结束");
    }
}
