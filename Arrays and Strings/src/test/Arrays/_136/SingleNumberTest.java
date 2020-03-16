package test.Arrays._136;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays._136.SingleNumber;

class SingleNumberTest {
	SingleNumber singleNumber;
	@BeforeEach
	void setUp() throws Exception {
		singleNumber = new SingleNumber();
	}

	@Test
	void testSingleNumber() {
//		assertEquals(1, singleNumber.singleNumber(new int[] {2, 2, 1}));
//		assertEquals(4, singleNumber.singleNumber(new int[] {4,1,2,1,2}));
	}
	
	@Test
	void testSingleNumber2() {
//		assertEquals(1, singleNumber.singleNumber2(new int[] {2, 2, 1}));
		assertEquals(4, singleNumber.singleNumber2(new int[] {4,1,2,1,2}));
	}

}
