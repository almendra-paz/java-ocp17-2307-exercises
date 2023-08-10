public class InitsStaticos{
	public static int A;
	
	static {
		System.out.println("hello ");
		B = 2;
		//System.out.println(B);	//dará error 
	}
	static int B;
	static {
		//System.out.println(B);
		 System.out.println("world");
		 B = 8;
	}

	{
		System.out.println("inicializar de instancia");
	}

	public InitsStaticos(){
		 System.out.println("constructor");		
	}

	public static void main(String arg[]){
		System.out.println("Clase cargada");
		System.out.println(B);
		//InitsStaticos init = new InitsStaticos();
	}
}
