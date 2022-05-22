package com.example;

// Static Assertion
import static org.junit.jupiter.api.Assertions.*;


// import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NicknamesTest {
	static Nicknames nickNamesTest;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		nickNamesTest = new Nicknames();
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
	void testNickNames() {
		assertTrue(Nicknames.nickNames.size() == 0);
	}

}
