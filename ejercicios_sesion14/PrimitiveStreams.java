import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;


public class PrimitiveStream{

	public static void main(String args[]){
		System.out.println("---- mapeando a un IntStream ----");
		Stream<Integer> stream = Stream.of(1,2,3);
		System.out.println(stream.mapToInt(x->x).sum()); //6

		System.out.println("---- creando un IntStream ----");
		IntStream intStream = IntStream.of(1,2,3);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble());//2
		
		intStream = IntStream.of(1,2,3);
		OptionalInt min = intStream.min();
		System.out.println(min.getAsInt());		
		
		intStream = IntStream.of(1,2,3);
		OptionalInt max = intStream.max();		
		System.out.println(max.getAsInt());
		
		intStream = IntStream.of(1,2,3);
		int sum = intStream.sum();		
		System.out.println(sum);
	}
}