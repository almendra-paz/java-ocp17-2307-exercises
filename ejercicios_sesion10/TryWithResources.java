import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResources{

	public static void main(String args[]){
		// estructura try/catch
		try{
			
		}catch(Exception e){
			
		}
		
		//estructura try-with-resources
		
		try(FileInputStream is = new FileInputStream("myfile.txt")){
			//manejo del archivo
		}catch(IOException e){
			System.out.println("error de archivo");
			//e.printStackTrace();
		}finally{
			System.out.println("fin del bloque");		
		}
	}

}