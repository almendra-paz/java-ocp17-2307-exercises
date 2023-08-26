import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.FileSystems;
import java.io.IOException;

public class EffectivelyFinal{

	public static void main(String args[]) throws Exception{
		Path path = FileSystems.getDefault().getPath("", "CustomExceptions.java");
		var writer = Files.newBufferedWriter(path);

		final var bookReader = new MyFileReader("4");
		MyFileReader movieReader = new MyFileReader("5");
		
		try(writer; bookReader; 
			var tvReader = new MyFileReader("6");
			movieReader)
		{
			System.out.println("Try Block");
		}catch(IOException e){}
		finally{
			System.out.println("Finally Block");
			bookReader.saludo();
		}
		writer.append("fail");
		movieReader.saludo();
		//movieReader = null; //deja de ser effective final
	}
}

class MyFileReader implements AutoCloseable{
	private String tag;
	
	public MyFileReader(String tag){this.tag = tag;}

	@Override public void close(){
		System.out.println("Closed: "+tag);
	}
	
	public void saludo(){
		System.out.println("Hello");
	}
}