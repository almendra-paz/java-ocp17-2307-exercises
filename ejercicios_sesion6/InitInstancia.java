class InitInstancia{
	{		
		System.out.println("hello ");
	}
	{		
		System.out.println("world");
		//new InitInstancia();
	}
	
	InitInstancia(){
		
	}	

	public static void main(String arg[]){
		{ 	
			System.out.println("Hi, "); 
		}
		InitInstancia e1 = new InitInstancia();
		InitInstancia e2 = new InitInstancia();
	}
}
