public class Constructor{
	String nombre;
	int edad;
	public Constructor(){
		this("Default name");
	}
	public Constructor(String nombre){
		this(100);
		this.nombre = nombre;
	}
	public Constructor(int edad){
		this.edad = edad;
	}
	public static void main(String args[]){
		Constructor cons = new Constructor();
		System.out.println(cons.nombre);
		System.out.println(cons.edad);
	}
}
