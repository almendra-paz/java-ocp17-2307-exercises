public class StringInterning{

	public static void main(String[] args){
		String str1 = "hello"; //string pool
		String str2 = "hello"; //string pool
		System.out.println(str1 == str2); //true

		String str3 = new String("hello"); //heap space
		String str4 = new String("hello"); //heap space
		System.out.println(str3 == str4); //false
		
		//str3 = str3.intern();
		//System.out.println("new:"+ (str1 == str3));	//true
		
		System.out.println(str1 == str3.intern()); //true
		System.out.println(str2 == str3.intern()); //true
		System.out.println(str3.intern() == str4.intern());
			//true
	}
}