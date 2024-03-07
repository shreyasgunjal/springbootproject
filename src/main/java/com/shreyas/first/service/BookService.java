package com.shreyas.first.service;

import java.util.HashSet;
import com.shreyas.first.modal.Book;

public interface BookService {
    HashSet<Book> findAllBook();
    Book findBookByID(long id);
    void addBook(Book b);
    void deleteAllData();
    
}
