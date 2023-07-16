public class Operadores{
	
	public static void main(String args[]){
		
		System.out.println("---- Operadores Unarios ----");
		
		//incremento/decremento post pre
		int a = +10;		
		int b = -10;
		a++;		// a incrementa de 10 a 11
		++a;		// a incrementa de 11 a 12
		System.out.println(a); //12
		b++;		// b incrementa de -10 a -9
		System.out.println(b);
		
		--a; // a--
		System.out.println(a); // de 12 a 11
		
		//complemento lógico
		boolean expr1 = false;
		boolean expr2 = !expr1; 
		System.out.println("---- Complemento logico ----"); 
		System.out.println(expr2); //true
		
		//Bitwise complement (~)
		System.out.println("---- Bitwise complement (~) ----");
		
		byte b1 = 1;	// 00000001
		System.out.println(~b1);
		byte b2 = (byte)~b1; 	// b2 es 11111110
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(b2);
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(5));
						
				
		System.out.println("---- Cast ----"); 
		int int1 = (int) 200.00;
		System.out.println("int: "+int1);
		
		//3. Operadores Aritméticos
		
			System.out.println("---- Wrapper + primitivo"); 
			//Combinando Wrapper y primitivos
			Double da1 = 120.00;
			Integer ia1 = 10;
			int int2 = 12;
			
			int int3 = ia1 + int2; // Integer + int
			System.out.println(int3);
			
			System.out.println("---- Wrapper + wrapper");
			double ra1 = da1 + ia1; // Double + Integer
			System.out.println("suma: "+ra1);
			int mod1 = (int)(da1%ia1); //0 Double + Integer
			System.out.println("resto: "+mod1);

		
			//Concatenacion String
			System.out.println("---- Concatenacion String"); 
			String str1 = "hello";
			String str2 = " world";
			String s = str1 + str2;	
			System.out.println(s); //hello world
			
			String str3 = 20 + 4 + "5";
			System.out.println(str3); // 245

			String str4 = "5" + 20 + 4;
			System.out.println(str4); // 5204
			
			Object obj1 = "hello";
			//String str5 = true + 5; 
			//String str6 = obj1 + 10; //
			//System.out.println(str6);
			
			
		//4. Relacionales
		
			System.out.println("---- == ----");
			//==
			Integer i = 10;		
			Double d = 10.0;			
			double d2 = 10.0;
			//System.out.println(i == d);	// no compila
			System.out.println(i == d2); // true
			
			Integer integera = 10;
			Integer integerb = 10;	
			Boolean	boolean1 = true;
			Boolean	boolean2 = true;
			
			System.out.println("---- Integers ----");
			System.out.println(integera == integerb); //true
			
			System.out.println("---- Booleans ----");
			System.out.println(boolean1 == boolean2);
			
			//instanceof 
			// String extends Object
			// si obj1 es instancia de String --> 
			// obj1 también de las clases padre de String
			System.out.println("--- instanceof ----");
			Object obj = "hello";
			boolean isString = (obj instanceof String);
			System.out.println(isString);
			
			System.out.println(obj instanceof Object);

			boolean isNumber = (obj instanceof Number);
			System.out.println(isNumber);	

			//Integer -> Number -> Object
			Integer integer1 = 100;
			boolean isString2 = (integer1 instanceof Number);
			//System.out.println(isString2);
			
			System.out.println("---- Logicos ----");
			
			int logb1 = 1;	// 00000001
			int logb2 = 2; 	// 00000010
			int logb3 = (logb1&logb2); // b3 00000000
			System.out.println(logb3);
			System.out.println(logb1|logb2); //00000011
			System.out.println(logb1^logb2);	
			//00000011			

		
	}
	
}















