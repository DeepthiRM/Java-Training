package com.dxc.authorsbooks.services;

import java.util.List;
import com.dxc.authorsbooks.model.Book;

public interface BookService {

    public Book getBookById(int Id);

    public Book getBookByTitle(String Title);

    public Book getBookByIsbn(int Isbn);

    public Book createBook(Book Book);

    public Book updateBook(Book Book);

    public void deleteBook(int Id);

    public List<Book> getAllBooks();

}