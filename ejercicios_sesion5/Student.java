public class Student{
	private String name;
	private static int AGE_GROUP = 23;
		
	static{
		System.out.println("--- Cargando la clase");
	}
	
	{	
		System.out.println("--- Inicializador instancia");
		name = "Juan Perez";
	}

 	public static void main(String arg[]){
		System.out.println("--inicio--");
		Student a = new Student();
		a.name = "Roberto Sanchez";
		a. printName("Juan");
		Student b = new Student();
		b.printName("Carlos");
	}
	
	public void printName(String name) {
		System.out.println("Mi nombre es: "+ this.name);
		System.out.println(name);
    }
/*
	public void printName() {
		System.out.println("Mi nombre es: "+ this.name);

		System.out.println("---");
		System.out.println(Student.this.name);
    }*/
}
