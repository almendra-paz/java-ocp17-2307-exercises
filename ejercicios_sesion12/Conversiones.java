import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Conversiones{

	public static void main(String args[]){
		//De List a Array
		System.out.println("---- De List a Array ---");
		List<String> list = new ArrayList<>();
		list.add("Juan"); 
		list.add("Maria"); 
		list.add("Pedro");
		Object[] objectArray = list.toArray();
		String[] stringArray = list.toArray(new String[0]);
		list.clear();
		System.out.println("lista: "+list);
		System.out.println(Arrays.toString(stringArray));
		stringArray[0] = "Juana";		
		System.out.println(Arrays.toString(stringArray));
				
		
		// arrays as List (Es una Forma de Visualizar el array)
		System.out.println("--- arrays as List");
		String[] stringArray2 = {"three","four"};
		List<String> list1 = Arrays.asList(stringArray2);
		System.out.println("lista1: "+list1);
		
		// intento remove
		//list1.remove(0);
		//list1.add("five");
		// intento cambio valor
		list1.set(0,"five");
		System.out.println("lista1: "+list1);				
		System.out.println(Arrays.toString(stringArray2));
		//list1.remove("five");
		//list1.add("six");

		//List.of
		System.out.println("--- List.of");
		List<String> list2 = List.of("one","two");
		//list2.remove(0);
		//list2.add("three");
		//list2.set(1,"three");
		
		System.out.println(list2);
		
		
	}

}