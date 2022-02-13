package liuhui.com.高级特性.线程.线程同步;

// 不安全的买票
// 线程不安全,有负数
public class _02UnsafeTicket {


    public static void main(String[] args) {
        buyTicket unsafeTicket = new buyTicket();

        new Thread(unsafeTicket, "老师").start();
        new Thread(unsafeTicket, "我").start();
        new Thread(unsafeTicket, "黄牛党").start();
        new Thread(unsafeTicket, "同事").start();
        new Thread(unsafeTicket, "老板").start();
        new Thread(unsafeTicket, "鲁迅").start();

    }

}

class buyTicket implements Runnable {
    int ticketNums = 10000;
    boolean flag = true;

    int a,b,c,d,e,f;


    @Override
    public void run() {
        while (flag) buy();
    }

    // synchronized 同步方法 锁的是this
    public synchronized void buy() {
        if (ticketNums <= 0) {
            flag = false;
            System.out.println("老师"+a);
            System.out.println("我"+b);
            System.out.println("黄牛党"+c);
            System.out.println("同时"+d);
            System.out.println("老板"+e);
            System.out.println("鲁迅"+f);
            return;
        }
        if(Thread.currentThread().getName().equals("老师")){
            a++;
        }
        if(Thread.currentThread().getName().equals("我")){
            b++;
        }
        if(Thread.currentThread().getName().equals("黄牛党")){
            c++;
        }
        if(Thread.currentThread().getName().equals("同事")){
            d++;
        }
        if(Thread.currentThread().getName().equals("老板")){
            e++;
        }
        if(Thread.currentThread().getName().equals("鲁迅")){
            f++;
        }

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "拿到了第" + ticketNums-- + "张票");

    }

}


