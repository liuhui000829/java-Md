package liuhui.com.oop.继承;

public class Animal {
    private String name;
    private int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
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

    public void print(){
        System.out.println("年龄:"+this.getAge()+"名字是:"+this.getName());
    }
}
