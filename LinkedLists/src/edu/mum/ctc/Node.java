package edu.mum.ctc;

public class Node {
	
	String value;
	Node next;
	Node previous;
	
	public Node(String value, Node next) {
		this.value = value;
		this.next = next;
	}
	
	public Node(String value, Node next, Node previous) {
		this.value = value;
		this.next = next;
		this.previous = previous;
	}
}
