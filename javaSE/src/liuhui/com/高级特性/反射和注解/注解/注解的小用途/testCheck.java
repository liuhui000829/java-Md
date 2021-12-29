package liuhui.com.高级特性.反射和注解.注解.注解的小用途;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * <p>
 * 当主方法执行后 会自动自行检查所有加了Check注解的方法 判断方法是否有异常 记录到文件中
 */
@SuppressWarnings("all")
public class testCheck {
    public static void main(String[] args) throws IOException {
        // 创建计算器对象
        Calculator calculator = new Calculator();
        // 获取字节码文件
        Class cls = calculator.getClass();   // liuhui.com.高级特性.反射和注解.注解.注解的小用途.Calculator
        // 获取所有的方法
        Method[] methods = cls.getDeclaredMethods();
        // 出现异常的次数
        int count = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            // 判断方法上有没有Check字节码文件  // interface liuhui.com.高级特性.反射和注解.注解.注解的小用途.Check
            if (method.isAnnotationPresent(Check.class)) {
                // 有,执行
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    // 记录到文件中
                    count++;
                    bw.write(method.getName() + "方法出现了异常");
                    bw.newLine();
                    bw.write("异常的名称是: " + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因是: " + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("=======================================");
                }
            }
        }
        bw.write("异常一共出现了" + count + "次");

        bw.flush();
        bw.close();

    }
}
