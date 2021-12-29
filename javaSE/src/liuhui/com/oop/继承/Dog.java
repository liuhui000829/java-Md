package liuhui.com.oop.继承;

public class Dog extends Animal {
    private String color;

    public Dog(String name,int age,String color){
        super(name,age);
        this.color=color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("颜色是:"+this.color);
    }
}
