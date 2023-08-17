public class Hidding{
	public static void main(String args[]){
		Empleado p = new Empleado();
		System.out.println(p.COUNT); 	//10
		System.out.println(p.years); 	//30
		System.out.println(p.getCount()); //10

		System.out.println(((Person) p).COUNT); 
		System.out.println(((Person) p).years);
		System.out.println(((Person) p).getCount()); 
	}
}
class Empleado extends Person{
	public static int COUNT = 10;
	public int years = 30;	
	public static int getCount(){
		return COUNT;
	}
}
class Person {
	public static int COUNT = 5;
	public int years = 20;	
	public static int getCount(){
		return COUNT;
	}
}
