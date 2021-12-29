package liuhui.com.oop.抽象类和接口3;

public class Print implements Box,Paper{
    private String color;
    private String type;

    public Print(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void BoxColor(String color) {
        if(color.equals("黑白")){
            this.color="黑白";

        }else{
            this.color="彩色";
        }

    }

    @Override
    public void paperType(String type) {
        if(type.equals("A4")){
            this.type="A4";
        }else{
            this.type="B5";
        }
    }
    //打印方法
    public void show(){
        System.out.println("使用"+this.color+"墨盒在"+this.type+"纸上打印");
    }
}
