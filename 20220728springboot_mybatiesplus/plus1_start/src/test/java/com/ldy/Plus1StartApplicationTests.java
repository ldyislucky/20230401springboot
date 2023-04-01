package com.ldy;

import com.ldy.dao.UserDao;
import com.ldy.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Plus1StartApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        List<User> users = userDao.selectList(null);
        users.forEach(u-> System.out.println(u));
    }

}
