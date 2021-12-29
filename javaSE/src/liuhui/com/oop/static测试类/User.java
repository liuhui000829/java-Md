package liuhui.com.oop.static测试类;

public class User {

    private static int num;

    public User() {
        this.num++;
        System.out.println("创建了" + this.num + "个User对象");
    }


    public static int getNum() {
        return num;
    }

}
