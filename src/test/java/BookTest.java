package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book2 = new Book(1, "Olivträdet", "Lucinda Riley", "9789180063173", "Roman", 511);
		Book book3 = new Book(1, "Olivträdet", "Lucinda Riley", "9789180063173", "Roman", 511);
		assertEquals(book2, book3);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book4 = new Book(1, "Olivträdet", "Lucinda Riley", "9789180063173", "Roman", 511);
		Book book5 = new Book(2, "Bambu", "Jan Hermansson", "978918008362", "Roman", 500);
		assertNotEquals(book4, book5);
	}

}
