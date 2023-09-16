import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.List;

public class CyclicBarrierExample{
	public static void main(String args[]) throws Exception{
		ExecutorService service = null;
	
		try{
			service = Executors.newFixedThreadPool(4);
			WorkersManager wm = new WorkersManager();
			var c1 = new CyclicBarrier(4);
			var c2 = new CyclicBarrier(4, ()-> System.out.println(""));
			for(int i=0; i<4; i++)	
				service.submit(()-> wm.performTask(c1,c2));
			System.out.println("end");
		}finally{
			if(service!=null)
				service.shutdown();
		}	
	}
}

class WorkersManager{
	private void recolectarData(){
		System.out.println("Recolectar datos");
	}

	private void procesarData(){
		try{
			Thread.sleep(2000);
			System.out.println("Procesar datos");
		}catch(Exception ex){}	
	}

	private void imprimirResumen(){
		System.out.println("Imprimir Resumen");
	}

	public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
		try{
			recolectarData();
			c1.await();
			procesarData();
			c2.await();
			imprimirResumen();
		}catch(InterruptedException | BrokenBarrierException e){
			//manejo de la excepcion
		}
	}
}
