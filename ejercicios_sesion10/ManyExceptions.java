public class ManyExceptions{

	public static void main(String arg[]) throws Exception{

	try{
		try{
			throw new RuntimeException();
		}catch(RuntimeException e){
			throw new RuntimeException();
		}finally{
			//throw new Exception();
		}
	}catch(RuntimeException e){
		System.out.println("runtime exception");
	}
	catch(Exception e){
		System.out.println("ok");
	}

	/*
	try{
		throw new RuntimeException();
	}catch(RuntimeException e){
		throw new RuntimeException();
	}finally{
		System.out.println("end");
		throw new Exception();
	}
	*/


	}

}

