package liuhui.com.高级特性.IO;

import java.io.File;
import java.io.IOException;
/**
 * File的学习
 * @author Thinkpad
 * 增
 * 	mkdir() 创建一个文件夹，父级目录必须存在
 * 	mkdirs() 根据路径级联创建不存在的文件夹
 *  createNewFile() 创建一个文件，父级目录必须存在
 * 删
 * 	delete() 删除文件夹或文件，路径下不允许有文件夹或文件
 * 改
 * 	renameTo() 修改文件或文件夹的路径位置
 * 查
 * 	exists() 查询file对应的文件是否存在
 *  getParent() 获取父路径的字符串
 *  getParentFile() 获取父路径的映射对象
 *  listFiles() 获取当前路径下的下一级路径信息
 *  getAbsolutePath() 获取绝对路径
 *  isFile()查询是否是一个文件
 *  getName() 获取文件或文件夹的名称
 */
// fileUtil工具类
public class FileUtil {

    private FileUtil() {
    }

    // 创建一个文件夹
    public static void createMkdir(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("文件已经存在");
            return;
        }
        if (file.mkdir()) {
            System.out.println("创建成功");
            return;
        }
        System.out.println("创建失败");

    }

    // 创建多个文件夹
    public static void createMkdirs(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("文件已经存在");
            return;
        }
        if (file.mkdirs()) {
            System.out.println("创建成功");
            return;
        }
        System.out.println("创建失败");
    }

    // 是否联级 创建
    public static void createMkdir(String path, boolean isPar) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("文件已经存在");
            return;
        }
        if (isPar) {
            if (file.mkdirs()) {
                System.out.println("创建成功");
                return;
            }
        } else {
            if (file.mkdir()) {
                System.out.println("创建成功");
                return;
            }
        }
        System.out.println("创建失败");
    }

    // 创建文件
    // 思路 先看它的父级别文件夹在不在
    // 如果没有父文件夹 那么创建出错
    public static void createFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
                System.out.println("父路径不存在 已经创建完成");
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("文件创建完成");
            }
        } else {
            System.out.println("该文件已经存在");
        }
    }

    /**
     * 删除文件或者文件夹
     *
     * @param path
     */
    public static void delFiles(String path) {
        File file = new File(path);
        if (file.delete()) {
            System.out.println("删除成功");
            return;
        }
        System.out.println("删除失败");
    }

    public static void delFiles(String path, boolean isFic) {
        if (!isFic) {
            delFiles(path);
            return;
        }

        File file = new File(path);
        if (file.exists()) {
            delLinked(file);
            System.out.println("删除成功");
        } else {
            System.out.println("没有这个文件");
        }

    }

    /**
     * 递归删除
     *
     * @param file
     */
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
        // 如果不写下面这一行 那么删除不干净
        file.delete();

    }

    /**
     * 剪切
     * 有bug 可能老文件不在 新的文件没有目录
     */
    public static void cutFile(String oldPath, String newPath) {
        File file = new File(oldPath);
        File file2 = new File(newPath);
        if (file.renameTo(file2)) {
            System.out.println("剪切成功");
            return;
        }
        System.out.println("剪切失败");

    }

    public static void fileInfo(String path){
        File file=new File(path);
        System.out.println("文件路径为"+file.getAbsoluteFile());
        if(file.isFile()){
            System.out.println("这是一个文件");
            System.out.println("文件名称"+file.getName());
            System.out.println("长度为"+file.length());
        }else{
            System.out.println("这是一个文件夹");
            System.out.println("文件名称"+file.getName());
        }
    }

    public static void main(String[] args) {

            String path = "C:\\Users\\刘先生\\Desktop\\测试IO2 - 副本";

            // FileUtil.createMkdir(path);             // 如果测试IO2没有   那么测试IO2\\liu不能创建

            // FileUtil.createMkdirs(path);               // 就算没有IO2  那么IO2\\liu 也能创建

            //FileUtil.createMkdir(path,true);

//        FileUtil.createFile(path);
//        FileUtil.delFiles(path,true);

//      剪切
            String oldPath = "C:\\Users\\刘先生\\Desktop\\测试IO2 - 副本\\1\\1-1\\1-1-1 - 副本";
            String newPath = "C:\\Users\\刘先生\\Desktop\\测试IO2 - 副本\\2";
            FileUtil.cutFile(oldPath,newPath);


//        FileUtil.fileInfo(oldPath);
//        FileUtil.fileInfo(newPath);
    }
}