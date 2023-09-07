import java.util.Collections;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.TreeSet;

public class SetMethods{

	public static void main(String args[]){
		
		//addAll
		Set<Integer> numbers1 = new HashSet<>();
		numbers1.add(0);
		numbers1.add(2);
		System.out.println(numbers1.add(2));
		List<Integer> numbers2 = Arrays.asList(0,2,3,4);
		System.out.println(numbers1.addAll(numbers2));
		System.out.println(numbers1);
		
		Set<Character> letter = Set.of('a','b');
		System.out.println(letter);
		//letter.remove('c');
		//letter.add('c');	//no se permite añadir elementos
		Set<Character> copy = Set.copyOf(letter);
		System.out.println(copy);
		//copy.add('c');
		//copy.remove('c');

		System.out.println("---- HashSet ----");
		Set<String> names = new HashSet<>();
		names.add("Maria");
		names.add("Juan");
		names.add("Pedro");
		names.add("Maria");	//false		
		names.forEach(x-> System.out.println(x));

		System.out.println("---- TreeSet ----");
		Set<String> namesTree = new TreeSet<>();
		namesTree.add("Maria");
		namesTree.add("Juan");
		namesTree.add("Pedro");
		namesTree.add("Maria"); //false
		System.out.println(namesTree);		
		namesTree.forEach(x-> System.out.println(x));
	}
}

