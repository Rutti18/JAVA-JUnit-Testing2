package com.example;

import static org.junit.jupiter.api.Assertions.*;

// import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomTacoBoxTest {
	static CustomTacoBox customTacoBox;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		customTacoBox = new CustomTacoBox(3);
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
		assertTrue(customTacoBox.tacosRemaining() == 3);
	}

}
