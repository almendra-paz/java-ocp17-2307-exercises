public class Outer{
	private String saludo = "hi";
	
	protected class Inner{
		//public static int EDAD = 10;
		//public static void impresion(){}
		public void innerSaludo(){
			System.out.println(saludo);
			Outer.imprimir();
		}
	}
	
	public void callInner(){
		Inner inner = new Inner();
		inner.innerSaludo();
	}
	
	public static void main(String args[]){
		Outer outer = new Outer();
		outer.callInner();

		//Instanciacion de la clase Inner
		Outer.Inner inner = outer.new Inner();
		inner.innerSaludo();
	}
	
	public static void imprimir(){
		System.out.println("imprimiendo");
	}
}
