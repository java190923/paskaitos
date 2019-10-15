package com.vcs.lects.l17.springboot.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.vcs.lects.l17.springboot.entities.Book;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private BookRepository bookRepository;

	private Book testBook0 = null;
	private Book testBook1 = null;
	private Book testBook2 = null;

	@Before
	public void init() {
		// given
		testBook0 = entityManager.persist(new Book(null, "ISBN-AABBCC0", "TitleAABBCC", "Author AABBCC", 0));
		entityManager.flush();

		testBook1 = entityManager.persist(new Book(null, "ISBN-AaBbCc1", "TitleaaBBcc", "Author AABBCC", 1));
		entityManager.flush();

		testBook2 = entityManager.persist(new Book(null, "ISBN-aabbcc2", "TitleAAbbCC", "Author AABBCC", 2));
		entityManager.flush();
	}

	@Test
	public void searchByAnyTextOnlyAvailable() {

		// when
		List<Book> found = bookRepository.fetchBooks("AABBCC", true);

		// then
		assertEquals(2, found.size());
		assertFalse(found.contains(testBook0));
		assertTrue(found.contains(testBook1));
		assertTrue(found.contains(testBook2));

	}

	@Test
	public void searchByAnyTextAll() {

		// when
		List<Book> found = bookRepository.fetchBooks("AABBCC", false);

		// then
		assertEquals(3, found.size());
		assertTrue(found.contains(testBook0));
		assertTrue(found.contains(testBook1));
		assertTrue(found.contains(testBook2));

	}

	@Test
	public void searchByAnyTextISBNCode() {

		// when
		List<Book> found = bookRepository.fetchBooks("BN-aa", true);

		// then
		assertEquals(2, found.size());
		assertFalse(found.contains(testBook0));
		assertTrue(found.contains(testBook1));
		assertTrue(found.contains(testBook2));

	}

	@Test
	public void searchByAnyTextTitle() {

		// when
		List<Book> found = bookRepository.fetchBooks("leaa", true);

		// then
		assertEquals(2, found.size());
		assertFalse(found.contains(testBook0));
		assertTrue(found.contains(testBook1));
		assertTrue(found.contains(testBook2));

	}

	@Test
	public void searchByAnyTextAuthor() {

		// when
		List<Book> found = bookRepository.fetchBooks("hor AA", true);

		// then
		assertEquals(2, found.size());
		assertFalse(found.contains(testBook0));
		assertTrue(found.contains(testBook1));
		assertTrue(found.contains(testBook2));

	}

}
