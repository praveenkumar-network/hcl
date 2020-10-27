

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;


public class ProducerConsumerSol {

	public static void main(String[] args) {

		Queue<Integer>queue=new LinkedBlockingQueue<Integer>();
		
		Producer producer=new Producer(queue);
		Consumer consumer=new Consumer(queue);
		
		Thread thread=new Thread(producer);
		thread.start();
		
		Thread threa1=new Thread(consumer);
		threa1.start();

	}

}
