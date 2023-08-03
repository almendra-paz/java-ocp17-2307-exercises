public class MathApi{
	
	public static void main(String args[]){
		System.out.println("---- Min y Max ----");
		System.out.println(Math.min(3,5));
		System.out.println(Math.min(3.0, 5.0));
		System.out.println(Math.min(3L, 5L));
		System.out.println(Math.min(3.0f, 5));		
		System.out.println(Math.max(3,5));
		System.out.println(Math.max(3.0, 5.0));
		System.out.println(Math.max(3L, 5L));
		System.out.println(Math.max(3.0f, 5));
		
		System.out.println("---- Rounding ----");
		int redondeo1 = Math.round(3.141612123f);
		System.out.println(redondeo1);
		long redondeo2 = Math.round(3.5);
		System.out.println(redondeo2);
		
		System.out.println("---- Ceil ----");
		double double1 = Math.ceil(3.141);
		System.out.println(double1);
		double double2 = Math.ceil(3.0);
		System.out.println(double2);
		
		System.out.println("---- Floor ----");
		double double3 = Math.floor(3.141);
		System.out.println(double3);
		double double4 = Math.floor(3.0);
		System.out.println(double4);
		
		System.out.println("---- Pow ----");
		double double5 = Math.pow(3.0, 2.0);
		double double6 = Math.pow(4, 3);
		System.out.println(double5);
		System.out.println(double6);
		
		System.out.println("---- Random ----");
		double double7 = Math.random();
		System.out.println(double7);
	}
	
}