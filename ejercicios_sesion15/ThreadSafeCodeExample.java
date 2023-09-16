import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.List;

public class ThreadSafeCodeExample{
	public static void main(String args[]) throws Exception{
		ExecutorService service = null;
		try{
			service = Executors.newFixedThreadPool(11);
			WorkersManager wm = new WorkersManager();
			for(int i=0; i<10; i++)	
				service.submit(()-> wm.incrementAndReport());
			System.out.println("end");
		}finally{
			if(service!=null)
				service.shutdown();
		}	
	}
}

class WorkersManager{
	private int workersCount = 0;
	protected void incrementAndReport(){
		System.out.println((++workersCount)+" ");
	}
}