package edu.mum.ctc.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import edu.mum.ctc.StringLinkedList;

class StringLinkedListTest {

	private StringLinkedList linkedList = new StringLinkedList();
	
	@Test
	void addFirstTest() {
		linkedList.addFirst("Abdeen");
		linkedList.addFirst(null);
		linkedList.addFirst("");
		linkedList.addFirst("Hussein");
		assertEquals(2, linkedList.size(), "Not the same");
	}
	
	@Test
	void addTest() {
		linkedList.add(null);
		linkedList.add("Mohamed");
		linkedList.add("");
		linkedList.add("shika");
		assertEquals(2, linkedList.size(), "Not the same");
	}

}
