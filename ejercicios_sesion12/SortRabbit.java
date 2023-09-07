import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortRabbits{
	public static void main(String args[]){
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit());
		Collections.sort(rabbits);
	}
}

class Rabbit{
	int id;
	public int compareTo(Object r){
		return 0;
	}

}