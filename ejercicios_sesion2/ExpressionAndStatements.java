public class ExpressionAndStatements{

	public static void main(String args[]){
		int a = 10;
		int b = 20;
		//a + b;	// es una expresión y NO un statement
		int c = (a + b); //30
		int d = (a = a + b);
		System.out.println(d);//
		//a = a + b;	// statement or expression?

		System.out.println(a = 25); //25
		
		//int d = (a = a + b);	
		//System.out.println(d);	
		
		//System.out.println(a = a + b); 
		
	}
}