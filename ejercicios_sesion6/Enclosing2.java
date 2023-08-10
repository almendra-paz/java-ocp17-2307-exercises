public class Enclosing2{
	private int length = 5;
	
	//metodo de instancia
	public void sumar(){
		final int width = 10;
		int area = 34;
		
		//localclass
		class LocalClass {
			public int multiplicar(){
				return length*width*area;
			}
		}
		//instanciando localClass
		LocalClass local = new LocalClass();
		System.out.println(local.multiplicar());
		
		//area = 35;
	}
	
 	public static void main(String args[]){
		Enclosing2 outer = new Enclosing2();
		outer.sumar();
	}
}
