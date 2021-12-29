package liuhui.com.oop.多态;

public class OverLoad {
    public int num;
    public int age;

    public OverLoad(int num, int age) {

    }

    public int OverLoad(String num, String age) {
        return 1;
    }

    public String OverLoad(String num, String age, int a) {
          return "2";
    }


}
