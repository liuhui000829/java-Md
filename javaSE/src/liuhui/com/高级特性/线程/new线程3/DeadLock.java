package liuhui.com.高级特性.线程.new线程3;

// 死锁: 多个线程互相抱着对方需要的资源，然后形成僵持
public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0,"灰姑娘");
        Makeup g2 = new Makeup(1,"白雪公主");

        g1.start();
        g2.start();
    }

}

// 口红
class Lipstick {

}

// 镜子
class Mirror {

}

// 化妆
class Makeup extends Thread {

    // 需要的资源只有一份，用static来保证只有一份
    static Lipstick lipstick = new Lipstick();
    static Mirror mirror = new Mirror();

    int choice; //选择
    String girlName; //使用化妆品的人

    public Makeup(int choice, String girlName) {
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        // 化妆
        try {
            makeUp();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void makeUp() throws InterruptedException {
        if (choice == 0) {
            // 获得口红的锁
            synchronized (lipstick) {
                System.out.println(this.girlName + "获得口红的锁");
                Thread.sleep(2000);

            }
            synchronized (mirror) {
                // 一秒钟之后获得镜子的锁
                System.out.println(this.girlName + "获得镜子的锁");
            }
        } else {
            // 获得镜子的锁
            synchronized (mirror) {
                System.out.println(this.girlName + "获得镜子的锁");
                Thread.sleep(3000);

            }
            synchronized (lipstick) {
                // 一秒钟之后获得口红的锁
                System.out.println(this.girlName + "获得口红的锁");
            }
        }
    }
}




















