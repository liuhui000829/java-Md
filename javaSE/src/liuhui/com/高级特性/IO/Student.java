package liuhui.com.高级特性.IO;


import java.io.Serializable;

//声明当前类可以序列化
public class Student implements Serializable {

    private static final long serialVersionUID = 3954009169783420876L;
    /**
     * 序列化版本号
     * 如果类的版本号不一致，则无法进行读取
     */


    private String name;
    private Integer age;
    private transient String password; //设置此属性为瞬时属性，不参与序列化
    private String sex;


    public Student(String name, Integer age, String password, String sex) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

