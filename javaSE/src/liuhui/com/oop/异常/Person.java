package liuhui.com.oop.异常;


// 自定义异常
public class Person {
    private String name;
    private String sex;

    public Person() {
        super();
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    //throws Exception ：声明当前对象可能出现的异常
    public void setName(String name) throws Exception {
        if (name == null) {
            //创建一个异常-异常的消息为"名称不能为空，通过throw抛出
            throw new Exception("姓名不能为空");
        }
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) throws SexException {
        if (sex == null) {
            throw new NullPointerException();
        }
        if (!sex.equals("男") || !sex.equals("女")) {
            throw new SexException("输入的性别不对");
        }
        this.sex = sex;
    }
    public void print() {
        System.out.println("姓名是:" + this.getName() + "  性别是:" + this.getSex());
    }
}
