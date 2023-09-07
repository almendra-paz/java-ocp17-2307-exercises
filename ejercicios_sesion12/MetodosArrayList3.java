import java.util.ArrayList;

public class MetodosArrayList2{

	public static void main (String[] args){
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		System.out.println(list1.equals(list2));//true	

		list1.add("Juan");	
		list1.add("Maria");
		list1.add("Pedro");
		System.out.println(list1.equals(list2)); //false	

		list2.add("Juan");			
		list2.add("Maria");	
		list2.add("Pedro");			
		System.out.println(list1.equals(list2));	//true
	}
}
