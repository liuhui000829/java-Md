package liuhui.com.高级特性.IO.newIO;

import java.io.File;
import java.io.IOException;


public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        /*
         * public boolean createNewFile();当且仅当具有该名称的文件不存在时,创建一个新的文件夹
         * public boolean delete(); 删除由此File表示的文件或目录
         * public boolean mkdir(); 创建由此File表示的目录
         * public boolean mkdirs();创建由此File表示的目录, 包括任何必须但不存在的目录
         */
        show3();
    }

    public static void show1() throws IOException {
    /*
        public boolean createNewFile();当且仅当具有该名称的文件不存在时,创建一个新的文件夹
        创建文件的路径和名称在构造方法中给出(构造方法的参数)
        返回值:boolean
            true:文件不存在,创建文件,返回true
            false:文件存在,不会创建,返回false
        注意:
            1.此方法只能创建文件,不能创建文件夹
            2.创建文件的路径必须存在,否则会抛出异常

     */

        File file = new File("C:\\Users\\刘先生\\Desktop\\java-Md\\javaSE\\test.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);      // true


//        File file2 = new File("src\\test.txt");     // 相对路径
//        boolean newFile2 = file2.createNewFile();
//        System.out.println(newFile2);      // true


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

    public static void show3() {
    /*
        public boolean delete(); 删除由此File表示的文件或目录
        返回值:boolean
            true:文件/文件夹删除成功,返回true
            false: 文件夹中由内容,不会直接删除 返回false,路径不能存在返回false
        注意:
            delete方法是直接在硬盘删除文件/文件夹,不走回收站,删除谨慎
     */

        File file = new File("test.txt");
        if (file.exists()) {
            System.out.println(file.delete());       // true
        }

        File file2 = new File("1");
        if (file2.isDirectory()) {
            System.out.println(file2.delete());     //false 因为文件夹非空 所以删除不成功
        }
    }

}
