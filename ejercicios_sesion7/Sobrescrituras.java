public class Sobrescrituras{
	public static void main(String[] args){
		Person e = new Empleado();
		System.out.println(e.MAX); // 0 
		System.out.println(e.getMAX()); //0
		System.out.println(e.edad); //0
		System.out.println(e.getAge());	//0
		
		Empleador r = new Empleador();
		r.MAX = 100;
		r.edad = 30;
		
		//System.out.println(e.MAX);	//100
		//System.out.println(e.edad); //20
	}
}

class Person {	
	protected static int MAX = 10;
	protected int edad = 20;
	
	protected int getAge(){
		return this.edad;
	}	
	protected static int getMAX(){
		return MAX;
	}

	public int getEdad(){
		return this.edad;
	}
}

class Empleado extends Person{	
	public static int MAX = 0;
	public int edad = 0;

	protected static int getMAX(){
		return MAX;
	}

	public int getEdad(){
		return this.edad;
	}

}

class Empleador extends Person{	

}


