package liuhui.com.高级特性.线程.new线程;

// 创建线程方式一:  继承Thread类,重写run()方法,调用start()开启线程
public class TestThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("其他线程");
        }
    }

    // main线程 主线程
    public static void main(String[] args) {
        //创建一个线程对象
        TestThread1 testThread1 = new TestThread1();
        // 调用start方法 开启线程
        testThread1.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("main main main线程");
        }
    }
}
