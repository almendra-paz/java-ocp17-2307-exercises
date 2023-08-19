class Implementacion extends Herencia implements Movable, Readable{

	public void read(){
		System.out.println("Implementando read");
	}
	
	public static void main(String args[]){
		Implementacion o = new Implementacion();
		//Movable m = new Implementacion(); 		
		Movable.move(); //Movable.move()

		//Herencia	
		System.out.println(o.nombre); //variable estatica
		o.saludo();	// metodo default
		o.read(); //abstracto
		//o.move(); // metodo estático NO HERADABLE
	}
}

interface Movable{
	String nombre = "Movable"; //public static final
	static void move(){System.out.println("move static");}
}

interface Readable{
	void read();
	default void saludo(){System.out.println("hi");}
}

class Herencia{}

