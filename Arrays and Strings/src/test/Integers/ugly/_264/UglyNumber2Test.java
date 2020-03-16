package test.Integers.ugly._264;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Integers.ugly._264.UglyNumber2;

class UglyNumber2Test {

	UglyNumber2 uglyNumber2;
	
	@BeforeEach
	void setUp() throws Exception {
		uglyNumber2 = new UglyNumber2();
	}

	@Test
	void testNthUglyNumber() {
		assertEquals(12, uglyNumber2.nthUglyNumber(10));
		assertEquals(5832, uglyNumber2.nthUglyNumber(150));
	}

}
