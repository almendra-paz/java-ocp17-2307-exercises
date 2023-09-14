import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.Optional;
import java.util.OptionalDouble;


public class PrimitiveStreamMethods{

	public static void main(String args[]){
		DoubleStream empty = DoubleStream.empty();

		DoubleStream oneValue = DoubleStream.of(3.14);
		oneValue.forEach(System.out::println);		

		DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
		varargs.forEach(System.out::println);

		System.out.println("---- range ----");
		IntStream range = IntStream.range(1,6);
		range.forEach(System.out::println); //1 2 3 4 5 

		System.out.println("---- range closed----");
		IntStream range1 = IntStream.rangeClosed(1,6); //1 2 3 4 5 6
		range1.forEach(System.out::println);

	}
}