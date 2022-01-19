package liuhui.com.高级特性.线程.new线程2;

/*
 * 测试线程状态
 *
 *
 *
 * */
public class _08ThreadState {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("///////");
            }
        });

        // 观察线程状态
        Thread.State state = thread.getState();
        System.out.println(state);      // NEW

        // 观察启动后
        thread.start();
        state=thread.getState();
        System.out.println(state);           // RUN



    }

}
