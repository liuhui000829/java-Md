package liuhui.com.高级特性.线程.new线程2;

import liuhui.com.oop.day1.Day1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * sleep ,
 * (1)模拟网路延迟  (你如买火车票那个问题)
 * (2) 模拟倒计时
 */
public class _05ThreadSleep {

    public static void main(String[] args) throws InterruptedException {
        timer();

    }

    // 模拟倒计时
    public static void tenDown() throws InterruptedException {
        int num = 10;
        while (true) {
            Thread.sleep(1000);
            System.out.println(num--);
            if (num <= 0) {
                break;
            }
        }

    }

    // 打印当前时间
    public static void timer() throws InterruptedException {
        Date startTime = new Date(System.currentTimeMillis()); //获取系统当前时间

        while (true) {
            Thread.sleep(1000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
            startTime = new Date(System.currentTimeMillis()); //更新系统当前时间

        }

    }

}


