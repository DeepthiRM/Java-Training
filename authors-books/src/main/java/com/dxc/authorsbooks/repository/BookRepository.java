package com.dxc.authorsbooks.repository;

import com.dxc.authorsbooks.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book ,Integer> {

    default Book getBookBy(String title) {
    
        return null;
    }
    
}