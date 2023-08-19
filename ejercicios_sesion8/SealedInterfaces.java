public class SealedInterfaces{
	
	public static void main(String args[]){
		System.out.println("ok");
	}

}

//permits ChildClass, SonInterface 
public sealed interface SealedInterface 
{

}

final class ChildClass implements SealedInterface {

}

// sealed, non-sealed
sealed interface SonInterface extends SealedInterface 
permits Son2Interface{
	
}

final class Son2Interface implements SonInterface{

}