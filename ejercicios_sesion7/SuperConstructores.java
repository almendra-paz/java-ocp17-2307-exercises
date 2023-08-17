public class SuperConstructores{
	public static void main(String args[]){
		Empleado emp = new Empleado();	
		emp.imprimirDatos(); //Maria
	}
}

class Person {
	String name;
	
	public Person(){
		this.name = "Juan";
	}
	public Person(String name){
		this.name = name;
	}			
	protected void imprimirDatos(){
		System.out.println("nombre: "+ this.name);
	}
}

public class Empleado extends Person{
	public Empleado(){	
		this("Lucia");
		//this.name = "Maria";
 	}
	public Empleado(String name){	
		super(name);
		this.name = name;
 	}	
}

