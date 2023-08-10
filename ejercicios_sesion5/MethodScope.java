class MethodScope{

	//private String name;
	static String name = "Juan";	
	static int clase = 0;

	public static void main(String[] args){
		
		System.out.println(name); //1 	//Juan
		int j = 3;
		for(int i=0; i<10; i++){
			String name = "Jose";
			System.out.println(name); //2	//Jose (loop)
			int clase = 1;
		}
		{
			int clase = 2;
		}
		
		String name = "Victor";		
		System.out.println(name);	//1		//Victor (metodo)
		
		System.out.println(MethodScope.name); //Juan
		
	}
}