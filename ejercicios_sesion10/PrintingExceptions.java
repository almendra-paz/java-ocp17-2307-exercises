class PrintingExceptions{

public static void main(String args[]) throws Exception{
	try{
		lanzandoException();
	}catch(Exception e){
		//throw e;
		//System.out.println(e);
		//System.out.println(e.getMessage());
		e.printStackTrace();
	}
}

public static void lanzandoException(){
	throw new RuntimeException("mensaje de la exception");
}

}