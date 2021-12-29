package liuhui.com.oop.a2;

public class Bill {
    double money = 0.0;

    /**
     *
     * @param age
     * @return
     */
    public double CalcMoney(int age) {
        if (age > 60 || age < 6) {
            money = 0;
        } else {
            money = 50;
        }
        return money;
    }

    /**
     *
     */
    public void print() {
        if (money == 0) {
            System.out.println("门票免费" + "\n");
        } else {
            System.out.println("门票价格为" + money + "\n");
        }

    }

}
