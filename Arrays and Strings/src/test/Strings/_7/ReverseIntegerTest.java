package test.Strings._7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Strings._7.ReverseInteger;

class ReverseIntegerTest {
	
	ReverseInteger reverseInteger;
	
	@BeforeEach
	void setUp() throws Exception {
		reverseInteger = new ReverseInteger();
	}

	@Test
	void testReverse() {
		assertEquals(reverseInteger.reverse(54321), 12345);
		assertEquals(reverseInteger.reverse(-2345), -5432);
		assertEquals(reverseInteger.reverse(Integer.MAX_VALUE), 0);
		assertEquals(reverseInteger.reverse(Integer.MIN_VALUE), 0);
	}

}
