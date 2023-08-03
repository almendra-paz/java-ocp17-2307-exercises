public class StringMethods{

	public static void main(String args[]){
				
		//length
		System.out.println("ABCDEFG".length()); //
		
		//charAt
		System.out.println("ABCDEFG".charAt(4)); //E
		System.out.println("ABCDEFG".charAt(6)); //G
		//System.out.println("ABCDEFG".charAt(-1));
		//System.out.println("ABCDEFG".charAt(7));
		//IndexOutOfBoundsException		
		//StringIndexOutOfBoundsException
		
		System.out.println("---- IndexOf ----");
		System.out.println("ABCDEFGA".indexOf('A')); //0
		System.out.println("ABCDEFGA".indexOf('Z')); //-1
				
		System.out.println("ABCDEFG".indexOf('C',0)); //2
		System.out.println("ABCDEFG".indexOf('D',0)); //3
		System.out.println("ABCDEFGA".indexOf('A',2)); //7

		System.out.println("---- Substring ----");
		System.out.println("hello".substring(2,2)); //
		System.out.println("hello".substring(2,4)); // ll
		System.out.println("hello".substring(2)); // llo
		System.out.println("hello".substring(5)); // 
		
		// Substrings con excepcion
		//System.out.println("hello".substring(6)); // 
		//System.out.println("hello".substring(-1)); 

		System.out.println("---- Replace ----");
		String replace1 = "aa22ccdd22";		
		String replace2 = "aabbccddbb";
		String replace3 = replace2.replace("bb","22");
				
		System.out.println(replace1 == replace3); 
		
		System.out.println("abcdabcdd".replace("d","e")); 
		//abceabcee
		
		System.out.println("---- strip and trim ----"); 
		System.out.println(" 1 2 3 ".strip()); //1 2 3
		System.out.println(" 1 2 3 ".strip()); //1 2 3
		System.out.println(" 1 2 3 ".trim()); //1 2 3
		System.out.print(" 1 2 3 ".stripLeading());
		System.out.println("|");
		System.out.println(" 1 2 3 ".stripTrailing());
		
		String strip1 = "1 2 3";
		String strip2 = " 1 2 3 ".strip();
		String strip3 = "1 2 3".strip();
		System.out.println("result1: "+ (strip1 == strip2));
		System.out.println("result2: "+ (strip1 == strip3));
		
		System.out.println("---- Concat y Uppercase----");
		System.out.println("hello".concat(" world"));
		System.out.println("lima".toUpperCase());
		
		System.out.println("---- equals ----");
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = "Hello";
		String str4 = str1.intern();
		System.out.println("equals1: " + (str1 == str2)); 
		//false
		System.out.println("equals2: " + 
		(str1.equals(str2)));	//true
		System.out.println("equals3: " + 
		(str1.equalsIgnoreCase(str3)));	//true
		System.out.println("equals4: " + 
		(str1.equalsIgnoreCase(str4)));	//true
		System.out.println("equals5: " + 
		(str1.intern().equalsIgnoreCase(str4))); //true
		System.out.println("equals6: " + 
		(str1==str4)); 
		
	}

}





