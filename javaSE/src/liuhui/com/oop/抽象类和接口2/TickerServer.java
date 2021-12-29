package liuhui.com.oop.抽象类和接口2;

public class TickerServer implements TickerServerImp {

    Ticker[] tickers = {
            new Ticker("mh3301", 30),
            new Ticker("mh3302", 30),
            new Ticker("mh3303", 30),
    };


    @Override
    public void printList() {
        for (int i = 0; i < tickers.length; i++) {
            System.out.println("编号是:" + tickers[i].getTickerNum() + "  数量是:" + tickers[i].getNum());
        }
    }


    @Override
    public Ticker buyTicker(String tickerNum) {
        for (int i = 0; i < tickers.length; i++) {
            if (tickers[i] != null) {
                if (tickers[i].getTickerNum().equals(tickerNum)) {
                    tickers[i].setNum(tickers[i].getNum() - 1);
                    return tickers[i];
                }
            }
        }
        System.out.println("没有这个班次");
        return null;
    }

}
