public class TextBlocks{
	
	public static void main(String args[]){		
				
		/** 
		
		"El valor de una idea radica en el uso de la misma". 
			Tomas A. Edinson
			
		**/
		String textBlock = """		
			"El valor de una idea radica en el uso de la misma". 
				Tomas A. Edinson 
			""";
		
		String original = "\"El valor de una idea radica en el uso de la misma\". \n	Tomas A. Edinson";
		
		System.out.println(textBlock);
		System.out.println(original);		
		
		String textBlock2 = """
						abc
						 def
						  g
						""";
		String textOriginal2 = "abc\n def\n  g\n";
						 
		System.out.println(textBlock2.length());
		System.out.println(textOriginal2.length());
		
		System.out.println(textBlock2 == textOriginal2);
		
						
	}
	
}