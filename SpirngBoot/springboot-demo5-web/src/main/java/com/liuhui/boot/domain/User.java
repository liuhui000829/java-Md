package com.liuhui.boot.domain;

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
    private int uid;
    private String username;
    private String password;



}
