package com.liuhui.domain;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
/*
* 只有在容器中的组件 才有强大功能
*
*
* */

//@Component
//@ConfigurationProperties(prefix = "my-user")

@Slf4j              // 注入日志类
@EqualsAndHashCode //生成hashcode
@NoArgsConstructor  // 无参构造器
@AllArgsConstructor //使用所有参数构造器
@ToString
@Data
public class User {
    private String username;
    private int age;
    private Pet pet;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
}
