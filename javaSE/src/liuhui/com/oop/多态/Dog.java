package liuhui.com.oop.多态;



public class Dog extends Animal {
    private String color;

    public Dog(){
        super();
    }

    public Dog(String name,int age,String color){
        super(name,age);
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 子类私有的方法 测试用
    public void DogPlay(){
    }

    @Override
    public void print(){
        super.print();
        System.out.println("颜色是:"+this.color);
    }
    // 测试返回值 父类或者是其子类
    @Override
    public Animal abc() {
        return new Cat();
    }


}
