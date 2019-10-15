package com.vcs.lects.l17.springboot.services;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.vcs.lects.l17.springboot.entities.Book;
import com.vcs.lects.l17.springboot.repositories.BookRepository;

@RunWith(SpringRunner.class)
public class PublicLibraryServiceImplTest {

	@TestConfiguration
	static class PublicLibraryServiceImplTestContextConfiguration {

		@Bean
		public PublicLibraryService publicLibraryService() {
			return new PublicLibraryServiceImpl();
		}
	}

	@Autowired
	private PublicLibraryService publicLibraryService;

	@MockBean
	private BookRepository bookRepository;

	@Before
	public void setUp() {
		Book testBook = new Book(1L, "ISBN", "Title", "Author", 1);

		Mockito.when(bookRepository.findById(testBook.getId())).thenReturn(Optional.of(testBook));
	}

	@Test
	public void takeOneBookFromOne() {
		Optional<Book> bookOpt = publicLibraryService.findById(1L);
		Assert.assertTrue(bookOpt.isPresent());
		Assert.assertEquals(1, bookOpt.get().getCount());
		
		// Take OK
		Assert.assertTrue(publicLibraryService.takeBook(1L));
		bookOpt = publicLibraryService.findById(1L);
		Assert.assertTrue(bookOpt.isPresent());
		Assert.assertEquals(0, bookOpt.get().getCount());

	}

	@Test
	public void takeMoreBookFromOne() {
		Optional<Book> bookOpt = publicLibraryService.findById(1L);
		Assert.assertTrue(bookOpt.isPresent());
		Assert.assertEquals(1, bookOpt.get().getCount());
		
		// Take OK
		Assert.assertTrue(publicLibraryService.takeBook(1L));
		bookOpt = publicLibraryService.findById(1L);
		Assert.assertTrue(bookOpt.isPresent());
		Assert.assertEquals(0, bookOpt.get().getCount());

		// Fail to take
		Assert.assertFalse(publicLibraryService.takeBook(1L));

		bookOpt = publicLibraryService.findById(1L);
		Assert.assertTrue(bookOpt.isPresent());
		Assert.assertEquals(0, bookOpt.get().getCount());

	}

	@Test
	public void returnBook() {
		Optional<Book> bookOpt = publicLibraryService.findById(1L);
		Assert.assertTrue(bookOpt.isPresent());
		Assert.assertEquals(1, bookOpt.get().getCount());
		
		// Return OK
		Assert.assertTrue(publicLibraryService.returnBook(1L));

		
		bookOpt = publicLibraryService.findById(1L);
		Assert.assertTrue(bookOpt.isPresent());
		Assert.assertEquals(2, bookOpt.get().getCount());
	}

	@Test
	public void findByInvalidId() {
		Optional<Book> bookOpt = publicLibraryService.findById(2L);
		Assert.assertFalse(bookOpt.isPresent());
	}

	@Test
	public void takeByInvalidId() {
		Assert.assertFalse(publicLibraryService.takeBook(2L));
	}

	@Test
	public void returnByInvalidId() {
		Assert.assertFalse(publicLibraryService.returnBook(2L));
	}

}
