/* 
	1. clase sin modificador público: compila y 
	se ejecuta correctamente (independiente del nombre del archivo)
	2. clase con mofificador público: 
		2.1 si no hace match con el nombre del archivo: no compilará
		2.2 si hace match con el nombre del archivo: 
		compila y se ejecuta correctamente
*/
public class PublicClass{
	public static void main(String args[]){
		System.out.println("Hello world 1");
	}
}

public class PublicClass2{
	public static void main(String args[]){
		System.out.println("Hello world 2");
	}
}
