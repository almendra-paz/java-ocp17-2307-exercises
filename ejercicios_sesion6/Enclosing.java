public class Enclosing{

	static class Nested{
		private int price = 6;
		private static int MAX = 10;
	}

 	public static void main(String args[]){
		Nested nested = new Nested();
		System.out.println(nested.price);
		System.out.println(nested.MAX);
		//System.out.println(Nested.price);
		System.out.println(Nested.MAX);
	}
	
	private void instanceMethod(){
		Nested nested = new Nested();
		System.out.println(nested.price);
		System.out.println(nested.MAX);
	}
}
