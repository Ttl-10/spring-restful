package com.spring_restful.biblio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_restful.biblio.entities.Book;

@Repository
public interface BookRepository extends JpaRepository <Book, Integer> {
	
	List<Book> findByTitleContainingOrDescriptionContaining(String text, String textAgain);
    
}
