

import java.util.Queue;

public class Consumer implements Runnable{
	Queue<Integer>queue;
	
	public Consumer(Queue<Integer>queue) {
		this.queue=queue;
	}
	@Override
	public void run() {
		int i=0;
		while(true) {
			System.out.println("Inside Consumer while..");
			if(queue.size()>0) {
					System.out.println("Element removed "+i);
					queue.remove(new Integer(i));
					i++;
			}
			if(i==5) {
				break;
			}
			
			
		}
	}

}
