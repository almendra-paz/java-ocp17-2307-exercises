import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatch{

public static void main(String[] args){
	try{
		throw new FileNotFoundException();
	}catch(NumberFormatException | FileNotFoundException e){
		System.out.println("Generic error");
	}catch(IOException e){
		System.out.println("Generic error");
	}
}


}