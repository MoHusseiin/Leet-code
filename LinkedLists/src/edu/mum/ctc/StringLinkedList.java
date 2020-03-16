package edu.mum.ctc;
public class StringLinkedList {
	
	private Node header;
	
	public StringLinkedList() {
		header = new Node(null, null); 
	}
	
	public void add(String value) {  // by default append in the last
		if(value == null || "".equals(value)) return;
		Node node = new Node(value, null);
		Node runner = header;
		if(runner.next == null)
			header.next = node;
		else {
			while (runner.next != null) 
				runner = runner.next;
			runner.next = node;
		}
	}

	public void addFirst(String value) {
		if(value == null || "".equals(value)) return;
		Node node = new Node(value, header.next);
		header.next = node;
	}
	
	public void addLast(String value) {
		add(value);
	}
	
	public void add(int index, String value) {    // insert
		int length = size();
		if(value == null || "".equals(value) || index < 0 || length < index) return;
		if(index == 0) {
			addFirst(value);
			return;
		}
		if(length == index) {
			add(value);
			return;
		}
		Node runnerPrev = new Node(null, header);
		Node runner = new Node(value, header.next);
		for (int i = 0; i < index; i++) {
			runner.next = runner.next.next;
			runnerPrev.next = runnerPrev.next.next;
		}
		runnerPrev.next.next = runner;
		runnerPrev.next = null;
	}

	public int size() {
		Node runner = new Node(null, header.next);
		if(runner.next == null) return 0;
		int count = 0;
		while (runner.next != null) {
			runner.next = runner.next.next;
			count++;
		}
		return count;
	}

	@Override
	public String toString() {
		if(header.next == null) return "[]";
		StringBuilder builder = new StringBuilder("[ ");
		Node runner = header.next;
		while (runner != null) {
			builder.append(runner.value).append(", ");
			runner =  runner.next;
		}
		builder.append("]");
		return builder.toString();
	}
}
