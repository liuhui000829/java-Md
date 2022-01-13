package liuhui.com.高级特性.线程.new线程;

// 线程的实现方式二  实现Runnable接口
public class TestThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Thread3333");
        }
    }

    public static void main(String[] args) {

        // 创建Runnable接口的实现类对象
        TestThread3 testThread3 = new TestThread3();
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        // 创建线程对象 并通过线程对象开启线程,代理
        new Thread(testThread3).start();
        new Thread(thread1).start();
        new Thread(thread2).start();

        for (int i = 0; i < 200; i++) {
            System.out.println("main444 ");
        }
    }


}

class Thread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Thread1111111111");
        }
    }
}

class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Thread2222222222222222222222222222");
        }
    }
}

