import java.util.ArrayList;

public class MetodosArrayList{

	public static void main (String[] args){
		
		//ADD
		System.out.println("--- add method --");
		ArrayList list = new ArrayList(); //arraylist de objetos
		boolean flag = list.add("hello");
		System.out.println("insercion: "+flag);
		list.add(Boolean.TRUE);
		
		
		//de Strings
		ArrayList<String> safer = new ArrayList<>();
		safer.add("string");
		//safer.add(Boolean.TRUE);

		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Juan"); 	//[Juan]
		nombres.add("Roberto");	//[Juan, Roberto]
		nombres.add(1, "Maria"); //[Juan, Maria, Roberto]
		nombres.add(3, "Pedro"); //[Juan, Maria, Roberto, Pedro]

		nombres.add(2, "Ignacio");
		//[Juan, Maria, Ignacio, Roberto, Pedro]
		
		//nombres.add(6, "Ana"); //IndexOutOfBoundsException
		System.out.println(nombres);
		
		System.out.println("--- remove method --");
		System.out.println(nombres.remove("Maria")); 
		//[Juan, Ignacio, Roberto, Pedro]
		System.out.println(nombres.remove(0));	
		//[Ignacio, Roberto, Pedro]
		
		//ArrayList<Integer> [0,1,2]
		
		System.out.println(nombres);
		
		//SET
		System.out.println("--- set method --");
		System.out.println(nombres.set(2,"Maria")); //Pedro
		//[Ignacio, Roberto, Maria]		
		System.out.println(nombres);

		


	}
}
