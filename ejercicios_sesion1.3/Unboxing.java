/**************************************************
Pasar de Wrapper a primitivo:
-----------------------------
 - Mediante métodos xxxValue()
 - Mediante método parseXxx: pasar de String a primitivo
 - Auto-unboxing
***************************************************/
public class Unboxing{
	public static void main(String args[]){
		System.out.println("---- 1. Metodos xxxValue() ----");
		Integer integer1 = Integer.valueOf(200); //crea	
		//Integer integer1 = 200; //autoboxing	
		int int1 = integer1.intValue(); //sacar
		
		Double double1 = Double.valueOf(200);
		double d1 = double1.doubleValue();
		
		System.out.println(int1+", "+d1);

		System.out.println("---- 2. unboxing ----");
		int i2 = integer1; //auto-unboxing (Wrapper -> primitivo)
		double d2 = double1;
		System.out.println(i2+", "+d2);
		
		System.out.println("---- 3. Primitivo desde String ----");
		int i3 = Integer.parseInt("10");
		byte b3 = (byte)Integer.parseInt("10");
		
		//NumberFormatException
		//int i31 = Integer.parseInt("10.2"); 
		//int i32 = Integer.parseInt(null);
		int i33 = Integer.parseInt(""+100); //"100"
		
		//NumberFormatException
		//float float3 = Float.parseFloat("true"); 		
		//float float3 = Float.parseFloat(null); 
					
		int i4 = Integer.parseInt("110",2); //6 (1*4 + 1*2 + 0)
		
		int i5 = Integer.MIN_VALUE;
		int i6 = Integer.MAX_VALUE;
		System.out.println(i3+", "+ i4+", "+ i5+", "+ i6);	
		
		//float constants
		float f1 = Float.NaN; //NaN
		float f2 = Float.NEGATIVE_INFINITY; //-Infinity
		float f3 = Float.POSITIVE_INFINITY; //Infinity
		System.out.println(f1+", "+f2+", "+f3);
		
		float op1= 12, op2=0;
		float f4 = op1/op2;
		if(f4 == Float.POSITIVE_INFINITY){
			System.out.println("es infinito");
		}
		
		float fe1 = Float.parseFloat("Infinity"); 
		float fe2 = Float.parseFloat("NaN");
		int i7 = Integer.parseInt(""+Integer.MIN_VALUE);
		System.out.println(fe1 + " " + fe2 + " "+i7);
		
	}
}