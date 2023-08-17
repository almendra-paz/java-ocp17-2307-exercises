public class Empleado3 extends Person{
	/**********
	Consideraciones: firma, accesibilidad, excepciones, 
	return_type, modif final
	********/


	protected Empleado3 getPrimerEmpleado(){return null;}

	
	public static void evaluarEmpleado() throws Exception{
		System.out.println("evaluacion clase hija");
	}

	public static String evaluacion() throws Exception{
		Empleado3 e3 = new Empleado3();
		((Person)e3).evaluarEmpleado();
		return null;
	}

	
	public static void main(String[] args)throws Exception{
		evaluacion();
	}

}

class Person {	
	protected Person getPrimerEmpleado(){ return null;}

	public static void evaluarEmpleado() throws Exception{
		System.out.println("evaluacion clase padre");
	}

	final String getSegungoEmpleado(){return null;}

}
