import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

public class ConcurrentModification2{

	public static void main(String args[]){
		Set<String> pets = new ConcurrentSkipListSet<>();
		pets.add("rabbit");
		pets.add("dog");
		System.out.println(pets.stream()
			.collect(Collectors.joining(",")));

		List<Integer> favNumbers = 
		new CopyOnWriteArrayList<>(List.of(4,3,42));
		
		for(var n: favNumbers){	//4,3,42 
			System.out.print(n + " ");
			favNumbers.add(9);
		}
		System.out.println();
		System.out.println("Size: "+ favNumbers.size());
		System.out.println(favNumbers);
	}

}