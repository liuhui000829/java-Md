package liuhui.com.oop.a2;

import java.util.Scanner;

/**
 * 一个景区根据游人的年龄收取不同价格的门票 根据年龄段收取
 */
public class Test {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        User user;
        Bill bill = new Bill();

        while (true) {
            //输入姓名判断
            System.out.print("请输入姓名:  ");
            String name = scanner.next();

            if (name.equals("n")) {
                System.out.println("退出程序");
                break;
            }

            //输入年龄
            System.out.print("请输入年龄:  ");
            int age = scanner.nextInt();

            //实例化 类
            user = new User(name, age);

            bill.CalcMoney(user.getAge());

            user.print();
            bill.print();
        }


    }
}
