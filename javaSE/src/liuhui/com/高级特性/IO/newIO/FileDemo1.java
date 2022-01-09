package liuhui.com.高级特性.IO.newIO;

import java.io.File;

/**
 *  java.io.File类
 *  文件和目录的抽象表示
 *  java把电脑中的文件和文件夹(目录)封装成了一个File类,我们可以使用File类对文件和文件夹进行操作
 *  我们可以使用File的方法
 *      创建一个文件/文件夹
 *      删除一个文件/文件夹
 *      判断文件/文件夹是否存在
 *      对文件夹进行遍历
 *      获取文件的大小
 *  File类是一个与系统无关的类,任何操作系统都可以使用这个类中的方法
 *
 *  重点: 记住三个单词
 *      file: 文件
 *      directory: 文件夹/目录
 *      path: 路径
 *
 *
 *
 * @author 刘先生
 */
public class FileDemo1 {

    public static void main(String[] args) {
    /*
        static String pathSeparator      与系统相关的路径分隔符字符，为方便起见，表示为字符串。
        static char pathSeparatorChar    与系统相关的路径分隔符。

        static String separator          与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。
        static char separatorChar        与系统相关的默认名称分隔符。

        1. 操作路径: 路径不能写死
            c:\develop\a\a.txt                windows操作系统这样写
            c:/develop/a/a.txt                linux操作系统这样西
            //全部替换成 File.separator 动态的
            ”c:”+File.separator+“develop”+File.separator+“a”+File.separator+“a.txt“
    */

        String pathSeparator = File.pathSeparator;  // 路径分隔符 window: 分号;  linux: 冒号
        System.out.println(pathSeparator);          // ;

        String separator = File.separator;          // 文件名称分隔符 window: 反斜杠\   linux:正斜杠/
        System.out.println(separator);              // \








    }
}
