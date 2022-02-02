package com.dxc.authorsbooks.controllers;

public class BookNotFoundException extends RuntimeException {
    BookNotFoundException(Integer id) {
        super("Could not find Author " + id);

}
}