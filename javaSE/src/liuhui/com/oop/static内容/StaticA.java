package liuhui.com.oop.static内容;

public class StaticA {
    public int num1;
    // 静态属性
    public static int num2;

    /**
     * 普通方法可以对静态属性操作
     */
    public void add() {
        num1++;
        num2++;
    }

    /**
     * 静态方法只能对静态属性操作
     */

    public static void staticAdd() {
        // num1++ ;  //报错
        num2++;
    }


}
