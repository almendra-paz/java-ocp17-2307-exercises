public class DeclaradorArray{

	public static void main(String arg[]){
		
		int[] notas_p = {20,19,18};
		//double[] notas2_p = notas_p; 		
		
		//length
		for(int j=0; j<notas_p.length; j++){
			System.out.println(j + ": "+notas_p[j]);
		}
		

		// ArrayStoreException
		String[] nombres = {"Juan", "Carlos"};
		Object[] objetos = nombres;
		objetos[0]= new String("hello");
		//objetos[1]= new Object();
		
		Integer[] notas = {20,19,18};
		Number[] notas2 = notas;
		notas2[0] = Integer.valueOf(2);	
				
		//String[] nombres2 = {"Juan", "Carlos"};
		/*Object[] objetos2 = new String[]{"Juan","Carlos"};
		objetos2[0]= new Object();		
		System.out.println("OK");
		*/
		
		
	}
}