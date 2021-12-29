package liuhui.com.高级特性.反射和注解.注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(value = {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    int value();

    AnnotationTest aTest();     // 注解类型

    String[] str() default {"123", "456"};  // 字符类型而且有默认值

    Sex sex(); //枚举类型
}
