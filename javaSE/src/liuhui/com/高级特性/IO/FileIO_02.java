package liuhui.com.高级特性.IO;


import java.io.*;
import java.util.Scanner;

public class FileIO_02 {
    private FileIO_02() {
    }

    /**
     * 用字符流的形式 存储字节流
     *
     * @param path
     * @return
     */
    public static String getFileStr(String path) {
        StringBuffer sb = new StringBuffer();
        try (InputStream is = new FileInputStream(path);
             // 通过字节流inputStream 创建字符流对象
             InputStreamReader isr = new InputStreamReader(is)) {
            while (true) {
                int i = isr.read();
                if (i == -1) {
                    break;
                }
                sb.append((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /**
     * 带缓冲的字符流读取
     *
     * @param path
     * @return
     */
    public static String getFileStrByBuild(String path) {
        StringBuilder sb = new StringBuilder();
        try (
                // 创建 FileInputStream
                InputStream is = new FileInputStream(path);
                // 创建InputStreamReader
                Reader reader = new InputStreamReader(is);
                // 创建 BufferedReader
                BufferedReader bd = new BufferedReader(reader);
        ) {

            while (true) {
                String line = bd.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /**
     * 写入文件
     *
     */
    public static void writeFile(String path, String str, Boolean isAppend) {
        //创建字符流写的对象 ,isAppend-是否进行拼接
        try (FileWriter fw = new FileWriter(path, isAppend)) {
            // 写入三遍
            fw.write(str);
            fw.write(str);
            fw.write(str);
            fw.flush();
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 写入文件 Scanner  输入:q则退出
     *
     * @param path
     * @param isAppend
     */
    public static void writeFileScanner(String path, Boolean isAppend) {
        Scanner scanner = new Scanner(System.in);
        //通过创建FileWriter对象创建BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, isAppend))) {
            System.out.println("请输入n退出");
            while (true) {
                String str = scanner.next();
                if (str.equals("n")) {
                    break;
                }
                bw.write(str);

                //重新开始一行
                bw.newLine();
                System.out.println("写入成功");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("保存完毕");
        }
    }

    /**
     * 对象的写入
     *
     * @param path
     * @param obj
     */
    public static void objFileWrite(String path, Object obj) throws Exception {

//        try (
//                OutputStream os = new FileOutputStream(path);
//                //使用文件输出流创建对象输出
//                ObjectOutput oos = new ObjectOutputStream(os)
//        ) {
//            oos.writeObject(obj);
//            oos.flush();
//            System.out.println("写入成功");
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //创建文件输出流
        FileOutputStream fos = new FileOutputStream(path);
        //使用文件输出流创建对象输出
        ObjectOutput oo = new ObjectOutputStream(fos);
        //使用对象输出将对象写入流中
        oo.writeObject(obj);

        //刷新
        oo.flush();

        //关闭资源
        oo.close();

        System.out.println("写入成功");
    }

    /**
     * @param path
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Object objFileRead(String path) throws Exception {

//        //创建ObjectInput对象
//        ObjectInput oi = new ObjectInputStream(new FileInputStream(path));
//
//        //ObjectInput对象读取文件中的对象
//        Object obj = oi.readObject();
//        return obj;



        ObjectInput obj = new ObjectInputStream(new FileInputStream(path));
        return obj.readObject();
    }

    /**
     * main 方法
     *
     * @param args
     */

    public static void main(String[] args) throws Exception{
//        String path = "C:\\Users\\刘先生\\Desktop\\test.txt";
//        String str = getFileStr(path);
//        String str = getFileStrByBuild(path);
//        System.out.println(str);


        // 写入操作
//        String path = "C:\\Users\\刘先生\\Desktop\\test.txt";
//        String str = getFileStrByBuild(path);
//
//        writeFile(path,str,true);
//
//        File file=new File(path);
//        System.out.println(file.length());

        // 写入2
//        String path = "C:\\Users\\刘先生\\Desktop\\test.txt";
//        writeFileScanner(path, true);


        //对象的写入
//        String path = "C:\\Users\\刘先生\\Desktop\\test.txt";
//        Student stu = new Student("123", 185, "123456", "男");
//        objFileWrite(path, stu);


        // 对象的读取
        String path = "C:\\Users\\刘先生\\Desktop\\test.txt";
        Object obj = objFileRead(path);
        System.out.println((Student)obj);
    }
}
