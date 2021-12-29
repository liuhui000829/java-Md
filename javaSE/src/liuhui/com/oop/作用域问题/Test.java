package liuhui.com.oop.作用域问题;


import liuhui.com.oop.a3.Student;

/**
 * 如果一个类在两个包都有 那么就得用   liuhui.com.oop.作用域问题.Student stu2=new liuhui.com.oop.作用域问题.Student(); 形式
 *
 *  scope/修饰符     当前类中    同一个包中   子类中     任何地方
 *  private          √             X        X           X
 *  默认修饰符         √             √        X           X
 *  protected        √             √        √           X
 *  public           √             √        √           √
 *
 *
 * @author 刘先生
 */
public class Test {
    public static void main(String[] args) {
        Student stu=new Student();
        liuhui.com.oop.作用域问题.Student stu2=new liuhui.com.oop.作用域问题.Student();
        /**
         *  num public
         *  id 默认
         *  stuNum protected
         */
        System.out.println(stu2.num);
        System.out.println(stu2.stuNum);
        System.out.println(stu2.id);
    }
}
