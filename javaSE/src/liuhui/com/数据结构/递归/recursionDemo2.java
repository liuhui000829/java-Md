package liuhui.com.数据结构.递归;

import java.io.File;
import java.security.AlgorithmConstraints;
import java.util.Arrays;

/**
 * 使用递归实现 1 - n 之间的和
 * 比如 n=5  则 1+2+3+4+5
 * n+(n-1)+(n-2)+(n-3)+(n-4)
 */
@SuppressWarnings("all")
public class recursionDemo2 {

    public static void main(String[] args) {


    /*
        已知:
            最大值: n
            最小值: 1
        使用递归必须明确:
            1.递归的结束条件
                获取到1结束
            2.递归的目的
                获取下一个被加的数字(n-1)
    */
//        System.out.println(a(5));
//        System.out.println(b(4));
//        getAllFile("C:\\Users\\刘先生\\Desktop\\testJava");
        delLinked(new File("C:\\Users\\刘先生\\Desktop\\testJava"));
    }

    public static int a(int n) {
        if (n == 1) return 1;
        return n + a(n - 1);
    }

    public static int b(int n) {
//        要求: 5*4*3*2*1
        if (n == 1) return 1;

        return n * b(n - 1);
    }

    //递归遍历 文件夹
    public static void getAllFile(String str) {
        File newFile = new File(str);
        File[] files = newFile.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getName());
                    getAllFile(file.getPath());
                } else {
                    System.out.println(file.getName());
                }
            }
        }


    }

    // 递归删除文件夹
    public static void delLinked(File file) {

        File[] chFiles = file.listFiles();
        if (chFiles == null || chFiles.length == 0) {
            file.delete();
            return;
        }

        for (File chFile : chFiles) {
            System.out.println(chFile);
            delLinked(chFile);
        }
        file.delete();         // 如果文件夹为空 那么可以直接删除的
    }

}
