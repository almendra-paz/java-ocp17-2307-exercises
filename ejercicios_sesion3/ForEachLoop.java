import java.util.ArrayList;

public class ForEachLoop{

	public static void main(String[] args){
		System.out.println("--- For each");
		String[] values = {"a", "b", "c"};
		
		for(String e: values)
			System.out.println(e);
		
		
		System.out.println("--- Loop with break");
		for(String e: values) {
			if(e.equals("b")){				
				System.out.println(e);
				break;	// termina loop
			}
			//break;			
			System.out.println(e);
			//break;
		}

		System.out.println("--- Loop with continue");
		for(String e: values) {
			if(e.equals("a")){
				continue;
			}
			//continue;
			System.out.println(e);			
		}

	}
}