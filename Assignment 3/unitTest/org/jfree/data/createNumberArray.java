package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class createNumberArray {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
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
	void testCreateNumberArrayValidInput() {
		double[] data = new double[] {1.0,2.0,3.0,4.0};
		Number[] actual = DataUtilities.createNumberArray(data);
		Number[] expected = new Number[] {1.0,2.0,3.0,4.0};
		
		assertAll(
			() -> assertEquals(expected.getClass(), actual.getClass(), "Result should be similar type Number object"),
			() -> assertEquals(expected, actual, "The object should be equals")
				);
	}
	
	@Test
	void testCreateNumberArrayInvalidInput() {
		double[] data = null;
		
		assertThrows(InvalidParameterException.class, () -> {
			DataUtilities.createNumberArray(data);
		}, "Invalid object input, should throw invalid parameter exception");
	}

}
