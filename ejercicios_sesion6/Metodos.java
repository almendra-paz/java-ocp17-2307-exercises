public class Metodos{

	public static void main(String args[]){
		Metodos m = new Metodos();
		float f = m.restar(6,3);
		System.out.println(f);
		int millones = 2147483647 + 2147483647;
		long millones2 = 2147483647L + 2147483647L;
		System.out.println("millones: "+millones);
		System.out.println("millones: "+millones2);
	}

	public String imprimirTextos(String texto, 
	int cantidad){
		String result = texto + " impreso "+cantidad+ " veces";
		return result;
}

	public int sumar(int a, int b){
		short s = 10;
		return s;
	}
	public float restar(int a, int b){
		return a - b;
	}
	/*
	public int producto(float f, float a){
		return f*a;
	}
	*/
	
	public int sumar1(int a, int b){
		short s = 10;
		return new Short(s);
	}
	public int sumar2(int a, int b){
		return new Integer(a+b);
	}
	/*
	public float restar2(int a, int b){
		return new Double(2.5);
	}*/



}
