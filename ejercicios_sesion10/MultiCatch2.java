import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.MissingResourceException;
import java.util.InputMismatchException;

public class MultiCatch2{

public void capturandoExcepciones(){
	try{
		lanzandoExcepcion();
	}catch( IllegalStateException e){
	}catch(FileNotFoundException | IllegalArgumentException e){
	}catch(InputMismatchException | MissingResourceException e){
	}
	catch(IOException e){}
	catch(Exception e){}	

}

public void lanzandoExcepcion() throws IOException{}


}