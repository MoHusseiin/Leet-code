package test.Strings.Palindrome._125;


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Strings.Palindrome._125.Palindrome;;

class PalindromeTest {

	Palindrome palindrome;
	
	@BeforeEach
	void setUp() throws Exception {
		palindrome = new Palindrome();
	}

	@Test
	void test() {
		assertTrue(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
		assertFalse(palindrome.isPalindrome("race a car"));
		assertFalse(palindrome.isPalindrome("race s a car"));
		assertTrue(palindrome.isPalindrome("taco cat"));
	}
	
	@Test
	void testIsPalindrome() {
		assertTrue(palindrome.isPalindrome(121));
	}

}
