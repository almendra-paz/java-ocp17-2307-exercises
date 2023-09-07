import java.util.ArrayList;
import java.util.List;

public class InterfacesBounded{
	
	private void anyMovible(List<Movible> movible){}		
	private void grupoMovible(List<? extends Movible> movible){}		
	
	public static void main(String args[]){
		InterfacesBounded inter = new InterfacesBounded();		
		List<Movible> listaMovible = new ArrayList<>();
		List<Auto> listaAuto = new ArrayList<>();
		
		inter.anyMovible(listaMovible);
		//inter.anyMovible(listaAuto);
		
		inter.grupoMovible(listaMovible);
		inter.grupoMovible(listaAuto);				
	}
}

interface Movible{ void fly(); }
class Auto implements Movible{
	public void fly(){}
}
class Bicicleta implements Movible{
	public void fly(){}
}
