import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class EjemploPipeline{

	public static void main(String args[]){
		
		Stream.generate(()->"Elsa")		//infinito
		.filter(n->n.length()==4)
		.peek(a->System.out.println(a))
		.limit(2)
		.sorted()		
		.forEach(System.out::println);
		
		Stream.generate(()->"Juan Carlos")		//infinito
		.filter(n->n.length()>=4)		
		.limit(2)
		.sorted()		
		.forEach(System.out::println);


		var list = List.of(5,2,7,12,17,8);

		list.stream()
			.filter(n->n%2==0)
			.sorted(Comparator.reverseOrder())
			.limit(2)
			.forEach(System.out::println);

	var infinite = Stream.iterate(1, x->x+1);	//123456789

		System.out.println("-- peek en pipeline --");
		infinite
		.filter(x-> x%2 ==1)	
		.peek(System.out::print)		//1 3 5 7 9
		.limit(5)		
		.forEach(System.out::print);	//1 3 5 7 9
		
		
		System.out.println("--------");
		var pets = new ArrayList<String>();
		pets.add("conejo");
		pets.add("loro");
		var stream = pets.stream();
		pets.add("perro");

		System.out.println(stream.count());


	}
}
