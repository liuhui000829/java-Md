package liuhui.com.高级特性.反射和注解.注解.注解的小用途;

/**
 * 计算器类
 */
@SuppressWarnings("all")
public class Calculator {
    @Check
    public void add(){
        System.out.println("10 + 0 ="+(10+0));
    } @Check
    public void sub(){
        System.out.println("10 - 0 ="+(10-0));
    } @Check
    public void mul(){
        System.out.println("10 * 0 ="+(10*0));
    } @Check
    public void div(){
        System.out.println("10 / 0 ="+(10/0));
    }


}
