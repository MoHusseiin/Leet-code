package test.Arrays._268;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays._268.MissingNumber;

class MissingNumberTest {
	
	MissingNumber missingNumber;
	
	@BeforeEach
	void setUp() throws Exception {
		missingNumber = new MissingNumber();
	}

	@Test
	void testMissingNumber() {
		assertEquals(2, missingNumber.missingNumber(new int[] {3,0,1}));
		assertEquals(8, missingNumber.missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
		assertEquals(1, missingNumber.missingNumber(new int[] {0}));
		assertEquals(0, missingNumber.missingNumber(new int[] {1}));
		assertEquals(1, missingNumber.missingNumber(new int[] {0,2}));
		assertEquals(2, missingNumber.missingNumber(new int[] {0,1}));
//		assertEquals(-1, missingNumber.missingNumber(new int[] {0,1,2}));
	}

}
