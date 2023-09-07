import java.util.Queue;
import java.util.LinkedList;

public class QueueMethods{

	public static void main(String args[]){
		Queue<Integer> queue = new LinkedList<>();
		//System.out.println(queue.element()); //arroja excepcion
		System.out.println(queue.peek()); 
		
		System.out.println("------ adding ------"); 		
		System.out.println(queue.offer(100)); 
		System.out.println(queue.offer(4)); 
		System.out.println(queue.add(50)); 
		System.out.println(queue.add(50)); 
	
		System.out.println(queue); 

		System.out.println("------ lecturas ------"); 
		System.out.println(queue.element()); 
		System.out.println(queue.peek()); 

		System.out.println("------ removing ------"); 
		//System.out.println(queue.pop()); 
		System.out.println(queue.poll()); 
		System.out.println(queue);
		System.out.println(queue.peek()); 
		System.out.println(queue.remove()); //exception
		System.out.println(queue);
		System.out.println(queue.poll()); 
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.remove());
		//System.out.println(queue.poll()); 		
		//System.out.println(queue.poll()); 	//null
		//System.out.println(queue.remove()); 		
	}

}