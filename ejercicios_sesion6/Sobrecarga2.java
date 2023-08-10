public class Sobrecarga2{
	public void procesarData(int... value){
		System.out.println("opcion 1");
	}
	public void procesarData(Integer value){
		System.out.println("opcion 2");
	}
	public static void main(String[] args){
		Sobrecarga2 s = new Sobrecarga2();
		s.procesarData((byte) 10);
	}
}
