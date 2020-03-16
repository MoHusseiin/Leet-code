package flatting;

public class FlattingLinkedList {

	Node head;
	
	public Node push(Node head_ref, int data) {
		Node newNode = new Node(data, null, head_ref);
		head_ref = newNode;
		return head_ref;
	}
	
	public Node merge(Node a, Node b) {
		if(a == null)
			return b;
		if(b == null)
			return a;
		Node result = null;
		if(a.value < b.value) {
			result = a;
			result.down = merge(a.down, b);
		}else {
			result = b;
			result.down = merge(a, b.down);
		}
		return result;
	}
	
	void printList(){ 
        Node temp = head; 
        while (temp != null) { 
            System.out.print(temp.value + " "); 
            temp = temp.down; 
        } 
        System.out.println(); 
    } 
	
	class Node{

		Integer value;
		Node right;
		Node down;
		
		public Node(Integer value, Node right, Node down) {
			this.value = value;
			this.right = right;
			this.down = down;
		}
	}
	
	public static void main(String args[]) { 
        FlattingLinkedList L = new FlattingLinkedList(); 
  
        /* Let us create the following linked list 
            5 -> 10 -> 19 -> 28 
            |    |     |     | 
            V    V     V     V 
            7    20    22    35 
            |          |     | 
            V          V     V 
            8          50    40 
            |                | 
            V                V 
            30               45 
        */
  
        L.head = L.push(L.head, 30); 
        L.head = L.push(L.head, 8); 
        L.head = L.push(L.head, 7); 
        L.head = L.push(L.head, 5); 
  
        L.head.right = L.push(L.head.right, 20); 
        L.head.right = L.push(L.head.right, 10); 
  
        L.head.right.right = L.push(L.head.right.right, 50); 
        L.head.right.right = L.push(L.head.right.right, 22); 
        L.head.right.right = L.push(L.head.right.right, 19); 
  
        L.head.right.right.right = L.push(L.head.right.right.right, 45); 
        L.head.right.right.right = L.push(L.head.right.right.right, 40); 
        L.head.right.right.right = L.push(L.head.right.right.right, 35); 
        L.head.right.right.right = L.push(L.head.right.right.right, 20); 
  
        // flatten the list 
        L.head = L.flatten(L.head); 
  
        L.printList();
    }

	private Node flatten(Node h) {
		
		if(h == null || h.right == null)
			return h;
		h.right = flatten(h.right);   // i am sure it have right so i must flat the right also before merge
		return merge(h, h.right);
	} 
}
