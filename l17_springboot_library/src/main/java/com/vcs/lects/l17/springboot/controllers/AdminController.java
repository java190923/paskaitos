package com.vcs.lects.l17.springboot.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcs.lects.l17.springboot.entities.Book;
import com.vcs.lects.l17.springboot.services.PrivateAdminService;

@RestController
@RequestMapping("/admin/book")
public class AdminController {

	private final static Logger LOG = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private PrivateAdminService service;

	@PostMapping("/list")
	public List<Book> getAll() {
		LOG.info("GettingAll...");
		List<Book> books = service.getAll();
		LOG.info("GettingAll OK. Total: {}", books.size());
		return books;
	}

	@PostMapping("/add/one")
	public Book addBook(@RequestBody Book book) {
		LOG.info("AddOneBook...");
		Book newBook = service.save(book);
		LOG.info("AddOneBook OK. ID: {}", newBook.getId());
		return newBook;
	}

	@PostMapping("/add/many")
	public ResponseEntity<Void> addAllBooks(List<Book> books) {
		LOG.info("AddManyBooks...");
		service.saveAll(books);
		LOG.info("AddManyBooks OK. Count: {}", books.size());
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> removeById(@PathVariable("id") Long id) {
		LOG.info("Deleting by id {}", id);
		service.delete(id);
		return ResponseEntity.ok().build();

	}

}
