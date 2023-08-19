public class AnonymousClass{
	public static void main(String args[]){
		//anonymous class e instanciación
		Dummy d = new Dummy(){
			public void imprimir(){
				System.out.println("hello");
			}
		};
		d.imprimir();
	}
}

interface Dummy{
	void imprimir();
}

