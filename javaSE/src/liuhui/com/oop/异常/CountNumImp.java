package liuhui.com.oop.异常;

import java.util.Scanner;

public interface CountNumImp {
    Scanner input =new Scanner(System.in);

    /**
     * 加法
     * @param num1
     * @param num2
     */
    int add(int num1,int num2);

    /**
     * 减法
     * @param num1
     * @param num2
     */
    int sub(int num1,int num2);

    /**
     * 乘法
     * @param num1
     * @param num2
     */
    int mult(int num1,int num2);

    /**
     * 除法
     * @param num1
     * @param num2
     */
    int div(int num1,int num2);
}
