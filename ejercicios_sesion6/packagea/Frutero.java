package packagea;

import packageb.Manzana;
import packagec.ManzanaVerde;

public class Frutero{
	
	public static void main(String args[]){
		
		Fruta f = new Fruta();
		System.out.println(f.name); //public
		System.out.println(f.id); //protected
		System.out.println(f.color); //default
		//System.out.println(f.hash); //private
		
		Manzana manzana = new Manzana();
		System.out.println(manzana.id);
		
		ManzanaVerde manzanaVerde = new ManzanaVerde();
		System.out.println(manzanaVerde.id);
		//System.out.println(manzanaVerde.name);
	}
	
}