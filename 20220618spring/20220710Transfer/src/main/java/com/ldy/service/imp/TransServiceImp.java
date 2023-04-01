package com.ldy.service.imp;

import com.ldy.dao.TransDao;
import com.ldy.service.TransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : ldy
 * @version : 1.0
 */
@Service
public class TransServiceImp implements TransService {
    @Autowired
    private TransDao transDao;
    @Override
    public void transaction(String name1, String name2, Double num) {
        transDao.outMoney(name1,num);
        //int i = 1/0;
        transDao.inMoney(name2,num);
    }
}
