public interface MethodTypes{	
	int EDAD = 20; //public static final

	//4. abstractos: solo de admiten publicos
	void print();	
		
	//**concretos: publicos o privados (protected no)
		//metodos finales no son permitidos	
	
		//1. metodos instancia: siempre privados
	private void print2(String message){
		System.out.println(message);
	}	
	
		//2. estaticos: publicos o privados
	public static void print4(){
		System.out.println("");
	}
	private static void print5(){
		System.out.println("");
	}
	
		//3. default: siempre publicos
	public default void print6(){
		print2("En el metodo default");
	}
	
	public default void print7(){
		print2("En el metodo default");
	}
	
	public static void main(String args[]){
		ClaseHija c = new ClaseHija();
		c.print();
		c.print6();
		//c.print5();
	}
}	

class ClaseHija implements MethodTypes{
	public void print(){
		System.out.println("implementacion de clase hija");
	}

	public void print6(){
		System.out.println("En el metodo default clase hija");
	}
}