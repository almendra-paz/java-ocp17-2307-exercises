public class Literales{

	public static void main(String args[]){
		//numericos
		int a = 10;
		int a2 = 100_000;
		double d1 = 100_0_0_0.345;
		double d2 = 10;				// int -> double
		//float f2 = 100.00; //double -> float
		System.out.println(a);
		System.out.println(a2);
		System.out.println(d1);
		System.out.println(d2);

		//long y float
		float f1 = 100_000.345f;	//double -> float
		long l1 = 10L;				//long -> long
		System.out.println(f1);
		System.out.println(l1);
		
		//otras bases
		int hexnum = 0xF;
		int octnum = 017;
		int binnum = 0b10;
		System.out.println(hexnum);
		System.out.println(octnum);
		System.out.println(binnum);
	}

}