package com.springswaggerdemo.SpringSwaggerDemoApp.repository;

import com.springswaggerdemo.SpringSwaggerDemoApp.model.Book;
//import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Integer> {
    Optional<Book> findById(Integer id);

    void deleteById(Integer id);
}
