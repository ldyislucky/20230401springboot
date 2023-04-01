package com.ldy.service;


import com.ldy.dao.BookDao;
import com.ldy.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 乱码的原因是jdk用的不是1.8版本
 */
@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookDao bookDao;

    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }

    @Test
    public void t1(){
        System.out.println("=======================");
        System.out.println(bookDao);
        System.out.println(bookDao.getAll());
        System.out.println("=======================");
    }

}
