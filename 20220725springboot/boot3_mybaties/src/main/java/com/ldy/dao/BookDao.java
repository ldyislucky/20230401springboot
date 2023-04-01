package com.ldy.dao;

import com.ldy.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : ldy
 * @version : 1.0
 */
@Mapper
@Repository
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
  public Book getById(Integer id);
}
