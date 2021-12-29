package liuhui.com.oop.异常;

public class CountNum implements CountNumImp{


    @Override
    public int add(int num1, int num2) {
    return  num1+num2;
    }

    @Override
    public int sub(int num1,int num2) {
       return num1-num2;
    }

    @Override
    public int mult(int num1,int num2) {
        return num1*num2;
    }

    @Override
    public int div(int num1,int num2) {
        return num1/num2;
    }
}
