package edu.mum.ctc;

import java.util.Queue;

public class TreeNode {
	
	private Integer value;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(Integer value) {
		this.value = value;
	}

	public void insert(int value) {
		if(this.value == value) return;
		
		if(value < this.value) {
			if(left == null)
				left = new TreeNode(value);
			else
				left.insert(value);
		}else {
			if(right == null)
				right = new TreeNode(value);
			else
				right.insert(value);
		}
	}
	
	public void traverseInOrder() {
		if(left != null)
			left.traverseInOrder();
		System.out.print(this.value+", ");
		if(right != null)
			right.traverseInOrder();
		
	}
	
	public void traversePreOrder() {
		System.out.print(this.value+", ");
		if(left != null)
			left.traversePreOrder();
		if(right != null)
			right.traversePreOrder();
	}

	public void traversePostOrder() {
		if(left != null)
			left.traversePostOrder();
		if(right != null)
			right.traversePostOrder();
		System.out.print(this.value+", ");
	}
	
	public void traverseLevelOrder(Queue<TreeNode> queue) {
		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll(); 
			System.out.print(tempNode.value+", ");
			
			if(tempNode.left != null)
				queue.add(tempNode.left);
			
			if(tempNode.right != null)
				queue.add(tempNode.right);
		}
	}
	
	public int height() {
		if(left == null || right == null) return 0;
		int leftHeight = left.height();
		int rightHeight = right.height(); 
		return (leftHeight > rightHeight) ? (leftHeight + 1) : (rightHeight + 1);
	}
	
	public void traverseLevel(int i) {
		if(i == 0) 
			System.out.print(this.value+", ");
		else {
		    left.traverseLevel(i - 1);
			right.traverseLevel(i - 1);
		}
	}
	
	public boolean contains(int data) {
		if(this.value == data) return true;
		if(data < this.value && left != null) 
			return left.contains(data);
		else if(right != null)
			return right.contains(data);
		else 
			return false;
	}

	public boolean isBalanced() {
		if(left == null || right == null) return true;
		return (left.isBalanced() && right.isBalanced() && (Math.abs(left.height() - right.height()) < 2));
	}
	
	static TreeNode prev;
	
	public TreeNode binaryTree2DoubleLinkedList() {
		if(left != null)
			return left.binaryTree2DoubleLinkedList();
		if(prev == null)
			prev = this;
		else {
			prev.right = this;
			this.left = prev;
		}
		prev = this;
		if(right != null)
			return right.binaryTree2DoubleLinkedList();
		return prev	;
	}

}