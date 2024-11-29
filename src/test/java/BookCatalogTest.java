package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
		Book[] booksArray = bc.getBookArray();
		assertEquals(book1, booksArray[0]);
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
		Book book1 = new Book(1, "Apornas Planet", "Någon", "", "", 22);
		bc.addBook(book1);
		assertEquals(book1.getTitle(), bc.findBook("Apornas Planet").getTitle());
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException{
		Book book1 = new Book(1, "Apornas Planet", "Någon", "", "", 22);
		bc.addBook(book1);
		assertEquals(book1.getTitle(), bc.findBook("APORNAS planet").getTitle());
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException{
		Book book1 = new Book(1, "Apornas Planet", "Någon", "", "", 22);
		bc.addBook(book1);
		assertEquals(book1.getTitle(), bc.findBook("    APORNAS planet    ").getTitle());
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {
		Book book1 = new Book(1, "Apornas Planet", "Någon", "", "", 22);
		bc.addBook(book1);
		assertThrows(BookNotFoundException.class, () -> bc.findBook("Ensam Hemma"));
	}

}
