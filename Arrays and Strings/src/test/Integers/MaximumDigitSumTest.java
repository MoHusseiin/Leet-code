package test.Integers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Integers.MaximumDigitSum;

class MaximumDigitSumTest {

	MaximumDigitSum maximumDigitSum;
	
	@BeforeEach
	void setUp() throws Exception {
		maximumDigitSum = new MaximumDigitSum();
	}

	@Test
	void testMaximumDigitSum() {
		assertEquals(99, maximumDigitSum.maximumDigitSum(100));
		assertEquals(48, maximumDigitSum.maximumDigitSum(48));
	}

}
