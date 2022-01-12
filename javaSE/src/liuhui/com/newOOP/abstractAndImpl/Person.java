package liuhui.com.newOOP.abstractAndImpl;

public abstract class Person implements A {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


    abstract public void show();

    public void print() {

    }
}
