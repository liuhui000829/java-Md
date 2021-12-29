package liuhui.com.oop.a2;


public class User {
    private String name;
    private int age;

    public User(){}

    /**
     *
     * @param name
     * @param age
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     *
     */
    public void print() {
        System.out.print(this.name + "的年龄为" + this.age+",");
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

}
