package liuhui.com.高级特性.线程.new线程2;

/*
 * 测试线程状态
 *
 * */
public class _08ThreadState {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }, "线程一");

        // 观察线程状态
        Thread.State state = thread.getState();
        System.out.println(state);

        // 观察启动后
        thread.start();
        state = thread.getState();

        while (state != Thread.State.TERMINATED) { // 只要线程不终止 就一直执行
            Thread.sleep(100);
            // 更新线程状态
            state = thread.getState();
            System.out.println(state);

        }

    }

}
