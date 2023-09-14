import java.util.stream.Stream;
import java.util.Optional;
import java.util.List;
import java.util.function.Predicate;

public class TerminalOperations2{

	public static void main(String args[]){
		Stream<String> infinite = 
			Stream.generate(()->"hello");
		List<String> list = 
			List.of("monkey", "gorilla", "bonobo");

		Predicate<String> pred = x -> x.length()>6;

		//-----anyMatch, allMatch, noneMatch
		System.out.println(list.stream().anyMatch(pred)); //true
		System.out.println(list.stream().allMatch(pred)); //false
		System.out.println(list.stream().noneMatch(pred));//false

		//-----forEach
		list.stream().forEach(System.out::println);	

	}
}