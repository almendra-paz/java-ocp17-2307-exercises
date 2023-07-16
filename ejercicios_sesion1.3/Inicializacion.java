/**************************************************
Variables locales:
-----------------
 - No se pueden usar sin inicializar
 - Compilador hace un anális de rutas
 - Se pueden evaluar constantes mas no expresiones
***************************************************/
public class Inicializacion{

	public static void main(String args[]){	
		int localVariable;
		String localString;
		
		
		final boolean flag = true;
		
		if(flag){
			localVariable = 20;
			localString = "Hello";	
		}else{
			//localVariable = 20;
			//localString = "Hello";
		}

		System.out.println("localVariable:" + localVariable);
		System.out.println("localString:" + localString);
		
		
		
		/*
		final boolean flag = true;
		
		if(flag){
			localVariable = 20;
			localString = "Hello";
		}
		
		if(!flag){
			localVariable = 10;
			localString = "world";
		}
		*/
				
			}

}