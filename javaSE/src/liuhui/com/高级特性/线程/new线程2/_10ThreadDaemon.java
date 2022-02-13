package liuhui.com.高级特性.线程.new线程2;

public class _10ThreadDaemon {
    public static void main(String[] args) {
        // 上帝 守护线程
        Thread god = new Thread(() -> {
            while (true) {
                System.out.println("上帝保佑着你");
            }
        });
        god.setDaemon(true);        // false表示是用户线程 true表示守护线程 正常的线程都是用户线程
        god.start();

        // 你 用户线程
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("你开心的活着");
            }
            System.out.println("good bye");
        }).start();
    }
}
