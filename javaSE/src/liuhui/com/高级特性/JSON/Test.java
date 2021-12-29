package liuhui.com.高级特性.JSON;

import liuhui.com.高级特性.Util.JsonUtil;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> studentList = new ArrayList<Integer>() {
            private static final long serialVersionUID = -1026603476646165891L;
            {
                add(123);
                add(456);
                add(789);
            }
        };
//      路径中有中文会报错  改成英文就行
        Student stu = new Student("张三", 18, studentList);
        JsonUtil<Student> json = new JsonUtil<>();
        String str=json.ObjToJson(stu);
        System.out.println(str);


        Student stu2=json.JsonToObject(str,Student.class);
        System.out.println(stu2.getName());
    }
}
