package com.ldy.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ldy.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : ldy
 * @version : 1.0
 */
@Mapper
//需要泛型类型与表名一致才能自动查询 不区分大小写
//类的属性名称与表的列名不许分大小写  但是名称仍然需要保持一致
public interface UserDao extends BaseMapper<User> {
}
