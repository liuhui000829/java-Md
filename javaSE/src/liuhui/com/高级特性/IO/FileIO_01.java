package liuhui.com.高级特性.IO;

import java.io.*;

public class FileIO_01 {
    private FileIO_01() {
    }

    public static String readFile(String path) {

        StringBuffer sb = new StringBuffer();

        try(FileInputStream fis=new FileInputStream(path)) {
            while (true) {
                //按照字节流进行读取
                int i = fis.read();
//                System.out.println(i);          //输出的是 uicode编码
                if (i == -1) {
                    break;
                }
                char ch = (char) i;
                sb.append(ch);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       return sb.toString();

    }
    public static void writeFile(String path,String str)  {

        try(OutputStream os=new FileOutputStream(path)){    //这么写都不用关闭 os流了
            // 通过字符串获取byte类型的数组
           byte [] by=str.getBytes();
            os.write(by);
           //刷新缓存
            os.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("写入成功");
        }

    }
    public static void main(String[] args) {
        String oldPath = "C:\\Users\\刘先生\\Desktop\\测试IO2 - 副本\\1\\1-1\\1-1-1\\123.txt";
        String oldPath2 = "C:\\Users\\刘先生\\Desktop\\测试IO2 - 副本\\1\\1-1\\1-1-1\\456.txt";

        String str = FileIO_01.readFile(oldPath);
        FileIO_01.writeFile(oldPath2,str);


    }


}
