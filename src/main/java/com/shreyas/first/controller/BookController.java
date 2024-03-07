package com.shreyas.first.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shreyas.first.modal.Book;
import com.shreyas.first.service.BookServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;






@RestController
public class BookController {
    
    @Autowired
    BookServiceImpl bookServiceImpl;

    
    @PostMapping("/")
    public void addBook(@RequestBody Book book){
        bookServiceImpl.addBook(book);
    }

    @GetMapping("/findAll")
    public HashSet<Book> getAllBook() {
        return bookServiceImpl.findAllBook();
    }

    @GetMapping("/findbyid/{id}")
    public Book getBookByID(@PathVariable long id){
        return bookServiceImpl.findBookByID(id);
    }
    
    @DeleteMapping("/delete")
    public void deleteData(){
        bookServiceImpl.deleteAllData();
    }
    
}
