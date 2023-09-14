import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.TreeSet;
import java.util.Set;
import java.util.function.Predicate;

public class CollectMethod{

	public static void main(String args[]){
		Stream<String> stream = Stream.of("a","b","c","d");

		StringBuilder word = stream.collect(
				StringBuilder::new,	//()-> new StringBuilder()
				StringBuilder::append, 
				(a,b)->a=null	//no se ejecuta x falta de parallel
			);
		System.out.println(word);

		stream = Stream.of("a","b","c","d","e","f","g","h","i","j");
		ArrayList<String> set = stream.parallel().collect(
				ArrayList::new, //()-> new TreeSet()
				ArrayList::add, //(Set a,String b)-> a.add(b)
				(a,b)-> a.addAll(b) //(Set a,Set b)-> a.addAll(b);
			);
		System.out.println(set);

		stream = Stream.of("a","b","c","d");
		TreeSet<String> set2 = stream.collect(
		Collectors.toCollection(TreeSet::new));
		System.out.println(set2);

		stream = Stream.of("a","b","c","d");
		Set<String> set3 = stream.collect(
		Collectors.toSet());
		System.out.println(set3);
		
		stream = Stream.of("a","b","c","d");
		String str4 = stream.collect(Collectors.joining(", "));
		System.out.println(str4);
		
		
	}
}