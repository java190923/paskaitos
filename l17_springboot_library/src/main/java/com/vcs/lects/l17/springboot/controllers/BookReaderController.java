package com.vcs.lects.l17.springboot.controllers;

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

import com.vcs.lects.l17.springboot.services.PublicLibraryService;

@RestController
@RequestMapping("/book")
public class BookReaderController {

	private final static Logger LOG = LoggerFactory.getLogger(BookReaderController.class);

	@Autowired
	private PublicLibraryService service;

	@GetMapping("/take/{id}")
	public ResponseEntity<Void> takeBook(@PathVariable("id") @NumberFormat long id) {

		LOG.info("Take by ID {}", id);
		boolean ok = service.takeBook(id);

		if (ok) {
			LOG.info("Take by ID {} OK", id);
			return ResponseEntity.ok().build();
		}

		LOG.info("Take by ID {} NotFound", id);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@GetMapping("/return/{id}")
	public ResponseEntity<Void> returnBook(@PathVariable("id") @NumberFormat long id) {

		LOG.info("Return by ID {}", id);
		boolean ok = service.returnBook(id);

		if (ok) {
			LOG.info("Return by ID {} OK", id);
			return ResponseEntity.ok().build();
		}

		LOG.info("Return by ID {} NotFound", id);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

}
