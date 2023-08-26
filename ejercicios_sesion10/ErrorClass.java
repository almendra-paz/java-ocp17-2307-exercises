public class ErrorClass{

	// Una excepcion en el inicializador static
	// causará un error java.lang.ExceptionInInitializerError
	static{
		int[] countOfMoose = new int[3];
		int num = countOfMoose[-1];
	}

	public static void main(String args[]){
		System.out.println("en el metodo main");
	}

}
