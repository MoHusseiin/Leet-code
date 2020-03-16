package edu.mum.ctc;

import java.util.Iterator;
import java.util.LinkedList;

public class StringDoubleLinkedList {
	
	private Node header;
	
	public StringDoubleLinkedList() {
		header = new Node(null, null, null);
	}
	
	public void add(String item){   // by default append in the last
		if(item == null || item == "") return;
		Node runner = new Node(item, header.next, header);
		if(runner.next == null) addFirst(item);
		while (runner.next != null) {
			runner.previous = runner.next;
			runner.next = runner.next.next;
		}
		runner.previous.next = runner;
	}
	
	public void addLast(String item) {
		add(item);
	} 
	
	public void add(int index, String item) {
		if(index == 0) { addFirst(item); return; }
		if(index == size()) { add(item); return; }
		
		if(item == null || item == "") return;
		Node runner = new Node(item, header.next, header);
		for (int i = 0; i < index; i++) {
			runner.previous = runner.next;
			runner.next = runner.next.next;
		}
		runner.previous.next = runner;
		runner.next.previous = runner;
	}
	
	public void addSorted(String item) {
		if(size() == 0) { addFirst(item); return; }
		
		if(item == null || item == "") return;
		Node runner = new Node(item, header.next, header);
		while(runner.next != null && item.compareTo(runner.next.value) != -1) {
			runner.previous = runner.next;
			runner.next = runner.next.next;
		}
		runner.previous.next = runner;
		if(runner.next != null)
			runner.next.previous = runner;
	}
	
	
	public void addFirst(String item){   
		if(item == null || item == "") return;
		Node runner = new Node(item, header.next, header);
		header.next = runner;
		runner.previous = null;
	}
	
	public int size() {
		int count = 0;
		Node runner = new Node(null, header.next, null);
		while (runner.next != null) {
			count++;
			runner.next = runner.next.next;
		}
		return count;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		LinkedList<String> linkedList = null;
		if(obj instanceof LinkedList)
			 linkedList = (LinkedList<String>)obj;
		if(linkedList.size() != size()) return false;
		Node runner = new Node(null, header.next, null);
		Iterator<String> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			if(!value.equalsIgnoreCase(runner.next.value)) return false;
			runner.next = runner.next.next;
		}
		return true;
	}
	
	
}
