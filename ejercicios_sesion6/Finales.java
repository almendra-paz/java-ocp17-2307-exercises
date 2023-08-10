public class Finales{
	public static final int A = 10;	//1. declaracion
	//public static final int C;
	
	
	//2. inicializar en métodos estáticos
	static {
		B = 20;		
	}	
	
	static {
		System.out.println(A);
		//System.out.println(B);
		//B = 10;	// dará error de compilación
	}
	
	public static final int B;
	
	public static void main(String arg[]){
		System.out.println("Cargando clase");
		final int suma;
		suma = 100;
		System.out.println(suma);		
		System.out.println(B);
	}
}
