package liuhui.com.oop.a1;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return
     */
    public boolean eat() {
        return this.age > 20 ? true : false;

    }

    /**
     * @param boll
     * @return
     */
    public String play(String boll) {
        return this.name + "正在玩" + boll;

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
