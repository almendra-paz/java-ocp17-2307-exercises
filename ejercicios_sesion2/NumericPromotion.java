public class NumericPromotion{

	public static void main(String args[]){
		//operadores unarios
		final byte byte1 = 1;
		short c = -byte1;
		System.out.println(c);
	
		// finals
		short s3 = 2 + 2;
		final int i = 10;
		byte b = i + 2; 
		System.out.println(b); //12
		
		// promocion numerica
		long l1 = 5L;
		float f1 = 0.0f;
		System.out.println(f1 + l1);

		short s1 = 2;
		short s2 = (short) (s1 + 2);
		
		//++,--, asignaciones compuestas (cast implicito)
		short s4=0;
		//s4 = s4 + 2; // no compila
		s4+=2;	// s4 = (short)(s4 + 2)
		System.out.println(s4);
		byte b2 = 1;
		//byte b3 = b2 + 1;	// no compila
		byte b3 = b2++; // b2 + 1
		System.out.println(b3); //1
		System.out.println(b2); //2

		double d = 1.0;
		float f = 2.0f;
		f += d;

		

		final Integer wr1 = 1;
		//wr1++;	// se crea otro objeto y se asigna a wr1		

	}
}