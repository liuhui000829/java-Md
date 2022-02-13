package liuhui.com.高级特性.线程.线程同步;

// 不安全的取钱
// 两个人去银行取钱,账户

public class _03UnSafeBank {
    public static void main(String[] args) {
        Account account = new Account(1000, "结婚基金");
        Drawing you = new Drawing(account, 50, "you");
        Drawing girlFriend = new Drawing(account, 100, "girlFriend");

        you.start();
        girlFriend.start();

    }
}

// 账户
class Account {
    int money; //余额
    String name; // 卡名

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

// 银行: 模拟
class Drawing extends Thread {

    Account account;
    int drawingMoney;   // 取的钱
    int nowMoney;       // 现在的钱

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    // 取钱
    @Override
    public void run() {
        // 所得对象就是变化的量  比如增删改
        synchronized (account) {
            // 判断有没有钱
            if (account.money - drawingMoney < 0) {
                System.out.println(this.getName() + "钱不够，取不了");
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 卡内余额
            account.money = account.money - drawingMoney;
            // 你手里的钱
            nowMoney = nowMoney + drawingMoney;
            System.out.println(this.getName() + "手里的钱为" + nowMoney);  // 因为继承了thread 所以相当于有Thread.currentThread().getName()
            System.out.println(account.name + "余额为" + account.money);
        }
    }
}
