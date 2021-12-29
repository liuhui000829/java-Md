package liuhui.com.oop.static选民投票;

// 候选人类
public class Candidate {
    private static  int count;
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum() {
        this.num++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount() {
       count++;
    }
}
