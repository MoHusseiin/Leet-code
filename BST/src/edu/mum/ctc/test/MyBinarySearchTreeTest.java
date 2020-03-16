package edu.mum.ctc.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.mum.ctc.MyBinarySearchTree;

class MyBinarySearchTreeTest {

	MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
	
	@BeforeEach
	void setUp() throws Exception {
		binarySearchTree.insert(25);
		binarySearchTree.insert(20);
		binarySearchTree.insert(15);
		binarySearchTree.insert(27);
		binarySearchTree.insert(30);
		binarySearchTree.insert(29);
		binarySearchTree.insert(26);
		binarySearchTree.insert(22);
		binarySearchTree.insert(32);
	}	
	
//	@Test
//	void testInsert() {
//		assertTrue(binarySearchTree.contains(29));
//		assertTrue(binarySearchTree.contains(32));
//		assertFalse(binarySearchTree.contains(35));
//		assertFalse(binarySearchTree.contains(0));
//	}
//
	@Test
	void testTraverseOrder() {
		binarySearchTree.traverseInOrder();
//		binarySearchTree.traversePreOrder();
//		binarySearchTree.traversePostOrder();
//		binarySearchTree.traverseLevel();
//		binarySearchTree.traverseLevelBadApproch();
	}
//	
//	@Test
//	void testHeight() {
//		assertEquals(3, binarySearchTree.height());
//	}
	
	@Test
	void testBinaryTree2DoubleLinkedList() {
		binarySearchTree.binaryTree2DoubleLinkedList();
		binarySearchTree.traverseInOrder();
	}
}