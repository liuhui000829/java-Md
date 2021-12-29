package liuhui.com.高级特性.线程;

public class MyRunnable1 implements Runnable {
    /**
     * 总任务 值
     */
    public Integer num;
    public MyRunnable1(Integer num) {
        this.num = num;
    }

    /**
     * 1. 减少版的转
     * 2. 添加自己板砖的数量
     */

    @Override
    public void run() {
        int sum = 0;
//      获得当前线程
        Thread t = Thread.currentThread();
        while (num > 0) {
            System.out.println(t.getName() + "正在搬砖, 还剩" + (--num) + "块砖");
            sum++;
        }
        System.out.println("*******************************任务结束," + t.getName() + "一共搬了" + sum + "块");
    }

    /**
     * 使用Runnable实现多线程
     * 1. 定义任务类 实现Runnable, 并重写run方法
     * 2. 定义线程对象 将同一个任务传给多个线程对象
     * 3. 使用start完成线程的启动
     *
     * @param args
     */
    public static void main(String[] args) {
        // 定义任务
        MyRunnable1 mr = new MyRunnable1(10);
        Thread t1 = new Thread(mr, "张三");
        Thread t2 = new Thread(mr, "李四");
        Thread t3 = new Thread(mr, "王五");

        t1.start();
        t2.start();
        t3.start();

    }
}
