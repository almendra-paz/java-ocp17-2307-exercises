public class For{

	public static void main(String arg[]){
		
		// Ejemplos de For
		int j = 0;
		for(int i=1; j<2; j++){	
			i++;
			System.out.println("for");		
		}
		for( var a = 5; a < 7; a++);
		
		int x = 0;
		
		for( var a = 5; a < 7; a++, x++, impresion("actualizando"), impresion("siempre")){
				System.out.println("--for iteration--");
		}
		
		int m = 0;
		for( m++; m < 10; m++);		

		//For válidos e infinitos
		//for(;;);
		/*
		for(;;){
			System.out.println("siempre");
		}
		
		for(;;) System.out.println("siempre");
		*/
	}
	
	private static void impresion(String str){
		System.out.println(str);
	}
}