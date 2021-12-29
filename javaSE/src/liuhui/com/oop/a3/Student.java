package liuhui.com.oop.a3;

public class Student {
    private String name;
    private int stuNum;

    public Student() {

    }

    public Student(String name, int stuNum) {
        this.name = name;
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }
}
