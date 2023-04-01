package com.ldy.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author : ldy
 * @version : 1.0
 */
@Repository
public interface TransDao {
    @Update("update trans set money = money - #{num} where username =#{name}")
    void outMoney(@Param("name") String name, @Param("num") Double num);
    @Update("update trans set money = money + #{num} where username = #{name}")
    void inMoney(@Param("name") String name,@Param("num") Double num);
}
