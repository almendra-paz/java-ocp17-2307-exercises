public class SealedClass2{
	
	public static void main(String args[]){
		System.out.println("ok");
	}

}


// se omite permits. Se infiere según las clases q lo extiendan
/*
public sealed class SealedParentClass { }

final class ChildClass extends SealedParentClass { }

final class SonClass { }
*/


//permits SealedParentClass.ChildClass, SealedParentClass.SonClass
public sealed class SealedParentClass 

 {
 	private String className;

	final class ChildClass extends SealedParentClass {

	}

	final class SonClass extends SealedParentClass {
		
	}

}

