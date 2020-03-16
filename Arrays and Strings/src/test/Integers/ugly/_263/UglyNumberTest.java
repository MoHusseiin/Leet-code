package test.Integers.ugly._263;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Integers.ugly._263.UglyNumber;

class UglyNumberTest {
	UglyNumber uglyNumber;
	@BeforeEach
	void setUp() throws Exception {
		uglyNumber = new UglyNumber();
	}

	@Test
	void testIsUgly() {
//		assertTrue(uglyNumber.isUgly(1));
//		assertTrue(uglyNumber.isUgly(2));
//		assertTrue(uglyNumber.isUgly(4));
//		assertTrue(uglyNumber.isUgly(6));
//		assertTrue(uglyNumber.isUgly(8));
//		assertTrue(uglyNumber.isUgly(24));
//		assertTrue(uglyNumber.isUgly(270));
//		assertTrue(uglyNumber.isUgly(-270));
		assertFalse(uglyNumber.isUgly(-1000));
////		assertTrue(uglyNumber.isUgly(2310));
//		assertFalse(uglyNumber.isUgly(0));
//		assertFalse(uglyNumber.isUgly(14));
//		assertFalse(uglyNumber.isUgly(-14));
//		assertFalse(uglyNumber.isUgly(-2147483648));
	}

}
