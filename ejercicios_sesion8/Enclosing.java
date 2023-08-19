public class Enclosing{
	private String saludo = "hi";
	private static int EDAD = 18;

	static class Nested{
		private int price = 6;
		private static int MAX = 10;
		public void imprimir(){
			//System.out.println(saludo);
		}
		public static void imprimir2(){
			System.out.println(EDAD);
		}

	}

 	public static void main(String args[]){
		Enclosing.Nested nested = new Enclosing.Nested();
		System.out.println(nested.price);
		System.out.println(nested.MAX);
		//System.out.println(Nested.price);
		System.out.println(Nested.MAX);

				
		nested.imprimir2();
		nested.imprimir();
	}
	
	private void instanceMethod(){
		Nested nested = new Nested();
		System.out.println(nested.price);
		System.out.println(nested.MAX);
	}
}
