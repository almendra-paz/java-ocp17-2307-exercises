public class StringConstructors{

	public static void main(String args[]){
		System.out.println("--- String vacio");
		String str1 = new String();
		System.out.println(str1); //

		System.out.println("--- Con literal");
		String str2 = "hello";
		String str3 = new String("hello");
		System.out.println(str2); //hello
		System.out.println(str3); //hello

		System.out.println("--- String a partir de SB");
		StringBuilder sb = new StringBuilder();
		sb.append("hello world");
		String str4 = new String(sb);
		System.out.println(str4);	// "hello world"

		System.out.println("--- String a partir de arrays");
		byte[] barray = new byte[]{97,98,99};	//unicode values
		String str5 = new String(barray);
		System.out.println(str5);	// "abc"

		char[] carray = new char[]{'a','b',60};
		String str6 = new String(carray);
		System.out.println(str6);
		
		//String str7 = new String(8);		
		//String str9 = String.valueOf(8);
		//String str8 = new String(null);	
		String str81 = null;
		
		//String str10 = false + null + "";
		String str11 = ""+ false + null; //falsenull
		
	}

}