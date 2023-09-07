public class GenericStatic<T>{
	private T contenido;
	
	//public <U> void sink1(U t){
	public <T> void sink1(T t){
		System.out.println(t);
	}
	
	public static <T> void sink(T t){
		System.out.println(t);
	}
	public static <T> T identity(T t){
		return t;
	}

	public static void main(String args[]){
		GenericStatic<Elefante> gen = new GenericStatic<>();
		Elefante e1 = gen.contenido;
		Elefante e2 = new Elefante();
		gen.sink1(Integer.valueOf(123));
		gen.<Integer>sink1(Integer.valueOf(123));

		GenericStatic.sink("nombre");
		GenericStatic.<String>sink("nombre");
	}
}

class Elefante{}