public class FinalTestClass{
	final int value;	// 1. no hay init en la declaración
	
	// 2. en el bloque de init tbm hay init	
	{	System.out.println("");
	}
	
	FinalTestClass(){
		value = 10;
	}
	FinalTestClass(int x){
		value = x;
	}
	FinalTestClass(int a, int b){
		System.out.println("");
	}
	
	public static void main(String args[]){
		System.out.println("ok");
		FinalTestClass f = new FinalTestClass(10, 10);
	}
}
