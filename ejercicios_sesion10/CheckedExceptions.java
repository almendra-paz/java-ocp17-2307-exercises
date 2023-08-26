import java.io.IOException;

public class CheckedExceptions{
	public static void main(String args[]){		
	}
	void fall(int distance) throws IOException{
		if(distance >10) {
			throw new IOException();
		}
	}
}