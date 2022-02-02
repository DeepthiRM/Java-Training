package com.dxc.authorsbooks.repository;
import com.dxc.authorsbooks.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Author,Integer> {
    
}