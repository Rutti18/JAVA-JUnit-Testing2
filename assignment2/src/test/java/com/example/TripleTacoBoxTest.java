package com.example;

//Static assertions
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TripleTacoBoxTest {
	static TripleTacoBox tripleTacoBox;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		tripleTacoBox = new TripleTacoBox();
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
	void testTacosRemaining() {
		tripleTacoBox.eat();
		assertTrue(tripleTacoBox.tacosRemaining() == 2);
	}

}
