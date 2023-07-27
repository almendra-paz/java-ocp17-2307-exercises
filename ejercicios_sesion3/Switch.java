public class Switch{

	public static void main(String args[]){
		int d = 3;
		
		switch(d){
			case 1,2: System.out.println("es menor a 2");break;
			case 3: System.out.println("es 3");break;
		}
		
		
		int a = 30;
		//definiciones correctas
		System.out.println(10|20);
		switch(a){}
		switch(a){			
			case 10|20: {System.out.println("OK");}
			case 100: System.out.println("OK2");
		}
		switch(a){
			case 10: System.out.println("correcto");
		}

		int suma = 0;
		switch(1){
			case 1: suma++; 
			case 2: suma++;
			case 3: suma++; break;
			default: suma++; 
		}
		System.out.println("suma: "+suma);

	}
}



