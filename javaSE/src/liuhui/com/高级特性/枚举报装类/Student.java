package liuhui.com.高级特性.枚举报装类;

import liuhui.com.高级特性.枚举报装类.enums.Sex;

public class Student {
    private String name;
    private Sex sex; //值可以随便给 1 0 男和女

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    /**
     * @param name
     * @param sex
     */
    public Student(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    /**
     *
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {

        Student s=new Student("张三",Sex.M);
        Student ss=new Student("张三",Sex.N);
        System.out.println(s.getName()+"  "+s.getSex().getSexName()+"  "+s.getSex().getNum());

    }

}

