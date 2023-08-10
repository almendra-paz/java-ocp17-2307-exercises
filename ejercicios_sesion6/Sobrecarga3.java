public class Sobrecarga3{
	public void procesarData(int... value){
		System.out.println("opcion 1");
	}	
	
	public void procesarData(Integer value){
		System.out.println("opcion 2");
	}
	
	public void procesarData(char value){
		System.out.println("opcion 3");
	}	
	
	public void procesarData(Byte value){
		System.out.println("opcion 4");
	}
	
	/*
	public void procesarData(float value){
		System.out.println("opcion 5");
	}*/
	/*
	public void procesarData(Float value){
		System.out.println("opcion 6");
	}*/
	
	public void procesarData(Double value){
		System.out.println("opcion 7");
	}
	/*
	public void procesarData(double value){
		System.out.println("opcion 8");
	}*/
	/*
	public void procesarData(Number value){
		System.out.println("opcion 9");
	}*/
	
	public void procesarData(float... value){
		System.out.println("opcion 10");
	}
	/*
	public void procesarData(Float... value){
		System.out.println("opcion 11");
	}*/
	
	public static void main(String[] args){
		Sobrecarga3 s = new Sobrecarga3();
		//s.procesarData((byte) 10);
		
		/*Wrappers 
		- coincidencia exacta, 
		- clase padre, 
		- primitivo exacto, 
		- ensanchamiento primitivo
		- vararg primitivo o wrapper)*/
		s.procesarData(Float.valueOf(10.0f));
		
		//final byte b = 10;
		//s.procesarData(b);
		
	}
}
