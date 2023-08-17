public class Empleado4 extends Person{
	final int num = 0;	

	protected Person getPrimerEmpleado(){ return null;}
	public String evaluarEmpleado() throws RuntimeException{return null;}

	public static void main(String[] args){
	}

}

class Person {	
	final int num = 0;
	protected final Person getPrimerEmpleado(){ return null;}
	public static String evaluarEmpleado() throws Exception{return null;}

}
