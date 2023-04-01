package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag,flag ? Code.SAVE_OK:Code.SAVE_ERR);//顺序不能反
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag,flag?Code.UPDATA_OK:Code.UPDATA_ERR);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag,flag?Code.DELETE_OK:Code.DELETE_ERR);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        return new Result(
                book,
                (book!=null)?Code.GET_OK:Code.DELETE_ERR,
                (book==null)? "查询错误！请重新尝试":"查询成功"
                );
    }

    @GetMapping
    public Result getAll() {
        List<Book> books = bookService.getAll();
        System.out.println(books);
        return new Result(
                books,
                (books!=null)?Code.GET_OK:Code.DELETE_ERR,
                (books==null)? "查询错误！请重新尝试":""
        );
    }
}
