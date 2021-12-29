package liuhui.com.oop.抽象类和接口2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("请输入用户名:  ");
        String userName = input.next();
        System.out.print("请输入密码:  ");
        String passWord = input.next();

        UserServerImp userServer = new UserServer();
        boolean bool = userServer.login(userName, passWord);
        if (bool) {
            System.out.println("登录成功");
        } else {
            System.out.println("登陆失败");
            System.exit(0);
        }

        // 实例机票
        TickerServerImp tickerServerImp = new TickerServer();
        // 打印所有的机票
        tickerServerImp.printList();

        // 机票数组 保存user购买的机票

        List<Ticker> tickers=new ArrayList<>(5);
        while (true) {
            // 是否购买上限

            System.out.println("请输入客机编号,输入0结束");
            String codeNum = input.next();
            if(tickers.size() == 3){
                System.out.println("购买上限 输入0结束");
                break;
            }


            if (!codeNum.equals("0")) {
                // 买票
                Ticker userTicker = tickerServerImp.buyTicker(codeNum);
                if(userTicker!=null){
                    tickers.add(userTicker);
                    System.out.println("购买成功");
                }
            } else {
                System.out.println("退出应用程序");
                break;
            }
        }
        System.out.println("剩余车票列表");
        tickerServerImp.printList();
        System.out.println("你购买的车票是:");
        for (int i = 0; i < tickers.size(); i++) {
            System.out.println(tickers.get(i).getTickerNum()+"    x1");
        }
    }
}
