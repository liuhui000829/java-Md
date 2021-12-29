package liuhui.com.高级特性.JSON;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
    private static final long serialVersionUID = -8103799203957780939L;
    private String name;
    private int age;
    private List<Integer> list;

    public Student(String name, int age, List<Integer> list) {
        this.name = name;
        this.age = age;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                '}';
    }
}
