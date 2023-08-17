public class Empleado2 extends Person{

	public Empleado2(){
		super("name");
	}


	public void imprimirTexto(){
		System.out.println("impresion en clase hijo");
	}

	public void imprimirReporte(){
		this.imprimirTexto();
	}

	public static void main(String args[]){
		Empleado2 e = new Empleado2();
		e.name = "Juan"; e.COUNT=2;

		Empleado2 e2 = new Empleado2();
		e2.COUNT=3;
		
		Person p = new Person("Pepe");
		System.out.println("Empleado:[name:"+e.name+", count:"+e.COUNT+"]"); 
		System.out.println("Persona: [name:"+p.name+", count:"+p.COUNT+"]");

		e.imprimirReporte();
		//e.super.imprimirTexto();
 	}
}
class Person {

	public static int COUNT = 0;
	protected String name = "Pepe";

	public Person(String name){
		this.name = name;
	}

	public void imprimirTexto(){
		System.out.println("impresion en clase padre");
	}

	void defaultMethod(){
		System.out.println("impresion en clase padre");
	}
}
