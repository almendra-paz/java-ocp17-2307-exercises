import java.util.Collection;
import java.util.HashSet;

public class MetodosHashSet{
	public static void main(String args[]){

		Collection<String> set= new HashSet<>();
		set.add("one");
		set.add("two");
		
		set.remove("one");
		System.out.println(set);
	}

}