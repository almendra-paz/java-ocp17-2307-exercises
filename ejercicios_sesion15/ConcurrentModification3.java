import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;

public class ConcurrentModification3{

	public static void main(String args[]){
		try{
			var blockingQueue = new LinkedBlockingQueue<Integer>();
			blockingQueue.offer(39);
			blockingQueue.offer(3, 4, TimeUnit.SECONDS);
			blockingQueue.offer(40);
			blockingQueue.offer(41);
			System.out.println(blockingQueue.poll());
			System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
			System.out.println(blockingQueue);
		
		}catch(InterruptedException e){
			//
		}
	}

}