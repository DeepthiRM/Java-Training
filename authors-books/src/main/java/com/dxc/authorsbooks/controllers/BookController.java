package com.dxc.authorsbooks.controllers;
import java.time.LocalDate;
import java.util.List;

import com.dxc.authorsbooks.model.Book;
import com.dxc.authorsbooks.repository.BookRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookRepository repository;

    BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Books")
    List<Book> all() {
        return repository.findAll();
    }

    @PostMapping("/Books")
    Book NewBook(@RequestBody Book NewBook) {
        return repository.save(NewBook);
    }

    @GetMapping("/Books/{Id}")
    Book one(@PathVariable Integer Id) {

        return repository.findById(Id)
                .orElseThrow(() -> new BookNotFoundException(Id));
    }

    @PutMapping("/Books/{Id}")
    Book replaceBook(@RequestBody Book NewBook, @PathVariable Integer Id, Book Book) {

        return repository.findById(Id)
                .map(Books -> {
                    Book.setTitle(NewBook.getTitle());
                    Book.setIsbn(NewBook.getIsbn());
                    Book.setPublicationDate(LocalDate.now());
                    return repository.save(Book);
                })
                .orElseGet(() -> {
                    Book.setId(Id);
                    return repository.save(NewBook);
                });
    }

    @DeleteMapping("/Books/{Id}")
    void deleteBook(@PathVariable Integer Id) {
        repository.deleteById(Id);
    }
}