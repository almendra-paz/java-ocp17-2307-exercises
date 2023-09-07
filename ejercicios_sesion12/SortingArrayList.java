import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrayList{

	public static void main(String args[]){
		List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		Collections.sort(numbers);
		System.out.println(numbers);

		int[] arreglo = {99,5,81};
		Arrays.sort(arreglo);
		System.out.println(Arrays.toString(arreglo));

	}

}