package com.ldy.Service;

import com.ldy.service.UserService;
import com.ldy.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : ldy
 * @version : 1.0
 */
@SpringBootTest
public class Test {
    @Autowired
    private UserService userService;
    @org.junit.jupiter.api.Test
    public void t1(){
        userService.met1();
    }
}
