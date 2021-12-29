package liuhui.com.oop.抽象类和接口2;

public class UserServer implements UserServerImp {
    User[] users = {
            new User("张三", "000829"),
            new User("李四", "123456")
    };

    @Override
    public boolean login(String name, String pwd) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserName().equals(name) && users[i].getPassWord().equals(pwd)) {
                return true;
            }
        }
        return false;
    }
}
