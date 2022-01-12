package liuhui.com.newOOP.abstractAndImpl;

public class Test {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.print();
        zi.print(123);
        System.out.println(zi.getA());
        zi.show();
        zi.show( 10);

        System.out.println(zi.money());
        System.out.println(zi.money(10));
    }

}
