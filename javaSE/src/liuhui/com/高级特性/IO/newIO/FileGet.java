package liuhui.com.高级特性.IO.newIO;

import java.io.File;

public class FileGet {
    public static void main(String[] args) {
    /*
         public String getAbsolutePath(): 返回File的绝对路径名字符串
         public String getPath(): 将File转换为路径名字符串
         public String getName(): 返回由此File表示的文件或者目录的名称
         public long length(); 返回由此File表示的文件的长度

    */
        show4();


    }

    public static void show1() {
    /*
         public String getAbsolutePath(): 返回File的绝对路径名字符串
         1.获取构造方法中传递的路径
         2.无论是绝对路径还是相对路径,getAbsolutePath()返回的都是绝对路径

     */

        File file = new File("C:\\Users\\刘先生\\Desktop\\java-Md\\javaSE\\a.txt");
        System.out.println(file.getAbsolutePath());     //C:\Users\刘先生\Desktop\java-Md\javaSE\a.txt

        File file2 = new File("a.txt");
        System.out.println(file2.getAbsolutePath());     //C:\Users\刘先生\Desktop\java-Md\javaSE\a.txt


    }

    public static void show2() {
    /*
          public String getPath(): 将File转换为路径名字符串
          1.获取构造方法中传递的路径
          2.相对的返回相对的,绝对的返回绝对的,是什么就返回什么
          3.toString()方法调用的就是getPath()方法
          源码:
            public String toString() {
                return getPath();
            }

     */

        File file = new File("C:\\Users\\刘先生\\Desktop\\java-Md\\javaSE\\a.txt");
        System.out.println(file.getPath());     // C:\Users\刘先生\Desktop\java-Md\javaSE\a.txt

        File file2 = new File("a.txt");
        System.out.println(file2.getPath());    // a.txt

        // 测试toString()方法
        System.out.println(file.toString());    // C:\Users\刘先生\Desktop\java-Md\javaSE\a.txt
        System.out.println(file2.toString());   // a.txt

    }

    public static void show3() {
    /*
          public String getName(): 返回由此File表示的文件或者目录的名称
          获取的是构造方法传递路径的结尾部分(文件/文件夹)

    */

        File file = new File("C:\\Users\\刘先生\\Desktop\\java-Md\\javaSE\\a.txt");
        System.out.println(file.getName());      // a.txt

        File file2 = new File("C:\\Users\\刘先生\\Desktop\\java-Md\\javaSE");
        System.out.println(file2.getName());     // javaSE


    }

    public static void show4() {
    /*
          public long length(); 返回由此File表示的文件的长度
          获取的是构造方法指定的文件的大小,以字节为单位
          注意:
            1.文件夹是没有大小概念的,不能获取文件夹的大小
            2.如果构造方法中给出的路径不存在,那么返回0

     */

        File file = new File("C:\\Users\\刘先生\\Desktop\\1.jpg");
        System.out.println(file.length());  // 1,040,672 字节


        File file2 = new File("C:\\Users\\刘先生\\Desktop\\2.jpg");
        System.out.println(file2.length());  // 0

        File file3 = new File("C:\\Users\\刘先生\\Desktop\\java-Md");
        System.out.println(file3.length());  // 4096


    }
}
