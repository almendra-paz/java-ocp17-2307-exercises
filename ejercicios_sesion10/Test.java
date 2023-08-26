public class Test{
	public static void main(String args[]){
		try{	
			boolean flag = true;
			if(flag){
				throw new RuntimeException();
			}		
			System.out.println("end of method");
		}catch(RuntimeException e){
			System.out.println("controlando la excepcion");
		}
	}
}