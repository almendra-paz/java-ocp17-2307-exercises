import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;


public class TryCatchExample{
		
	public static void main(String args[]){
		try{
			lanzandoExcepcion();
		}catch(IllegalStateException e){
		}catch(InputMismatchException | MissingResourceException e){
		}catch(FileNotFoundException | 	IllegalArgumentException e){
		}catch(IOException e){
		}catch(Exception e){}
	}
	
	public static void lanzandoExcepcion() throws IOException{}
	
}

