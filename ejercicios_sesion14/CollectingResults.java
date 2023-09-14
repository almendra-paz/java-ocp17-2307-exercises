import java.util.stream.Stream;
import java.util.Optional;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectingResults{

	public static void main(String args[]){
		System.out.println("---- joining ----");
		
		var pets0 = Stream.of("loro", "gato", "perro");
		String result0 = pets0.collect(Collectors.joining(", "));
		System.out.println(result0);
		
		var pets = Stream.of("loro", "gato", "perro");
		String result = pets.collect(Collectors.joining(", ","<",">"));
		System.out.println(result);

		System.out.println("---- averagingInt ----");
		var pets2 = Stream.of("loro", "gato", "perro");
		Double result2= pets2.collect(Collectors.averagingInt(String::length));
		System.out.println(result2);
		
		System.out.println("---- counting ----");
		var pets4 = Stream.of("loro", "gato", "perro");
		long result4= pets4.collect(Collectors.counting());
		System.out.println(result4);

		System.out.println("---- toCollection ----");
		var pets3 = Stream.of("loro", "gato", "perro");
		TreeSet<String> result3= 
			pets3
				.filter(s->s.startsWith("p"))
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(result3);

		
	}

}