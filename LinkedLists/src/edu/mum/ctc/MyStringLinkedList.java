package edu.mum.ctc;
public class MyStringLinkedList {
	
	public static void main(String[] args) {
		
		StringLinkedList linkedList = new StringLinkedList();
		linkedList.addFirst("Abdeen");
		linkedList.addFirst(null);
		linkedList.addFirst("");
		linkedList.add(null);
		linkedList.add("Mohamed");
		linkedList.add("");
		linkedList.add("shika");
		linkedList.addFirst("Hussein");
		linkedList.add(2, "index2");
		linkedList.add(0, "index0");
		linkedList.add(6, "index6");
		linkedList.add(6, "omar");
		System.out.println(linkedList);
	}
}
