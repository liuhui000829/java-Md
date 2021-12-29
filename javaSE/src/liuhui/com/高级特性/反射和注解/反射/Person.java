package liuhui.com.高级特性.反射和注解.反射;


public class Person {
    private String name;
    private Integer age;
    private String cardId;

    public String a;
    protected String b;
    String c;
    private String d;

    public Person() {
    }


    private Person(Integer age,String name){
        this.age=age;
        this.name=name;
    }
    public Person(String name, Integer age, String cardId) {
        this.name = name;
        this.age = age;
        this.cardId = cardId;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cardId='" + cardId + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
    public void eat(String food){
        System.out.println("吃"+food);
    }
    public void eat(){
        System.out.println("吃饭了");
    }
    private void show(){
        System.out.println("展示");
    }

}
