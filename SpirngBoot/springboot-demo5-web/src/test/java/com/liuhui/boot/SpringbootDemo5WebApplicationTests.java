package com.liuhui.boot;

import com.liuhui.boot.domain.User;
import com.liuhui.boot.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;
import javax.xml.transform.Templates;
import java.util.List;

@Slf4j
@SpringBootTest
class SpringbootDemo5WebApplicationTests {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Resource
    private DataSource dataSource;

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
//        List<User> userList = jdbcTemplate.queryForObject("select * from tab_user",List.class);
        Long aLong = jdbcTemplate.queryForObject("select count(*) from  tab_user", Long.class);
        log.info("总记录数为"+String.valueOf(aLong));

        log.info("数类型是{}"+dataSource.getClass());

    }

    @Test
    void testUserMapper(){
        System.out.println(userMapper.selectById(1));
    }

}












