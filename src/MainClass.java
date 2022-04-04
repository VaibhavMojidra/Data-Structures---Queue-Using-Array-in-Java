import queue.Queue;
import queue.queueexceptions.QueueOverFlowException;
import queue.queueexceptions.QueueUnderFlowException;

public class MainClass {
	public static void main(String[] args) {
		Queue queue=new Queue(5);
		try {
			queue.displayQueue();
//			queue.dequeue();//throws error
			queue.enqueue(1);
			queue.enqueue(3);
			queue.enqueue(4);
			queue.enqueue(11);
			queue.enqueue(31);
			queue.displayQueue();
//			queue.enqueue(31); throws Queue is full  error
			
			System.out.println("Length: "+queue.length());
			queue.dequeue();
			queue.displayQueue();
			System.out.println("Length: "+queue.length());
			
			queue.dequeue();
			queue.displayQueue();
			System.out.println("Length: "+queue.length());
			
			
			queue.dequeue();
			queue.displayQueue();
			System.out.println("Length: "+queue.length());
			
			
			queue.dequeue();
			queue.displayQueue();
			System.out.println("Length: "+queue.length());
			
			queue.dequeue();
			queue.displayQueue();
			System.out.println("Length: "+queue.length());
			
			
			queue.dequeue();// Throws error
			queue.displayQueue();
			System.out.println("Length: "+queue.length());
			

			
		} catch (QueueOverFlowException | QueueUnderFlowException e) {
			e.printStackTrace();
		}
	}
}
