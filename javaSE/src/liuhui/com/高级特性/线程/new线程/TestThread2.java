package liuhui.com.高级特性.线程.new线程;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

// 多线程同步下载多张图片
public class TestThread2 extends Thread {
    private final String url;     // 网络图片地址
    private final String name;    // 保存的文件名

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    // 下载图片线程的执行体
    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downLoader(url, name);
        System.out.println("下载了文件名称为:"+name);

    }

    // 主线程
    public static void main(String[] args) {
        String url1 = "https://img.alicdn.com/imgextra/i3/O1CN01ehZW7N1iOcbw8s5v3_!!6000000004403-2-tps-209-75.png";
        String url2 = "https://img.alicdn.com/imgextra/i3/O1CN01i1Mqim1QPOBzu6eXo_!!6000000001968-2-tps-209-75.png";
        String url3 = "https://img.alicdn.com/imgextra/i1/O1CN01fp595K2483pyve6ns_!!6000000007345-2-tps-209-75.png";
        TestThread2 t1 = new TestThread2(url1,"apache1.jpg");
        TestThread2 t2 = new TestThread2(url2,"apache2.jpg");
        TestThread2 t3 = new TestThread2(url3,"apache3.jpg");

        t1.start();
        t2.start();
        t3.start();
    }
}

// 下载器
class WebDownLoader {
    // 下载的方法
    public void downLoader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Io异常,downLoader方法出现异常");
        }
    }
}

