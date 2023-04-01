package com.ldy.service.imp;

import com.ldy.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author : ldy
 * @version : 1.0
 */
@Service
public class UserServiceImp implements UserService {

    @Override
    public void met1() {
        System.out.println("Userservice");
    }
}
