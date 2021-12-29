package liuhui.com.oop.static测试类;

public class Test {

    public static void main(String[] args) {

        while (true) {
            if (User.getNum() >= 10) {
                System.out.println("退出了");
                break;
            }
            User u = new User();


        }
    }
}
