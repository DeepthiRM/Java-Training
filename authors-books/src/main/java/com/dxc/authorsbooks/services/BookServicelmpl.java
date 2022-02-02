package com.dxc.authorsbooks.services;

import java.util.List;
import com.dxc.authorsbooks.model.Book;

import com.dxc.authorsbooks.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServicelmpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow();
    }

    @Override
    public Book createBook(Book Book) {
        return bookRepository.save(Book);
    }

    @Override
    public Book updateBook(Book Book) {
        return bookRepository.save(Book);
    }

    @Override
    public void deleteBook(int id) {
        Book book = getBookById(id);
        bookRepository.delete(book);

    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookByTitle(String Title) {
        
        return null;
    }

    @Override
    public Book getBookByIsbn(int Isbn) {
        
        return null;
    }

}