package packageb;

import packagea.Fruta;
//import packagec.ManzanaVerde;

public class Zanahoria{
	
	public static void main(String args[]){
		Fruta f = new Fruta();
		System.out.println(f.name); //public
		System.out.println(f.id); //protected
		System.out.println(f.color); //default
		System.out.println(f.hash); //private
	}
	
}