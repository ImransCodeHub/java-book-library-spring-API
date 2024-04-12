package com.example.java3projectspringapi;

import org.springframework.data.repository.CrudRepository;

/**
 * BookRepository Class
 * Extends CrudRepository for basic CRUD operations
 */
public interface BookRepository extends CrudRepository<Book, Integer> {
    Book findByIsbn(String isbn);

}
