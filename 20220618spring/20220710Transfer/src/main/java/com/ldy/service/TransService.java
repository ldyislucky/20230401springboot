package com.ldy.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author : ldy
 * @version : 1.0
 */
@Transactional//在接口上添加事务管理
public interface TransService {
    void transaction(String name1, String name2, Double num);
}
