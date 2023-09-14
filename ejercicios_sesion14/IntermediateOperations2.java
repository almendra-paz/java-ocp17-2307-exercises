import java.util.stream.Stream;
import java.util.List;
import java.util.Comparator;

public class IntermediateOperations2{


	public static void main(String args[]){
		System.out.println("---- map ----");	
		Stream<String> pets = Stream.of("gato", "perro", "gallina", "gato", "loro");	
		pets.map(String::length)
			.forEach(System.out::println); //4,5,7,4,4

		System.out.println("---- FlatMap ----");
		List<String> zero = List.of();
		var one = List.of("Juan");
		var two = List.of("Maria", "Ana");
		
		Stream<List<String>> nombres = Stream.of(zero, one, two);
		nombres.flatMap(m->m.stream())
			.forEach(System.out::println);

		System.out.println("---- Sorted ----");
		List<String> colores = List.of("morado","lila","amarillo");
		colores
			.stream()
			.sorted()
			.forEach(System.out::println);

		System.out.println("---- Sorted with Comparator ----");	
		colores.stream().sorted(Comparator.reverseOrder()).
			forEach(System.out::println);
			
		Stream<Integer> infinite = Stream.iterate(1,n->n+1);
		//infinite.sorted().forEach(System.out::println);

		System.out.println("---- Peek ----");	
		long count = colores.stream()
				.filter(s-> s.startsWith("m"))
				.peek(System.out::println).count();
		System.out.println(count);
				
		colores.stream()
				.filter(s-> !s.startsWith("m"))
				.sorted()
				.limit(1)
				.forEach(System.out::println);
	}

}