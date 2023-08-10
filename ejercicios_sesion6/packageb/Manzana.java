package packageb;

import packagea.Fruta;
import packagec.ManzanaVerde;

public class Manzana extends Fruta{
	
	
	public static void main(String args[]){
		
		Fruta f = new Fruta();
		System.out.println(f.name); //public
		//System.out.println(f.id); //protected
		//System.out.println(f.color);
		//System.out.println(f.color); //default
		//System.out.println(f.hash); //private
		
		Manzana manzana = new Manzana();
		System.out.println(manzana.id);		
		System.out.println(manzana.color);
		
				
		ManzanaVerde manzanaVerde = new ManzanaVerde();
		manzanaVerde.id = 113;	//sí compilaría porque se trata del id heredad de Fruta, y Manza es hija de Fruta
		manzanaVerde.name = "verde";	
						
	}
}