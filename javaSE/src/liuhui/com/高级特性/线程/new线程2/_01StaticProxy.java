package liuhui.com.高级特性.线程.new线程2;

/*
 *  静态代理模式总结:
 *  1. 真实对象 和 代理对象 都要实现同一个接口
 *  2. 代理对象要代理真实角色
 *  好处:
 *   // 代理对象可以做很多真实对象做不了的事情
 *   // 真实对象专注做自己的事情
 *
 * */
public class _01StaticProxy {
    public static void main(String[] args) {
        You you = new You();

        new Thread(() -> System.out.println("我爱你")).start();

        new WeddingCompany(you).happyMarry();   // 传入目标对象

    }
}

// 结婚
interface Merry {
    void happyMarry();
}

// 真实角色: 你去结婚
class You implements Merry {

    @Override
    public void happyMarry() {
        System.out.println("结婚了");
    }
}

// 代理角色: 帮助你结婚
class WeddingCompany implements Merry {

    private Merry target;

    public WeddingCompany(Merry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        this.before();
        this.target.happyMarry();
        this.after();
    }

    private void before() {
        System.out.println("结婚之前喜气洋洋");
    }

    private void after() {
        System.out.println("结婚之后愁眉苦脸");
    }
}




















