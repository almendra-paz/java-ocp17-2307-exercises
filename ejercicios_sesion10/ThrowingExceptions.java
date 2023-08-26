class ThrowingExceptions{
	
	public static void main(String args[]) throws Exception{		
		good();
		/*
		try{
			eatCarrot();
			//good();
		}catch(NoMoreCarrotsException e){
			System.out.println("error");
		}
		*/		
	}	
	
	public static void good() throws Exception{
			eatCarrot();
	}

	private static void eatCarrot() throws Exception { 
			eatCarrot2();
	}
	
	private static void eatCarrot2() throws Exception{ 
			System.out.println("OK");
			throw new Exception();			
	}
}

class NoMoreCarrotsException extends Exception{}