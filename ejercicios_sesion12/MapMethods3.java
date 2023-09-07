import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class MapMethods3{

	public static void main(String args[]){
		Map<String,String> map1= new HashMap<>();
		map1.put("cod1","Juan");
		map1.put("cod2","Carlos");
		map1.put("cod3","Karla");

		//--- Foreach and EntrySet
		System.out.println("--- forEach ----");
		map1.forEach((k,v)-> System.out.println(v+ " "+k));
		
		System.out.println("--- values() ----");
		map1.values().forEach(v->System.out.println(v));
		
		System.out.println("--- entrySet()");
		//Map.entry("key1","val1")
		map1.entrySet().forEach(e-> 
		System.out.println(e.getKey() + e.getValue()));

		System.out.println("--- get y getOrDefault()");
		System.out.println(map1.get("cod1")); //Juan
		System.out.println(map1.get("cod4")); //null
		System.out.println(map1.getOrDefault("cod4","No encontrado"));
		System.out.println(map1.getOrDefault("cod3","No encontrado"));
		
		System.out.println("--- replace() and replaceAll()");
		String original = map1.replace("cod1", "Maria");
		System.out.println("original: "+original);
		System.out.println("dps del reemplazo: "+map1);

		map1.replaceAll((k,v)-> k+v);
		System.out.println(map1);	

		System.out.println("--- putIfAbsent");
		System.out.println(map1.putIfAbsent("cod1","Maria"));
		System.out.println(map1.put("cod2","Sofia"));
		System.out.println(map1.putIfAbsent("cod4","Maria"));
		System.out.println(map1);
	}
}

