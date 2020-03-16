package edu.mum.ctc;

import java.util.LinkedList;
import java.util.Queue;

public class MyBinarySearchTree {
	
	private TreeNode root;
	
	/**
	 * insert value in BST without duplicates
	 * @param data
	 */
	public void insert(int value) {
		if(root == null) 
			root = new TreeNode(value);
		else
			root.insert(value);
	}
	
	public void traverseInOrder() {
		System.out.print("\nInOrder: [ ");
		if(root != null)
			root.traverseInOrder();
		System.out.print("]");
	}
	
	public void traversePreOrder() {
		System.out.print("\nPreOrder: [ ");
		if(root != null)
			root.traversePreOrder();
		System.out.print("]");
	}
	
	public void traversePostOrder() {
		System.out.print("\nPostOrder: [ ");
		if(root != null)
			root.traversePostOrder();
		System.out.print("]");
	}

	public void traverseLevel() {
		System.out.print("\nLevelOrder: [ ");
		if(root != null) {
			Queue<TreeNode> tempNode = new LinkedList<>();
			tempNode.add(root);
			root.traverseLevelOrder(tempNode);
		}
		System.out.print("]");
	}
	
	public void traverseLevelBadApproch() {
		System.out.print("\nLevelOrder: [ ");
		if(root != null) {
			int h = height();
			for (int i = 0; i < h; i++) {
				root.traverseLevel(i);
			}
		}
		System.out.print("]");
	}
	
	/**
	 * Get the largest number of edges path 
	 * from the root the leaf
	 * @return int
	 */
	public int height() {
		if(root == null)
			return 0;
		return root.height();
	}
	
	public boolean contains(int data) {
		if(root == null) 
			return false;
		else
			return root.contains(data);
	}
	
	/**
	 * determine if it is height-balanced.
	 * The left and right subtrees of every node differ in height by no more than 1.
	 * @return
	 */
	public boolean isBalance() {
		if(root == null) 
			return true;
		else
			return root.isBalanced();
	}
	
	public TreeNode binaryTree2DoubleLinkedList() {
		if(root == null)
			return root;
		return root.binaryTree2DoubleLinkedList();
	}
}
