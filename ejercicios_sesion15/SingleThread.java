import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread{

	public static void main(String args[]) throws Exception{
		ExecutorService service = null;
		Runnable task1 = 
			() -> {
					try{
						//Thread.sleep(1000);
						System.out.println("Imprimiendo tarea");
					}catch(Exception e){
						System.out.println("exception during sleeping");
					}
				};
		try{
			service = Executors.newSingleThreadExecutor();
			System.out.println("--- begin");
			service.execute(task1);
			System.out.println("--- end");
		} finally {
			if(service !=null){
				
				//service.shutdown(); // apagando el servicio (no más ingresos)
				System.out.println("isShutdown: "+service.isShutdown());
				System.out.println("isTerminated: "+service.isTerminated());
				
				//Thread.sleep(3000);				
				System.out.println(service.shutdownNow());
			}
		}

	}

}