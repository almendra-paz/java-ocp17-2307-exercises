public class Labels{
	
	public static void main(String args[]){		
		main: {
			label: {
				System.out.println("impresion valida");				
			}
				
			single:
				System.out.println("single statement");

			single2:{
				int m = 0;
				System.out.println("single statement 2");
			}

			final int a = 1;
			final int b = 1;
			
			hello: 
				if(a == b){
					System.out.println("true");
					break main;
				} 
				else {
					System.out.println("false");					
					//break main;
				}							
			
			int i = 0;
			come_here: while(i>0){
				System.out.println("hello");
			}

			some_label: {
				System.out.println("hello1");
				System.out.println("hello2");	
			}
		}
				
		System.out.println("fuera del main");
	}
		
}