import java.io.IOException;

public class Finally{

	public static void main(String args[]){
		System.out.println(getValue());	// <---	
	}

	public static int getValue(){
		System.out.println("started");
		try{
			System.out.println("1");				
			//System.exit(0);	//termina el programa
			//throw new RuntimeException();
			return -1;					
		}catch(Exception e){
			System.out.println("2");
			return -2;			
		}finally{
			System.out.println("3");
			return -3;
		}
		//return 0;
		//System.out.println("finished");
	}

}