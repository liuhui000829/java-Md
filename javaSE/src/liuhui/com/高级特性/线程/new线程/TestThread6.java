package liuhui.com.高级特性.线程.new线程;

/**
 * 用callable接口改造图片下载
 * callable好处
 * 1. 可以定义返回值
 * 2. 可以抛出异常
 */

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

// 多线程同步下载多张图片
public class TestThread6 implements Callable<Boolean> {
    private String url;     // 网络图片地址
    private String name;    // 保存的文件名

    public TestThread6(String url, String name) {
        this.url = url;
        this.name = name;
    }


    // 主线程
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String url1 = "https://img.alicdn.com/imgextra/i3/O1CN01ehZW7N1iOcbw8s5v3_!!6000000004403-2-tps-209-75.png";
        String url2 = "https://img.alicdn.com/imgextra/i3/O1CN01i1Mqim1QPOBzu6eXo_!!6000000001968-2-tps-209-75.png";
        String url3 = "https://img.alicdn.com/imgextra/i1/O1CN01fp595K2483pyve6ns_!!6000000007345-2-tps-209-75.png";

        TestThread6 t1 = new TestThread6(url1, "apache1.jpg");
        TestThread6 t2 = new TestThread6(url2, "apache2.jpg");
        TestThread6 t3 = new TestThread6(url3, "apache3.jpg");

        // 创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // 提交执行:
        Future<Boolean> r1 = executorService.submit(t1);
        Future<Boolean> r2 = executorService.submit(t2);
        Future<Boolean> r3 = executorService.submit(t3);
        // 获取结果
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();
        // 关闭服务
        executorService.shutdownNow();
    }

    @Override
    public Boolean call() throws IOException {
        WebDownLoader2 webDownLoader = new WebDownLoader2();
        webDownLoader.downLoader(url, name);
        System.out.println("下载的文件名字为" + name);
        return true;
    }
}

// 下载器
class WebDownLoader2 {
    // 下载的方法
    public void downLoader(String url, String name) throws IOException {
        FileUtils.copyURLToFile(new URL(url), new File(name));

    }
}

