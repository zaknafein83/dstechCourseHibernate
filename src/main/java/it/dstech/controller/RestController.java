package it.dstech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.dstech.models.Book;
import it.dstech.services.BookService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
	
	@Autowired 
	BookService bookService;
	
	@GetMapping("/")
	public List<Book> getAllBooks(){
		return bookService.list();
	}

}
