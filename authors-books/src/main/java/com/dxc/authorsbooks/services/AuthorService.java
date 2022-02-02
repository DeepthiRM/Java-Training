package com.dxc.authorsbooks.services;

import java.util.List;
import com.dxc.authorsbooks.model.Author;

public interface AuthorService {

    public Author getAuthorById(int Id);
    
    public Author getAuthorByname(String Name);

    public Author getAuthorByEmail(String Email);

    public Author createAuthor(Author Author);

    public Author updateAuthor(Author Author);

    public void deleteAuthor(int Id);

    public List<Author> getAllAuthors();

    
}