package liuhui.com.oop.异常;


import java.util.InputMismatchException;
import java.lang.Exception;

/**
 * 当程序运行出现异常时，会报出异常并中断程序
 * 解决：
 * 1.使用if判断可能出现的异常
 * 优点  单一处理，其他代码可以继续运行
 * 缺点  需要单独处理代码，可能逻辑混乱
 * 2.使用java的异常处理处理异常 try catch
 * 优点 代码可读性高，不用特殊处理问题，try不会遗漏异常
 * 缺点 将一组代码做为了整体，即使第一行代码报错，后面也不会执行
 *
 * @author Thinkpad
 */

/**
 * 异常处理的自动生产
 * alt+shift+z
 * @author Thinkpad
 *
 * 可能一个try catch区域不能囊括所有异常，有可能会出现错误
 * 	一般写多catch块时，会将Exception放到最后，用来捕获未知异常，
 * 	不要将父类异常放到子类异常的前面，后面的异常无法捕获
 * 1.给各个可能出现异常的位置添加try catch
 * 		优点：可以单独处理不同代码的异常
 * 		缺点：作用域不统一
 * 2.将可能出现异常的代码统一加上try，并处理多个catch捕获异常
 *		优点：一般不会遗留异常
 *		缺点：将所有内容放到了一个try里，会让不需要处理的代码进行try
 */

/**
 * finally-总会执行，无论有没有异常，都会执行finally中的内容
 * 	输入在try catch finally中都用返回语句-将执行finally
 * @author Thinkpad
 * 用途：
 * 	1.完成值的返回，无论是否异常
 *  2.关闭使用完的资源
 *
 */


public class Test {
    public static void main(String[] args) {
        CountNumImp cn = new CountNum();
        try {

            //输入两个数
            System.out.println("请输入数字1:");
            int num1 = cn.input.nextInt();
            System.out.println("请输入数字2:");
            int num2 = cn.input.nextInt();

            //输出结果
            System.out.println(cn.add(num1, num2));
            System.out.println(cn.sub(num1, num2));
            System.out.println(cn.mult(num1, num2));
            System.out.println(cn.div(num1, num2));

            //异常的处理
        } catch (InputMismatchException e) {
            //打印运行方法栈结构
            e.getStackTrace();
            //获取异常出现的预设消息
            System.out.println("输入异常:" + e.getMessage());
        } catch (ArithmeticException e) {
            e.getStackTrace();
            System.out.println("数字异常:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("未知异常" + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
            // 关闭资源
            cn.input.close();
        }
        System.out.println("程序执行完毕");


    }
}
