package com.springswaggerdemo.SpringSwaggerDemoApp.service;

import com.springswaggerdemo.SpringSwaggerDemoApp.model.Book;
import com.springswaggerdemo.SpringSwaggerDemoApp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public Book saveBook(Book book) {
        repository.save(book);
        return book;
    }

    public List<Book> getBook() {
        List<Book> bookList = repository.findAll();
        return bookList;
    }

    public String updateBook(Book book, Integer id) {
        if (repository.findById(id).isPresent()) {
            Book olddata = (Book) repository.findById(id).get();
            olddata.setName(book.getName());
            olddata.setPrice(book.getPrice());

            repository.save(olddata);
            return "Updated Successfully";
        }
        return "Updation Failed";


    }
    public String deleteBook(Book book,Integer id){
        repository.deleteById(id);
        return "Delete successfully";

    }
}
