package liuhui.com.高级特性.线程.线程同步;



import java.util.concurrent.CopyOnWriteArrayList;

public class _04JUCArraylist {
    public static void main(String[] args) {


        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
