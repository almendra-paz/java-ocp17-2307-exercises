public class ExtendsInterface implements Interface1, Interface2{
	public void read(){}

	public static void main(String args[]){
		//System.out.println(ExtendsInterface.COUNT);
		//System.out.println(Interface1.COUNT); 
		//System.out.println(Interface2.COUNT); 
		ExtendsInterface e = new ExtendsInterface();
		e.defaultMethod();
	}
}

interface Interface1{
	int COUNT = 13;		//public, static, final
	void read();	//abstracto
	static void calcular(){
		System.out.println("calcular");
	}
	default void defaultMethod(){
		System.out.println("Interface 1");
	}
}

interface Interface2{
	long COUNT = 12;
	static void calcular(){
		System.out.println("calcular");
	}
	static void defaultMethod(){
		System.out.println("Interface 2");
	}
}
