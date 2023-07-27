public class Ternary{

	public static void main(String args[]){
		//--- Operandos numéricos
		
		//primitivos numericos (amplitud)
		System.out.println("--- primitivos numericos ---");
		int a = 1, b=2;
		double double1 = a == b? 5: 10.0; //int, double
		var int0 = a == b? 5: 10.0;  // var infiere double
		System.out.println(double1); //10.0
		
		//primitivo numericos y wrapper	
		System.out.println("--- primitivo numericos y wrapper ---");
		int intPrim1 = 6; double doubPrim1 = 60.0;
		Double double2 = 10.0, double3; 
		Byte byte1=1, byte2;
		Integer integer1 = 1000;
						
		int int1 = false?intPrim1:byte1; //int:Byte ==> int
		
		Integer integer11 = false?intPrim1:byte1; 
		//int:Byte ==> Integer
		System.out.println(integer11);
		
		double2 = false?intPrim1:doubPrim1; //int, double
		double double_4 = false?intPrim1:doubPrim1;
		System.out.println(double_4);
		
		
		//wraper y wraper
		Integer integer2 = false?integer1:byte1; //amplitud			
		Number number1 = false?integer1:byte1; //por padre común mas próximo
		
		//Double double4 = false?integer1:byte1;		
		double double5 = false?integer1:byte1; 
		
		//Asociación derecha
		int a2 = true?false?0:3:4;
		System.out.println(a2);
		
		int a1 = true?(false?0:3):4;
		System.out.println(a1);	//3
		
		System.out.println(true ? 10: "hello");
		System.out.println(false ? 10: "hello");
			
	}
	
	
}