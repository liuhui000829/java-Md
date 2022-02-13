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


public class _05RacePet implements Runnable {

    private String winner;
    private int loser;
    @Override
    public void run() {
        boolean flag;

        for (int i = 1; i <= 10000; i++) {
            if ("兔子".equals(Thread.currentThread().getName()) && i % 3000 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if("兔子".equals(Thread.currentThread().getName())){
                loser = i;
            }
            flag = gaveOver(i);
            if (flag) return;
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }

    }

    public static void main(String[] args) {
        _05RacePet racePet = new _05RacePet();
        new Thread(racePet, "兔子").start();
        new Thread(racePet, "胖子").start();
    }

    private boolean gaveOver(int steps) {
        if (winner != null) return true;
        if (steps >= 10000) {
            winner = Thread.currentThread().getName();
            System.out.println("获胜者" + winner);
            System.out.println("失败者跑了"+loser);

            return true;
        }
        return false;
    }

}
