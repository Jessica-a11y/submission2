package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

public class LoanTest {

	//VG
	@Test
	public void testDueDate() {
		Customer firstCustomer = new Customer("Miss", "Eva", "Blom", "Axelgatan 5", "0809453535", "email@email.com", 55, GenderType.FEMALE);
		Book book2 = new Book(1, "En lång väntan", "Anna Dahl", "987654464", "Roman", 544);
		Loan firstLoan = new Loan(1, firstCustomer, book2);
		LocalDate dueDate = LocalDate.now().plusDays(14);
		assertEquals(dueDate, firstLoan.getDueDate());


   }
}