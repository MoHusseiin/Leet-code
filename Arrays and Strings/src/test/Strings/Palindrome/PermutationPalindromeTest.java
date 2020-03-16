package test.Strings.Palindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Strings.Palindrome.PermutationPalindrome;

class PermutationPalindromeTest {

	PermutationPalindrome permutationPalindrome;
	
	@BeforeEach
	void setUp() throws Exception {
		permutationPalindrome = new PermutationPalindrome();
	}

	@Test
	void testIsPermutationOfPalindrome() {
		assertTrue(permutationPalindrome.isPermutationOfPalindrome("tactcoapapa"));
		assertTrue(permutationPalindrome.isPermutationOfPalindrome("ababcc"));
		assertFalse(permutationPalindrome.isPermutationOfPalindrome("abc"));
		assertFalse(permutationPalindrome.isPermutationOfPalindrome("ab  bc"));
		assertTrue(permutationPalindrome.isPermutationOfPalindrome("cca: ,ab?bc"));
	}

}
