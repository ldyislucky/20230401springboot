package com.ldy;

import com.ldy.dao.BookDao;
import com.ldy.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Boot3MybatiesApplicationTests {
    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        Book book = bookDao.getById(2);
        System.out.println(book);

    }

}
