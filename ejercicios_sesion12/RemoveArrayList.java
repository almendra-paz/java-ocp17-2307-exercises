import java.util.ArrayList;

public class RemoveArrayList{

	public static void main (String[] args){		

		ArrayList<String> safer = new ArrayList<>();
		ArrayList<Integer> enteros = new ArrayList<>();
		enteros.add(Integer.valueOf(2));
		enteros.add(Integer.valueOf(0));
		enteros.add(Integer.valueOf(4));
		
		System.out.println(enteros);

		System.out.println("--- remove method --");
		System.out.println(enteros.remove(0));	//2
		System.out.println(enteros); //[0 4]

		System.out.println(enteros.remove(Integer.valueOf(0)));//
		System.out.println(enteros); //[4]



	}
}
