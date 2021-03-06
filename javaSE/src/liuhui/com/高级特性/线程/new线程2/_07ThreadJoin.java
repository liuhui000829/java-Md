package liuhui.com.高级特性.线程.new线程2;

/*
* join  线程插队
*
*
* */
public class _07ThreadJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

            if(i==200){
                Thread thread = new Thread(() -> {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int i1 = 0; i1 < 300; i1++) {
                        System.out.println("第三线程来了" + i1);
                    }
                });
                thread.start();

                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程vip来了"+i);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        _07ThreadJoin threadJoin = new _07ThreadJoin();
        Thread thread = new Thread(threadJoin);
        thread.start();


        // 主线程
        for (int i = 0; i < 500; i++) {
            Thread.sleep(1);
            if(i==200){
                thread.join();
            }
            System.out.println("main线程"+i);
        }


    }
}
