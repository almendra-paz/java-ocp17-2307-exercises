public class Upcasting{
	public static void main(String args[]){
		Apple a = new Apple();
		System.out.println(a.COUNT);	//10
		System.out.println(((Fruit)a).COUNT);	//5

		//System.out.println(((Frutero)a).COUNT);	
	}
}

class Fruit{
	static int COUNT = 5;
}

class Apple extends Fruit{
	static int COUNT = 10;
}

class Frutero{
	static int COUNT = 5;	
}