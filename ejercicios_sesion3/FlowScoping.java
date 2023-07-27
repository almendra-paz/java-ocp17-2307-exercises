public class FlowScoping{
	
	public static void main(String arg[]){
		Object saludo = "hello";
		
		if(saludo instanceof String str){
			System.out.println(str.length());
		}
		//System.out.println(str.length());
		
		
		if(!(saludo instanceof String str )){
			//si no es una instancia de String
			
		}else{			
			// si es una instancia de String
			System.out.println(str.length());
		}	
		
		
		if(! (saludo instanceof String str2 ))return;
		
		System.out.println(str2.length());
		
		
	}
	
}