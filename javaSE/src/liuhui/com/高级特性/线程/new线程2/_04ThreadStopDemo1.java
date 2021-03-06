package liuhui.com.高级特性.线程.new线程2;

// 测试stop
// 1. 建议线程正常停止-->利用次数,不建议死循环
// 2. 建议使用标志位-->设置一个标志位
// 3. 不要使用stop或者destroy等过时或者jdk不建议使用的方法

public class _04ThreadStopDemo1 implements Runnable {

    private static boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("run....Thread" + i++);
        }
    }

    // 设置一个公开的方法停止线程,转换标志位
    public void stop() {
        flag = false;
    }

    public static void main(String[] args) {
        _04ThreadStopDemo1 threadStopDemo1 = new _04ThreadStopDemo1();
        new Thread(threadStopDemo1).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main" + i);
            if (i == 997) {
                // 调用stop方法切换标志位,让线程停止
                threadStopDemo1.stop();
                System.out.println("线程停止了");
            }
        }
    }
}
