package liuhui.com.oop.多态;



public class Cat extends Animal {
    private String sex;

    public  Cat(){}
    public Cat(String name, int age,String sex) {
        super(name, age);
        this.sex=sex;
    }

    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("性别是:"+this.getSex());

    }
}
