package liuhui.com.高级特性.IO.newIO;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
    /*
         public boolean exists(); 此File表示的文件或目录是否实际存在。
         public boolean isDirectory(): 此File表示的是否是目录
         public boolean ifFile(): 此File表示的是否是文件

    */
        show2();


    }

    public static void show1() {
    /*
        public boolean exists(); 此File表示的文件或目录是否实际存在。
        1.用户判断构造方法中的路径是否存在
            存在: true
            不存在: false
     */

        File file = new File("C:\\Users\\刘先生\\Desktop\\java-Md\\javaSE");
        System.out.println(file.exists());      // true

        // 相对路径 相对于项目的根路径 相当于C:\\Users\\刘先生\\Desktop\\java-Md\\javaSE\\java基础.iml
        File file2 = new File("java基础.iml");
        System.out.println(file2.exists());     // true

        // 不存在的相对路径 相对于项目的根路径
        File file3 = new File("java基础2.iml");
        System.out.println(file3.exists());     // false





    }

    public static void show2() {
    /*
         public boolean isDirectory(): 此File表示的是否是目录
         public boolean ifFile(): 此File表示的是否是文件
         注意:
            1.用之前最好用exists判断一下,不存在就不用判断了
            2.这两个方法是互斥的 因为电脑中要么是文件夹要么是文件

     */
        String pathName="C:\\Users\\刘先生\\Desktop\\java-Md\\javaSE";
        String pathName2="java基础.iml";  //相对路径

        File file = new File(pathName);
        if(file.exists()){  // 不存在就没有必要获取
            System.out.println("file "+file.isDirectory());     // true
            System.out.println("file "+file.isFile());          // false
        }


        File file2 = new File(pathName2);
        if(file2.exists()){
            System.out.println("file2 "+file2.isDirectory());   // false
            System.out.println("file2 "+file2.isFile());        // true
        }




    }


}
