public record AlumnoRecord2(String id, String name, int edad) {

	// no inicializadores
	
	static String direccion;

	private static String telefono;

	public static void imprimir(){}

	public void imprimir2(){}
	
	//Long Constructor
	/*
	public AlumnoRecord2(String id, String name, int edad){
		if(edad > 20) throw new RuntimeException("Edad excesiva");

		this.id = id;
		this.name = name.toUpperCase();
		this.edad = edad;
	}*/

	//Compact Constructor
	public AlumnoRecord2{
		System.out.println("compact constructor");
		if(edad > 20) throw new RuntimeException("Edad excesiva");

		id = "14";
		name = name.toUpperCase(); //parámetro
		//siempre se ejecuta el constructor largo (this.name = name)
	}

	//Constructor sobrecargado
	public AlumnoRecord2(String id, String name){
		this(id, name, 0);
	}

	public static void main(String args[]){
		System.out.println("------");
		var alumno = new AlumnoRecord2("12", "Juan", 20);
		System.out.println(alumno);

		var alumno2 = new AlumnoRecord2("13", "Alberto");
		System.out.println(alumno2);

	}

	/*
	@Override public String toString(){
		return "overriden";
	}
	*/

}