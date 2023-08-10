/*
* sí compilan: 
	static -> static
	instance -> static
	instance -> instance
* no compilan: 
	static -> instance (sin usar una referencia)
*/

public class Estaticos{
	private String nombre;
	private static int MAX = 20;
	
	public int instance(){
		// instance --> static
		//return MAX;
		return suma(10);
		// instance --> instance		
	}
	
	public int suma(){
		return 3;
	}
	
	public static int suma(int a){
		return 3 + a;
	}
	
	public static void main(String arg[]){	
		/*sí compilan: static -> static
		*/
				
		// acceso a métodos estáticos
		int suma = suma(3);
		System.out.println(suma);
		
		//variable estáticas
		System.out.println(Estaticos.MAX);
		System.out.println(MAX);
		
		/* no compilan: static -> instancia
		*/
		
		//acceso a variables de instancia
		//this.nombre = "Juan Perez";	
		//nombre = "Juan Perez";
		
		// acceso a métodos de instancia
		//suma();
						
		Estaticos e = new Estaticos();
		e.nombre = "Juan Perez";
		e.suma();
		System.out.println(e.instance());
	}
}
