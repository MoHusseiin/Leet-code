package test.Strings._796;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Strings._796.RotateString;

class RotateStringTest {

	RotateString rotateString;
	
	@BeforeEach
	void setUp() throws Exception {
		rotateString = new RotateString();
	}

	@Test
	void testRotateString() {
		assertTrue(rotateString.rotateString("abcde", "cdeab"));
//		assertFalse(rotateString.rotateString("abcde", "abced"));
	}
	
	
	@Test
	void testRotateStringSimple() {
//		assertTrue(rotateString.rotateStringSimple("abcde", "cdeab"));
		assertFalse(rotateString.rotateStringSimple("abcde", "abced"));
	}
}
