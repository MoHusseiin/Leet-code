
public class MyQueueTest {

	public static void main(String[] args) throws Exception {
		MyQueue queue = new MyQueue(10); 
        
        queue.enqueue(10); 
        queue.enqueue(20); 
        queue.enqueue(30); 
        queue.enqueue(40); 
        
        System.out.println(queue.dequeue() +  " dequeued from queue\n"); 
        
        System.out.println("Front item is " +  queue.front()); 
           
        System.out.println("Size item is " + queue.size()); 
	}

}
