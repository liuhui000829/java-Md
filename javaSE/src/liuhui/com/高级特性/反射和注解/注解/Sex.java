package liuhui.com.高级特性.反射和注解.注解;
@SuppressWarnings("all")
public enum Sex {
    M("001","男"),N("002","女");
    private String sexNum;
    private String sexName;



    Sex(String sexNum, String sexName){
        this.sexName=sexName;
        this.sexNum=sexNum;
    }

    public String getSexNum() {
        return sexNum;
    }

    public String getSexName() {
        return sexName;
    }


}
