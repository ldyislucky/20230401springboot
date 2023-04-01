package com.ldy.controller;

import com.ldy.pojo.Book;
import org.springframework.web.bind.annotation.*;

/**
 * @author : ldy
 * @version : 1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/{id}")
    public Book get1(@PathVariable/*路径变量*/ int id){
        Book book = new Book();
        book.setId(id);
        System.out.println("get1"+book);
        return book;
    }
    @GetMapping
    public Book getAll(){
        Book book = new Book();
        System.out.println("getAll"+book);
        return book;
    }
    @GetMapping("/{book}")//不能用
    public Book getBook(@PathVariable Book book){
        System.out.println("getBook"+book);
        return book;
    }
    @PutMapping
    public Book put(@RequestBody Book book){
        System.out.println("put"+book);
        return book;
    }
    @PostMapping
    public Book post(@RequestBody Book book){
        System.out.println("post"+book);
        return book;
    }
    @DeleteMapping
    public Book delete(@RequestBody Book book){
        System.out.println("delete"+book);
        return book;
    }
}
