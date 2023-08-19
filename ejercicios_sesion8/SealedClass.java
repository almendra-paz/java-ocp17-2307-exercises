public class SealedClass{
	
	public static void main(String args[]){
		System.out.println("ok");
	}

}

public sealed class SealedParentClass permits ChildClass, 
SonClass, SonClass2 {

}

// final: no podrá tener clases hijas
final class ChildClass extends SealedParentClass{

}

//class FinalSonClass extends ChildClass{}

// non-sealed: se comporta como una clase normal. 
// Cualquier clase puede extender de ella 
non-sealed class SonClass extends SealedParentClass {
	
}

class DaughterClass extends SonClass{}

// sealed
sealed class SonClass2 extends SealedParentClass 
permits SonClass3{

}

final class SonClass3 extends SonClass2{}