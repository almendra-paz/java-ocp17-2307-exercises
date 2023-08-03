public class StringBuilderData{

	public static void main(String[] args){
		
		System.out.println("---- Constructor ----");
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1); // ""
		System.out.println(sb1.length());		
		System.out.println(sb1.capacity());
		
		
		sb1.append("11111111111111111111111111111");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		StringBuilder sb = new StringBuilder("abcde");
		System.out.println(sb);

		//append e insert
		System.out.println("---- append e insert ----");
		System.out.println(sb.append(true));
		System.out.println(sb.append(12.0));
		System.out.println(sb.append(12.0f));
		System.out.println(sb.append(new Object()));
				
		System.out.println(sb.insert(5,"__"));

		sb.append("qqqqqqqqqqqqqqqqq");
		System.out.println(sb.length()); //61
		System.out.println(sb.capacity()); //90
		//System.out.println(sb.insert(80,"__"));
		//System.out.println(sb.insert(-1,"__")); // java.lang.StringIndexOutOfBoundsException

		//método de referencia
		System.out.println("---- metodos de referencia ----");
		sb = new StringBuilder("abcde");

		System.out.println(sb.reverse()); //edcba
		System.out.println(sb); //edcba
		System.out.println(sb.reverse().reverse()); //edcba
		System.out.println(sb.delete(1,2));	//ecba
		System.out.println(sb.delete(4,4));	
		System.out.println(sb.delete(4,7));	//no exception
		
		//System.out.println(sb.delete(5,7));	
		//arroja excepcion StringIndex..
		
		sb = new StringBuilder("abcde");
		//System.out.println(sb.deleteCharAt(-1)); //StringIndex...Exception		
		System.out.println(sb.replace(1,3,"----")); //a--de
		
		sb = new StringBuilder("abcde");
		System.out.println(sb.replace(4,7,"----")); //no exception
		
		
		System.out.println("---- metodos que no devuelven un String Builder----");
		
		System.out.println(sb.capacity());
		System.out.println(sb.length()); //5
		//a--de
		System.out.println(sb.charAt(3)); //d
		System.out.println(sb); //a--de


		StringBuilder sb2 = new StringBuilder("abcde");

		System.out.println(sb2.indexOf("e")); //4
		System.out.println(sb2.indexOf("a",1));  //-1
		System.out.println(sb2.substring(2)); //cde
		System.out.println(sb2.substring(2,5)); //cde
		System.out.println(sb2.toString());		// abcde
		System.out.println(sb2);		// abcde

		//substring and delete
		sb2 = new StringBuilder("abcde");		
		String str2 = sb2.substring(0,2); 
		System.out.println(str2 + " "+ sb2);
		StringBuilder sb3 = sb2.delete(0,2);
		System.out.println(sb3 +" "+ sb2);		
	}

}