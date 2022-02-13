package liuhui.com.高级特性.线程.线程同步;

import java.util.ArrayList;

public class _01UnsafeArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                synchronized (list) {

                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());

    }
}
