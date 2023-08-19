public class MetodosDefaultHerencia implements Interface1, Interface2{

	public static void main(String[] args){
		MetodosDefaultHerencia c = new MetodosDefaultHerencia();
		c.imprimir("metodos abstractos con misma firma");
		//c.doIt();
		c.doIt2();
	}
	
	public void imprimir(String message){
		System.out.println(message);
	}

	public void imprimir(String message, int x){
		System.out.println(message);
	}

	public void doIt(){
		System.out.println("doIt personalizado");
	}
}

interface Interface1{
	void imprimir(String message);
	void imprimir(String message, int x);

	void doIt();

	static void doIt2(){}
}

interface Interface2{
	void imprimir(String message);

	public default void doIt(){
		System.out.println("interface 2");
	}

	public default void doIt2(){
		System.out.println("interface 2");
	}
}
