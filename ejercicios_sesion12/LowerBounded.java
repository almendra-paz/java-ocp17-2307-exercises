import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LowerBounded{

	//public static void addHello( List<? extends Object> list){
	public static void addHello( List<? super String> list){
		list.add("hello");
		// no compilaria list.add(new Object());
		System.out.println(list);
	}


	public static void main(String[] args){
		List<String> strings = new ArrayList<String>();
		strings.add("tweet");
		addHello(strings);

		List<Object> objects = 
			new ArrayList<Object>(strings);
		addHello(objects);
						
			
		List<? super IOException> exceptions= new ArrayList<Exception>();	
			
		List<FileNotFoundException> exceptions2= new ArrayList<>();	
		List<Exception> exceptions3= new ArrayList<>();
		
		add(exceptions3);				
				
		//exceptions.add(new Exception());
		//exceptions.add(new IOException());
		//exceptions.add(new FileNotFoundException());
		
		//System.out.println(list);
		//System.out.println(list2);
	}

	//rechazar: List<FileNotFoundException>
	//List<IOException>, List<Exception>, List<Object>
	public static void add(List<? super IOException> excepciones){
		excepciones.add(new FileNotFoundException());
		excepciones.add(new IOException());
		//excepciones.add(new Exception());	
	}

	/* Sobrecarga no válida, la firma es la misma
	public static void add(List<? extends FileNotFoundException> excepciones){
		//
	}
	*/
	public <T> T third(List<T> list){
		//return new T(); // tipo genérico no se puede instanciar
		return null;
	}
	
	public <T extends A> B third2(List<T> list){
		return new B();
	}


}

class B extends A{}
class A{}



