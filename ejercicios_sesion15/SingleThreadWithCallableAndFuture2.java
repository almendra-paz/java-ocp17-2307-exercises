import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.List;

public class SingleThreadWithCallableAndFuture2{

	public static void main(String args[]) throws Exception{
		ExecutorService service = null;
		try{
			service = Executors.newSingleThreadExecutor();
			Callable<String> call1 = 
				() -> {
						System.out.println("Ejecutando call");
						Thread.sleep(2000);
						return "result";
					};

			System.out.println("--- enviando mas de una tarea ----");
			//service.submit(call1);
			//service.submit(call1);
			
			System.out.println("--- invokeAll ----");
			//List<Future<String>> result = service.invokeAll(List.of(call1, call1, call1));
			//System.out.println(result.get(0).get()); //result

			System.out.println("--- invokeAny ----");
			String result2 = service.invokeAny(List.of(call1, call1, call1));
			System.out.println(result2);
			System.out.println("End");
		}finally{
			if(service!=null)
				service.shutdown();
		}
	}

}