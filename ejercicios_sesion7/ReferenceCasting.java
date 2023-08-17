public class ReferenceCasting{

	public static void main(String[] args){
		Fruit f = new StartFruit();
		//Fruit f = new Fruit();
		Apple a = new Apple();
		Mango m = new Mango();

		//m = (Mango) a; //incompatible types
		//f = new Mango();
		
		//f es del tipo Fruit
		//m es del tipo Mango
		//se dice que todo tipo de Mango es del tipo Fruit
		// no se puede decir que todo tipo de Fruit es del tipo Mango
		m = (Mango) f;

		Poison p = (Poison) f;

		Frutero f2 = new Frutero();
		Poison p2 = (Poison) f2;


		System.out.println("casting ok");
	}

}

interface Poison{}
interface Poison3{}


final class Frutero{}
class Fruit{}
class Mango extends Fruit{}
class Apple extends Fruit{}
class StartFruit extends Fruit implements Poison{}

