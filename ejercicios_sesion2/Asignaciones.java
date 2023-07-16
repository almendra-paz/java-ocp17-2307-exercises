public class Asignaciones{
	
	public static void main(String args[]){
		
		int i1= 2;
		int i2= 3;
		//i2 = i2*i1;
		i2 *= i1;	// equivalente a i2 = (int) ( i2 * i1);
		System.out.println(i2); //6
				
		byte b1 = 8;
		byte b2;
		//b1 = b1 + 3;
		b1 += 3; // b1 = (byte)(b1 +3)
		System.out.println(b1); //11		
		
		b1 /= 2;	// se asigna 4 a b1
		// equivalente a b1 = (byte) (b1 / 2);
		
		Integer int1 = 1000;
		Integer int2 = 50;
		
		int1 += 10; // i1 = (Integer) (i1 + 10);
		double d = int1 + int2;
		int1 = (Integer)(int1 + 10);
		int1 += int2;	// i1 = (Integer) (int1 + int2);
		
	}
	
}