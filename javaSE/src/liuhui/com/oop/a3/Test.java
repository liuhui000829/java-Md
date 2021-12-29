package liuhui.com.oop.a3;

public class Test {
    public static void main(String[] args) {
        int num = 1000;
        Student stu1 = new Student("张三1", ++num);
        Student stu2 = new Student("张三2", ++num);
        Student stu3 = new Student("张三3", ++num);
        Student stu4 = new Student("张三4", ++num);
        Student stu5 = new Student("张三5", ++num);

        StudentServer stuSer = new StudentServer();
        stuSer.add(stu1);
        stuSer.add(stu2);
        stuSer.add(stu3);
        stuSer.add(stu4);
        stuSer.add(stu5);

        System.out.println();
        stuSer.printStuInfo("张三5",1,5);
    }
}
