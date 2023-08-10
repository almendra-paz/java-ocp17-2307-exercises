public class Sobrecarga{
	/*
	public void procesarData(Long value){
		System.out.println("opción 1");
	}
	*/	
	
	public void procesarData(Long... value){
		System.out.println("opción 2");
	}
	public void procesarData(Double value){
		System.out.println("opción 3");
	}
	
	public static void main(String args[]){
		Sobrecarga s = new Sobrecarga();
		//s.procesarData(10);
		Long vlong = 100L;
		s.procesarData(vlong);
	}
}
