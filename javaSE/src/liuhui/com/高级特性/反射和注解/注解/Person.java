package liuhui.com.高级特性.反射和注解.注解;

import java.util.List;

@SuppressWarnings("all")
public class Person {
    private String name;
    private int age;
    private List<Integer> hobby;

    public Person() {

    }

    public Person(String name, int age, List<Integer> hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
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

    public List<Integer> getHobby() {
        return hobby;
    }

    public void setHobby(List<Integer> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + hobby +
                '}';
    }

    public void print() {
        System.out.println("打印");
    }

    public void print(String aa) {
        System.out.println("打印" + aa);
    }

    public void show() {
        this.aa();
    }

    @Deprecated
    public void aa() {
        System.out.println("不推荐使用");
    }

}
