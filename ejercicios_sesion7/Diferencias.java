public class Diferencias{
	
	public static void main(String args[]){
		Person p = new Empleado();
		p.getTotalPersonal(); 	//
	}

}

class Empleado extends Person{
	public void getTotalPersonal(){
		System.out.println("10");
	}
	public void getTotalPersonal(int cantidad){
		System.out.println("Sobrecarga: "+cantidad);
	}
}

class Person {
	public void getTotalPersonal(){
		System.out.println("8");
	}
}
