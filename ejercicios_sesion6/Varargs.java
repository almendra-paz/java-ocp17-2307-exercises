public class Varargs{

	public static void main(String args[]){
		
		longitud(1,2,3,4); //4
		longitud(1); //1		
		longitud();	//0
		//longitud2();
		//longitud(null); // null pointer
				
		System.out.println("suma: "+average(1,2,3,4)); 
		// x = 1, values = {2,3,4}
		System.out.println("suma: "+average(1));			
		// x = 1, values = {}
		//System.out.println(average(1, null)); 
		// x = 1, values = null
	}
	
	public static void longitud2(int[] values){
		System.out.println(values.length);		
	}
	
	public static void longitud(int... values){
		System.out.println(values.length);		
	}
	/*
	public static void badMethod(int... values, double b){
		System.out.println(values.length);		
	}*/

	public static double average(int x, int... values){
		double sum = 0;
		for(int i=0; i<values.length; i++)
			sum += values[i];

	System.out.println("valor de x= "+x);		
		return sum;		
	}
		
}