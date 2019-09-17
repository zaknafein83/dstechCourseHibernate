package it.dstech;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import it.dstech.models.Book;
import it.dstech.services.BookService;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTest {
	@Autowired
	private BookService bookService;

	@Test
	public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
		List<Book> books = bookService.list();
		Assert.assertEquals(books.size(), 3);
	}
}