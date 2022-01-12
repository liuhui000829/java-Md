package liuhui.com.newOOP.abstractAndImpl;

public class Zi extends Person {
    @Override
    public void show() {
        System.out.println(this.getA());
    }
    public void show(int a) {
        System.out.println(this.getA());
    }



    @Override
    public int money() {
        return 0;
    }

    public  int money(int a){
        return 2;
    }
    @Override
    public void print() {
        System.out.println("zi print");
    }

    public void print(int a) {
        System.out.println("zi print" + a);
    }
}
