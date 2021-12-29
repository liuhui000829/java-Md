package liuhui.com.oop.异常;

/**
 * 抛出异常和自定义异常
 * @author Thinkpad
 * 可以在程序中手动抛出异常
 * 	1.使用 throw 抛出异常对象- new Exception()
 *  2.在方法上声明可能会出现的异常，让调用者处理
 *
 * 调用者处理异常
 * 	1.使用try catch块捕获
 *  2.继续在方法上声明异常-最后如果main也没有处理-则交给java虚拟机 jvm处理
 *  	缺点：方法中的剩余内容无法正常执行
 *
 * 自定义异常
 * 	1.定义异常类-继承一个异常类型 -常用Exception(必须处理的异常) RuntimeException(可以不处理的异常)
 *  2.编写构造，调用父类的构造方法，完成异常的创建
 *
 * Checked异常，程序必须处理该类异常
 * 运行时异常，不要求程序必须做出处理
 */

public class Test2 {
    public static void main(String[] args) {
        Person p =new Person();
        try{
            p.setName(null);
            p.setSex("人妖");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
        }
        System.out.println("执行完毕");

    }



}
