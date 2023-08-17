public class ReglasOverriding{

	public static void main(String args[]){
		//Empleado e = new Empleado();
		Person e = new Empleado();
		System.out.println(e.getValue()); //hello
		System.out.println(e.getEdad()); //20
		//30
	}
}

class Empleado extends Person{	
	protected String getValue(){
		return "hello";
	}
	private Object getName() throws Exception{
		return "Juan";
	}	
	public static int getEdad(){
		return 20;
	}
}

class Person{	
	//private>default>protected>public
	protected Object getValue(){
		return "hello world";
	}	
	private Object getName(){
		return "Juan";
	}
	protected static int getEdad(){
		return 30;
	}
}