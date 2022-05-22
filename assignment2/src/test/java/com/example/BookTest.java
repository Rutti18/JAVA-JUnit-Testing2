package com.example;

//Static assertions
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {
	static Book book;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		book = new Book("Robert Martin", "Clean Code", 1);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBookName() {
		assertTrue(book.toString().equals("Robert Martin: Clean Code"));
	}

	@Test
	void testBookWeight() {
		assertTrue(book.weight() == 1); // static Assertions so no need to type Assertion.assertTrue(book.weight()==1)
	}

}
