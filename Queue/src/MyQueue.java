public class MyQueue {
	private int front;
	private int rear;
	private int size;
	private int[] array;
	
	public MyQueue(int capacity) {
		array = new int[capacity];
		front = rear = 0;
		size = 0;
	}
	
	public boolean isFull() {
		return size == array.length;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public int front() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is Empty!");
		return array[front];
	}
	
	public int dequeue() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is Empty!");
		size--;
		return array[front++];
	}
	
	public void enqueue(int item) throws Exception {
		if(isFull())
			throw new Exception("Queue is Full!");
		size++;
		array[rear++] = item; 
	}
}
