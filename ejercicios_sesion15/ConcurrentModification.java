import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModification{

	public static void main(String args[]){
		//var foodData = new HashMap<String, Integer>();
		var foodData = new ConcurrentHashMap<String, Integer>();
		foodData.put("food1", 1);
		foodData.put("food2", 2);
		foodData.put("food3", 3);
		for(String key: foodData.keySet())
			foodData.remove(key);

		System.out.println(foodData);

	}

}