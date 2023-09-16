import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SingleThreadWithCallableAndFuture{

	public static void main(String args[]) throws Exception{
		ExecutorService service = null;
		try{
			service = Executors.newSingleThreadExecutor();
			Callable<Integer> call1 = () -> {
					System.out.println("--- Comenzando a procesar tarea call1");
					Thread.sleep(8000);
					return 20+10;
				};
			
			Future<Integer> result = service.submit(call1);
			System.out.println(result.isDone());
			//System.out.println(result.cancel(true));
			System.out.println(result.get(5, TimeUnit.SECONDS));//30
			System.out.println("Resultado obtenido!");
		}catch(TimeoutException ex){
			System.out.println("no se alcanzó resultado a tiempo");
		}finally{
			if(service!=null)
				service.shutdown();
		}
	}

}