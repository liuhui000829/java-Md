package liuhui.com.高级特性.IO.newIO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class FileDemo5 {
    public static void main(String[] args) throws IOException {
        /*
         *  public String[] list(); 返回一个String数组,表示该File目录中的所有子文件或目录
         *  public File[] listFiles(); 返回一个File数组,表示该File目录中的所有子文件或目录
         */
        show1();
    }

    public static void show1() throws IOException {
    /*
        public String[] list(); 返回一个String数组,表示该File目录中的所有子文件或目录
        public File[] listFiles(); 返回一个File数组,表示该File目录中的所有子文件或目录
        注意:
            1.list方法和listFiles方法遍历的是构造方法中给出的目录
            2.如果构造方法中给出的目录路径不存在,会抛出空指针
            3.如果构造方法中给出的不是一个目录, 也会抛出空指针
            4.能遍历成隐藏的文件夹
     */

        String pathName="C:\\Users\\刘先生\\Desktop\\java-Md\\javaSE";
        File file = new File(pathName);
        String[] str = file.list();
        System.out.println(Arrays.toString(str));      // [.idea, bug.txt, java基础.iml, lib, out, src, test2.txt]



        String pathName2="C:\\Users\\刘先生\\Desktop\\java-Md\\javaSE";
        File file2 = new File(pathName2);
        File [] listFiles = file2.listFiles();
        System.out.println(Arrays.toString(listFiles));  //[C:\Users\刘先生\Desktop\java-Md\javaSE\.idea,...]






    }

    public static void show2() {
    /*
        public boolean mkdir(); 创建单级文件夹
        public boolean mkdirs();创建单极文件夹和创建多级文件夹
        返回值:boolean
            true:文件夹不存在,创建文件夹,返回true
            false:文件夹存在,不会创建,返回false
        注意:
            1.此方法只能创建文件夹,不能创建文件
            2.创建文件夹的路径必须存在,否则会抛出异常

     */

        String pathName = "aaa";
        File file = new File(pathName);
        if (!file.isDirectory()) {        // 判断文件夹是否存在
            System.out.println("file " + file.mkdir());            // true
        }

        String pathName2 = "1\\2\\3";
        File file2 = new File(pathName2);
        if (!file2.isDirectory()) {
            System.out.println("file " + file2.mkdirs());          // true
        }
    }
}
