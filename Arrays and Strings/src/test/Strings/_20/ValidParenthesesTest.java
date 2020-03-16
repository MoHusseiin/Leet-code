package test.Strings._20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Strings._20.ValidParentheses;

class ValidParenthesesTest {
	ValidParentheses validParentheses;
	
	@BeforeEach
	void setUp() throws Exception {
		validParentheses = new ValidParentheses();
	}

	@Test
	void testIsValid() {
		assertTrue(validParentheses.isValid(""));
		assertTrue(validParentheses.isValid("()"));
		assertTrue(validParentheses.isValid("()[]{}"));
		assertFalse(validParentheses.isValid("(]"));
		assertFalse(validParentheses.isValid("([)]"));
		assertTrue(validParentheses.isValid("{[]}"));
	}

}
