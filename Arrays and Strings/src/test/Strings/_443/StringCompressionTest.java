package test.Strings._443;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Strings._443.StringCompression;

class StringCompressionTest {

	StringCompression StringCompression;
	
	@BeforeEach
	void setUp() throws Exception {
		StringCompression = new StringCompression();
	}

	@Test
	void test() {
//		assertEquals(0, StringCompression.compressInPlace("".toCharArray()));
//		assertEquals(1, StringCompression.compressInPlace("a".toCharArray()));
//		assertEquals(2, StringCompression.compressInPlace("aa".toCharArray()));
//		assertEquals(2, StringCompression.compressInPlace("aaa".toCharArray()));
//		assertEquals(3, StringCompression.compressInPlace("aaab".toCharArray()));
//		assertEquals(4, StringCompression.compressInPlace("aaabb".toCharArray()));
//		assertEquals(7, StringCompression.compressInPlace("aabcccccaaa".toCharArray()));
//		assertEquals(4, StringCompression.compressInPlace("abbbbbbbbbbbb".toCharArray()));
		
//		assertEquals(0, StringCompression.compressCount("".toCharArray()));
//		assertEquals(2, StringCompression.compressCount("a".toCharArray()));
//		assertEquals(2, StringCompression.compressCount("aa".toCharArray()));
//		assertEquals(2, StringCompression.compressCount("aaa".toCharArray()));
//		assertEquals(4, StringCompression.compressCount("aaabb".toCharArray()));
//		assertEquals(8, StringCompression.compressCount("aabcccccaaa".toCharArray()));
		
		assertEquals("", StringCompression.compress(""));      
//		assertEquals("a", StringCompression.compress("a"));    
		assertEquals("a2", StringCompression.compress("aa"));  
		assertEquals("a3", StringCompression.compress("aaa")); 
		assertEquals("ab", StringCompression.compress("ab"));  
		assertEquals("abc", StringCompression.compress("abc"));  
		assertEquals("a2b1c5a3", StringCompression.compress("aabcccccaaa"));   
	}

}
