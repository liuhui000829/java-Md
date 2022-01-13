package liuhui.com.高级特性.线程.new线程;

// 模拟龟兔赛跑 - Race

/**
 * 1.首先来个赛道距离,然后要离终点越来越近
 * 2.判断比赛是否结束
 * 3.打印出胜利者
 * 4.龟兔赛跑开始
 * 5.故事中是乌龟赢的,兔子需要睡觉,所以我们来模拟兔子睡觉
 * 6.终于乌龟赢了比赛
 */


public class TestThread5 implements Runnable {

    // 胜利者
    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {

            // 模拟兔子休息
            if ("兔子".equals(Thread.currentThread().getName()) && i % 10 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            boolean flag = gameOver(i);
            if (flag)  break;
            System.out.println(Thread.currentThread().getName() + "--> 跑了" + i + "步");
        }
    }

    // 是否完成比赛
    private boolean gameOver(int steps) {
        // 判断是否有胜利者
        if (winner != null) return true;

        // 看谁先到100步
        if (steps >= 100) {
            winner = Thread.currentThread().getName();
            System.out.println("Winner is" + winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TestThread5 testThread5 = new TestThread5();
        new Thread(testThread5, "兔子").start();
        new Thread(testThread5, "乌龟").start();

    }
}
