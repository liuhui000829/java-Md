package liuhui.com.oop.抽象类和接口2;

// 机票类
public class Ticker {
    private int num;
    private String tickerNum;



    public Ticker(){
        super();
    }
    public Ticker(String tickerNum,int num) {
        this.num=num;
        this.tickerNum = tickerNum;
    }



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTickerNum() {
        return tickerNum;
    }

    public void setTickerNum(String tickerNum) {
        this.tickerNum = tickerNum;
    }
   /* @Override
    public String toString() {
        return "Ticker{" +
                "num=" + num +
                ", tickerNum='" + tickerNum + '\'' +
                '}';
    }*/
}
