import java.util.stream.Stream;
import java.util.Optional;

public class TerminalOperations{

	public static void main(String args[]){
		
		System.out.println("---- count ----");
		Stream<String> s = 
			Stream.of("monkey", "gorilla", "bonobo");
		long conteo = s.count();
		System.out.println(conteo);	//3

		System.out.println("---- min max----");
		s = Stream.of("gato", "leon", "mono");
		Optional<String> min = s.min((s1,s2)-> s2.compareTo(s1));
		min.ifPresent(System.out::println); 
		
		s = Stream.of("gato", "leon", "mono");
		Optional<String> max = s.max((s1,s2)-> s2.compareTo(s1));
		max.ifPresent(System.out::println); 

		System.out.println("-----findAny, findFirst");
		s = Stream.of("monkey", "gorilla", "bonobo");
		s.findFirst().
			ifPresent(System.out::println); 
		
		Stream.of("monkey", "gorilla", "bonobo").findAny().
			ifPresent(System.out::println); 

		Stream<String> infinite = Stream.generate(()->"hello");
		infinite.findAny().ifPresent(System.out::println);//
	}
}