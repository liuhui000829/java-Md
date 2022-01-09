package liuhui.com.高级特性.IO.newIO;

import java.io.File;

/**
 * 相对路径:  是一个完整的路径
 * 以盘符(c: d:)开始的路径
 * C:\Users\刘先生\Desktop\java-Md\testDirectory\aa.txt
 * 绝对路径:  是一个简化的路径
 * 相当于当前项目的根目录(.\testDirectory\aa.txt)
 * 注意:
 * 1. 路径不区分大小写
 * 2. 路径中的文件名称分隔符windows使用反斜杠,反斜杠是转义字符,两个反斜杠表示一个普通的反斜杠
 */
@SuppressWarnings("all")
public class FileDemo2 {
    public static void main(String[] args) {
         /*
            File类型的构造方法
            show1();
         */

        // show2("c:","a.txt");
        // show2("d:","a.txt");   // d:\a.txt
        show3();


    }

    public static void show1() {
        /* public File(String pathname): 通过给定的路径名字符串转换为抽象路径名来创建新的 File实例
        参数:
            1.String pathname: 字符拆的路径名称
            2.路径可以是以文件结尾,也可以是以文件夹结尾
            3.路径可以是相对路径,也可以是绝对路径
            4.路径可以是存在的,也可以是不存在的
            5.创建File对象,只是把字符串路径封装为File对象,不考虑路径的真假情况
      */
        String pathName = "C:\\Users\\刘先生\\Desktop\\java-Md\\javaSE\\a.txt"; // 项目的根路径
        File file = new File(pathName);
        System.out.println(file);   // 重写了Object类的toString()方法 C:\Users\刘先生\Desktop\java-Md\javaSE\a.txt


        String pathName2 = "C:\\Users\\刘先生\\Desktop\\java-Md\\javaSE"; // 项目的根路径
        File file2 = new File(pathName2);
        System.out.println(file2);   // 重写了Object类的toString()方法 C:\Users\刘先生\Desktop\java-Md\javaSE


        String pathName3 = "b.txt"; // 相对路径
        File file3 = new File(pathName3);
        System.out.println(file3);  // 重写了Object类的toString()方法 b.txt


    }

    public static void show2(String parent, String child) {
    /*
        File(String parent,String child): 从父路径名字符串 和 子路径名字符串创建新的 File实例
        参数: 把路径分成了两部分
            String parent: 父路径
            String child:  子路径
        好处:
            父路径和子路径,可以单独的书写,用起来非常的灵活,父路径和子路径都可以变化

     */
        File file = new File(parent, child);
        System.out.println(file);
    }

    public static void show3() {
        /*
        File(File parent,String child): 根据parent抽象路径名 和 child路径名字符串创建新的 File实例
        参数: 把路径分成了两部分
            File parent: parent抽象路径名
            String child:  子路径
        好处:
            父路径和子路径,可以单独的书写,用起来非常的灵活,父路径和子路径都可以变化
            父路径是file类型,可以使用File的方法对路径进行一些操作,在使用路径创建对象
     */
        File parent = new File("c:\\");
        File file = new File(parent, "hello.java");
        System.out.println(file);   // c:\hello.java
    }

}
