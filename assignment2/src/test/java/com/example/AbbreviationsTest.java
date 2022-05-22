package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbbreviationsTest {
	static Abbreviations abbreviation; 
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		abbreviation = new Abbreviations();
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
	void testAbbreviations_hasAbbreviation() {
		abbreviation.addAbbreviation("e.g.", "for example");
		assertFalse(abbreviation.hasAbbreviation("etc."));
	}

	
	@Test
	void testAbbreviations_findExplanationFor(){
		abbreviation.addAbbreviation("i.e.", "more precisely");
		assertNotNull(abbreviation.findExplanationFor("i.e."));
	}

}
