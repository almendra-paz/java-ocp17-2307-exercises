import java.util.stream.Stream;
import java.util.List;

public class FiniteStream{

	public static void main(String args[]){
		System.out.println("---- Finite Stream ----");
		Stream<String> empty = Stream.empty();	//empty
		
		// de 	1 valor
		Stream<Integer> singleElement = Stream.of(1); 
		//de un array		
		Stream<Integer> fromArray = Stream.of(1, 2, 3); 
		fromArray.forEach(System.out::println);
		
		// a partir de una colección
		var list = List.of("a", "b", "c");
		Stream<String> fromList = list.stream();

		fromList.forEach(System.out::println);
		
		System.out.println("---- Parallel Stream ----");
		Stream<String> fromListParallel = list.parallelStream();
		fromListParallel.forEach(System.out::println);

		System.out.println("---- Infinite Stream ----");
		Stream<Integer> oddNumbersUnder200 = 
		Stream.iterate(1, n->n>0, n -> n+2);
		//oddNumbersUnder200.forEach(System.out::println);

	}
	
}
