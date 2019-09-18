package it.dstech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping("/{name}")
	public Book getBook(@PathVariable(name = "name")String name){
		return bookService.getFirst(name);
	}
}
