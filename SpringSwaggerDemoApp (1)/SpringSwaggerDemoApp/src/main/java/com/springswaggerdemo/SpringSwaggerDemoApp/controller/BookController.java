package com.springswaggerdemo.SpringSwaggerDemoApp.controller;

import com.springswaggerdemo.SpringSwaggerDemoApp.model.Book;
import com.springswaggerdemo.SpringSwaggerDemoApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    public BookService bookService;
    @GetMapping(value = "/all")
    public @ResponseBody List<Book> getAllEmployeeDetail(){

        return bookService.getBook();
    }

  @PostMapping(value = "/create")
    public @ResponseBody String createBook(@RequestBody Book book){
       bookService.saveBook(book);
        return "Book created successfully";
    }
    @PutMapping(value = "/edit/{id}")
    public @ResponseBody String editBook(@PathVariable("id") Integer id,@RequestBody Book book){
        return bookService.updateBook(book,id);
    }
    @DeleteMapping(value = "delete/{id}")
    public @ResponseBody String deleteBook(@PathVariable("id") Integer id, @RequestBody Book book){
        return bookService.deleteBook(book,id);
    }
}
