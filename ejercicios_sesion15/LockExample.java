import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.List;

public class LockExample{
	private static Lock lock = new ReentrantLock();
	public static void main(String args[]) throws Exception{
		ExecutorService service = null;
	
		try{
			service = Executors.newFixedThreadPool(20);
			WorkersManager wm = new WorkersManager();
			for(int i=0; i<10; i++)	
				service.submit(()-> wm.incrementAndReport(lock));
			System.out.println("end");
		}finally{
			if(service!=null)
				service.shutdown();
		}	
	}
}

class WorkersManager{
	private int workersCount = 0;

	protected void incrementAndReport(Lock lock){
		try{
				if(lock.tryLock(5, TimeUnit.SECONDS)){
					try{
						//lock.lock();
						System.out.println("hilo obtenido");
						System.out.println((++workersCount)+" ");
					}finally{
						lock.unlock();
					}
				}else{
					System.out.println("no se pudo adquirir el hilo");
				}

		}catch(Exception ex){}
	}
}
