package it.dstech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.models.Book;
import it.dstech.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public List<Book> list() {
		return (List<Book>)bookRepository.findAll();
	}
}