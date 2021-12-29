package liuhui.com.高级特性.枚举报装类.enums;

/**
 * 学习枚举
 * 	-一个特殊的类，定义时用enum定义
 * 1. 创建私有有参构造，
 * 2. 创建get方法
 * 4. 常量方法-调用私有的构造，创建当前对象-（常量方法要放到最开始）
 *
 * 使用：
 * 	1.使用枚举名称.常量方法.get需要的值既可
 * @author Thinkpad
 *
 */
public enum Sex {

    M("男",100),N("女",200);
    private String sexName;
    private Integer num;            // 编号

    public String getSexName() {
        return sexName;
    }

    public Integer getNum() {
        return num;
    }

    private Sex(String sexName,Integer num) {
        this.sexName = sexName;
        this.num=num;
    }
}
