package liuhui.com.oop.a3;

public class StudentServer {

    Student[] stus = new Student[10];

    /**
     * @param stu 学生
     */
    public void add(Student stu) {
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] == null) {
                stus[i] = stu;
                System.out.println("添加成功");
                return;
            }
        }
        System.out.println("添加失败");
    }

    /**
     * @param name     姓名
     * @param startNum 开始位置
     * @param endNum   结束位置
     */
    public void printStuInfo(String name, int startNum, int endNum) {
        for (int i = startNum - 1; i < endNum; i++) {
            if (stus[i] != null && stus[i].getName().equals(name)) {
                System.out.println("找到了,学号为:" + stus[i].getStuNum() + "   姓名为:" + stus[i].getName());
                return;
            }
        }

        System.out.println("没有找到");
    }
}
