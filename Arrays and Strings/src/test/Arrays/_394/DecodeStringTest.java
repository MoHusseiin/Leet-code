package test.Arrays._394;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays._394.DecodeString;

class DecodeStringTest {

	DecodeString decodeString;
	
	@BeforeEach
	void setUp() throws Exception {
		decodeString = new DecodeString();
	}

	@Test
	void testDecodeString() {
		assertEquals(null, decodeString.decodeString(null));
		assertEquals("", decodeString.decodeString(""));
		assertEquals("aaabcbc", decodeString.decodeString("3[a]2[bc]"));
		assertEquals("aaaaaaaaaaaabcbc", decodeString.decodeString("12[a]2[bc]"));
		assertEquals("accaccacc", decodeString.decodeString("3[a2[c]]"));
		assertEquals("abcabccdcdcdef", decodeString.decodeString("2[abc]3[cd]ef"));
	}

}
