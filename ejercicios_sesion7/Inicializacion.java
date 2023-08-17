public class Inicializacion{

	static{
		System.out.println("Bloque estático de inicialización");
	}

	public static void main(String args[]){
		System.out.println("SUB: en el main de la subclase");
		System.out.println("-------------");
		
		//Empleado emp1;
		Empleado emp1 = new Empleado(); 
		System.out.println("-------------");
		Empleado emp2 = new Empleado(); 	
	}
}

class Empleado extends Person{
	static{
		System.out.println("SUB: inicializador estático");
	}
	{
		System.out.println("SUB: inicializador instancia");
	}
	public Empleado(){
		System.out.println("SUB: constructor");
	}	
}

class Person {
	static{
		System.out.println("SUPER: inicializador estático");
	}
	{
		System.out.println("SUPER: inicializador instancia");
	}
	public Person(){
		System.out.println("SUPER: constructor");
	}
}
