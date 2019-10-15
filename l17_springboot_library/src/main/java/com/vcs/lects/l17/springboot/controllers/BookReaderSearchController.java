package com.vcs.lects.l17.springboot.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcs.lects.l17.springboot.entities.Book;
import com.vcs.lects.l17.springboot.services.PublicLibraryService;

@RestController
@RequestMapping("/book/search-by")
public class BookReaderSearchController {

	private final static Logger LOG = LoggerFactory.getLogger(BookReaderSearchController.class);

	@Autowired
	private PublicLibraryService service;

	@GetMapping("/any/{text}")
	public List<Book> searchByAnyText(@PathVariable("text") String anyText) {
		LOG.info("Searching by anyText...");
		return service.findByAnyText(anyText);
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Book> searchById(@PathVariable("id") @NumberFormat long id) {

		LOG.info("Fetch by ID {}", id);
		Optional<Book> book = service.findById(id);

		if (book.isPresent()) {
			LOG.info("Fetch by ID {} OK", id);
			return ResponseEntity.ok(book.get());
		}

		LOG.info("Not found by {} NotFound", id);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@GetMapping("/name/{name}/and/author/{author}")
	public List<Book> searchByNameAndAuthor(@PathVariable("name") String name, @PathVariable("author") String author) {
		LOG.info("Search by name=[{}] AND author=[{}]", name, author);
		List<Book> books = service.findByNameAndAuthor(author, name);
		LOG.info("Search OK. Found: {}", books.size());
		return books;
	}

	@GetMapping("/name/{name}/or/author/{author}")
	public List<Book> searchByNameOrAuthor(@PathVariable("name") String name, @PathVariable("author") String author) {
		LOG.info("Search by name=[{}] OR author=[{}]", name, author);
		List<Book> books = service.findByNameOrAuthor(author, name);
		LOG.info("Search OK. Found: {}", books.size());
		return books;
	}

}
