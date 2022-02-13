package liuhui.com.高级特性.线程.new线程;

// 多个线程同时操作一个对象
// 买火车票的例子


// 发现一个问题: 多个线程同时操作一个资源的情况下,线程不安全,数据混乱
public class TestThread4 implements Runnable {

    // 票数
    private int tickerNums = 10;

    @Override
    public void run() {
        while (true) {
            if (tickerNums <= 0) break;
            try {
                Thread.sleep(100);      // 模拟延迟 毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ "拿到了第" + tickerNums-- + "张票");
        }
    }

    public static void main(String[] args) {
        TestThread4 testThread4 = new TestThread4();
        new Thread(testThread4,"小明").start();
        new Thread(testThread4,"老师").start();
        new Thread(testThread4,"黄牛").start();

    }
}
