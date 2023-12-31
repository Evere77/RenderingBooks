package com.project.renderingbooks.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.renderingbooks.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	List<Book> findAll();
}

