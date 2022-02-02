package com.dxc.authorsbooks.services;

import java.util.List;
import com.dxc.authorsbooks.model.Author;
import com.dxc.authorsbooks.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author createAuthor(Author Author) {
        return authorRepository.save(Author);
    }

    @Override
    public void deleteAuthor(int Id) {
        Author Author = getAuthorById(Id);
        authorRepository.delete(Author);
        
    }

    @Override
    public List<Author> getAllAuthors() {
        
        return authorRepository.findAll();
    }

    @Override
    public Author getAuthorByEmail(String Email) {
    
        return null;
    }

    @Override
    public Author getAuthorById(int Id) {
        
        return authorRepository.findById(Id).orElseThrow();
    }


    @Override
    public Author updateAuthor(Author Author) {
        
        return authorRepository.save(Author);
    }

    @Override
    public Author getAuthorByname(String Name) {
    
        return null;
    }
}

   

    