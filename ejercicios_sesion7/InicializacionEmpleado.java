class InicializacionEmpleado extends Person{
	static{
		System.out.println("SUB: inicializador estático");
	}
	{
		System.out.println("SUB: inicializador instancia");
	}
	public InicializacionEmpleado(){
		System.out.println("SUB: constructor");
	}	
	
	public static void main(String args[]){
		System.out.println("SUB: en el main de la subclase");
		System.out.println("-------------");		
		InicializacionEmpleado emp1 = new InicializacionEmpleado(); 
		System.out.println("-------------");
		InicializacionEmpleado emp2 = new InicializacionEmpleado(); 	
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
