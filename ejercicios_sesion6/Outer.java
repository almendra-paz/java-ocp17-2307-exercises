public class Outer{
	private String saludo = "hi";
	
	protected class Inner{
		public void innerSaludo(){
			System.out.println("inner saludo");
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
	}
	
	public static void imprimir(){
		System.out.println("imprimiendo");
	}
}
