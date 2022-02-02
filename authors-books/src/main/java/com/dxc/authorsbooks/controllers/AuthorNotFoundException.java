package com.dxc.authorsbooks.controllers;

public class AuthorNotFoundException extends RuntimeException {
    AuthorNotFoundException(Integer id) {
        super("Could not find Book " + id);
    
}
}