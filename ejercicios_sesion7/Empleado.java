public class Empleado extends Person{

	public Empleado(){
		super("name");
	}

	public static void main(String args[]){
		Empleado e = new Empleado();
		e.name = "Juan"; e.COUNT=2;

		Empleado e2 = new Empleado();
		e2.COUNT=3;
		
		Person p = new Person("Pepe");
		System.out.println("Empleado:[name:"+e.name+", count:"+e.COUNT+"]"); 
		System.out.println("Persona: [name:"+p.name+", count:"+p.COUNT+"]");
 	}
}
class Person {

	public static int COUNT = 0;
	protected String name = "Pepe";

	public Person(String name){
		this.name = name;
	}
}
