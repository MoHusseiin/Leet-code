package edu.mum.ctc.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import edu.mum.ctc.StringDoubleLinkedList;

class StringDoubleLinkedListTest {

	private StringDoubleLinkedList linkedList = new StringDoubleLinkedList();
	
	@Test
	void testAdd() {
		LinkedList<String> expected = new LinkedList<>();
		expected.add("Abdeen");
		expected.add("Hussein");
		
		linkedList.add("Abdeen");
		linkedList.add(null);
		linkedList.add("");
		linkedList.add("Hussein");
		assertTrue(linkedList.equals(expected));
		
		expected.remove(1);
		assertFalse(linkedList.equals(expected));
	}
	
	
	@Test
	void testInsert() {
		LinkedList<String> expected = new LinkedList<>();
		expected.add("Abdeen");
		expected.add("Mohamed");
		expected.add("Hussein");
		
		linkedList.add(0, "Abdeen");
		linkedList.add(0, null);
		linkedList.add(0, "");
		linkedList.add(1, "Hussein");
		linkedList.add(1, "Mohamed");
		assertTrue(linkedList.equals(expected));
	}
	
	@Test
	void testAddSorted() {
		LinkedList<String> expected = new LinkedList<>();
		expected.add("Abdeen");
		expected.add("Bbdeen");
		expected.add("Cbdeen");
		
		linkedList.addSorted("Bbdeen");
		linkedList.addSorted(null);
		linkedList.addSorted("");
		linkedList.addSorted("Cbdeen");
		linkedList.addSorted("Abdeen");
		assertTrue(linkedList.equals(expected));
	}
	
	@Test
	void testAddFirst() {
		linkedList.addFirst("Abdeen");
		linkedList.addFirst(null);
		linkedList.addFirst("");
		linkedList.addFirst("Hussein");
		assertEquals(2, linkedList.size());
	}

	@Test
	void testSize() {
		assertEquals(0, linkedList.size());
		linkedList.addFirst("Abdeen");
		assertEquals(1, linkedList.size());
	}
}
