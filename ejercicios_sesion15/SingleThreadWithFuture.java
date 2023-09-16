import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SingleThreadWithFuture{

	public static void main(String args[]) throws Exception{
		ExecutorService service = null;
		try{
			service = Executors.newSingleThreadExecutor();
			Runnable task1 = 
				() -> System.out.println("Imprimiendo tarea");
			Future<?> result = service.submit(task1);
			System.out.println(result.get(10, TimeUnit.SECONDS));//null dado q es void
			System.out.println("Resultado obtenido!");
		}catch(TimeoutException ex){
			System.out.println("no alcanzado a tiempo");
		}finally{
			if(service!=null)
				service.shutdown();
		}
	}

}