package it.dstech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.dstech.models.Book;

//@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}