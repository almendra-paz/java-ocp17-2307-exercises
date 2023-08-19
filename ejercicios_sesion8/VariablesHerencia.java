public class VariablesHerencia implements Interface1, Interface2{
	public static void main(String args[]){
		//System.out.println(COUNT);
		System.out.println(Interface1.COUNT);
		System.out.println(Interface2.COUNT);
	}
}

interface Interface1{
	int COUNT = 13; //public STATIC FINAL
}

interface Interface2{
	long COUNT = 12; //public STATIC FINAL
}
