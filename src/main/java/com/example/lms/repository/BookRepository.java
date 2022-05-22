package com.example.lms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lms.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
