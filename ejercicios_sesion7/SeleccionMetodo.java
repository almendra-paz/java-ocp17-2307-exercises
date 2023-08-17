import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class SeleccionMetodo{
	public static void main(String args[]){
		Collection c = new ArrayList();
		Fruit f = new Fruit();
		Fruit fa = new Apple();
		Apple a = new Apple();

		f.mash(c);	//1
		fa.mash(c);	//2
		a.mash(c);	//3
		//f.mash(a);	//4.1
		//fa.mash(a);	//4.2

		List<Apple> la = new ArrayList<>();
		Collection<Apple> ca = la;
		a.mash(la);	//5
		a.mash(ca);	//6
	}
}

class Fruit{
	public void mash(Collection fruits){
		System.out.println("In Fruit's mash(Collection)");
	}
}

class Apple extends Fruit{
	public void mash(Collection apples){
		System.out.println("In Apple's mash(Collection)");
	}
	public void mash(List apples){
		System.out.println("In Apple's mash(List)");
	}
	public void mash(Apple apple){
		System.out.println("In Apple's mash(Apple)");
	}	
}