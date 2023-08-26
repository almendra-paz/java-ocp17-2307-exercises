import java.io.IOException;
import java.io.FileNotFoundException;

public class Sobrescritura {

	public void escribir() throws IOException{
		System.out.println("ecsribiendo");
	}

	public void escribir2(){
		System.out.println("ecsribiendo 2");
	}


	public static void main(String args[]) throws IOException{
		ClaseHija c = new ClaseHija();
		c.escribir();
	}
}


class ClaseHija extends Sobrescritura{

	// declarar igual exception
	// declarar exception hoja
	// no declarar ninguna excepción
	// (arrojar unchecked exceptions)
	public void escribir() throws FileNotFoundException{
		System.out.println("sobrescribiendo ecsribiendo");
	}

	public void escribir2() throws NullPointerException{
		System.out.println("ecsribiendo 2");
	}

}