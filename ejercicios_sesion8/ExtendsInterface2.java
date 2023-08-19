public interface ExtendsInterface2 extends Interface1, Interface2{
	default void defaultMethod(){
		System.out.println("Interface 1");
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
	void defaultMethod();
}
