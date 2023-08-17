public class SuperParaMiembros{
	public static void main(String args[]){
		Empleado emp = new Empleado();
		emp.invocar();
		//emp.imprimirDatos();
		//emp.super.imprimirDatos(); // no compila
	}
}

class Empleado extends Person{	
	public String name = "Empleado";
	
	public void invocar(){
		this.imprimirDatos();
		super.imprimirDatos();
	}
	protected void imprimirDatos(){
		System.out.println("impresion segun clase Empleado");
		System.out.println(name);
		super.imprimirDatos();
		System.out.println(super.name);
	}
}

class Person extends Humano{	
	public String name = "Person";
	protected void imprimirDatos(){
		//super.imprimirDatos();
		System.out.println("impresion segun clase Person");
	}
}

class Humano{	
	protected void imprimirDatos(){
		System.out.println("impresion segun clase Humano");
	}
}

