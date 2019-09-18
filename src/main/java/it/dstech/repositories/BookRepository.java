package it.dstech.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.dstech.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	
	public List<Book> findByName(String name);
}