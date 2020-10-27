

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Producer implements Runnable{

	Queue<Integer>queue;
	public Producer(Queue<Integer>queue) {
		this.queue=queue;
	} 
	@Override
	public void run() {
		while(queue.isEmpty()) {
			System.out.println("Inside Producer while..");
			for (int i = 0; i < 5; i++) {
				System.out.println("Element Added "+i);
				queue.add(new Integer(i));
			}
			
		}
		
		
	}
}
