 abstract class Vehiculo{
	private String tipo;
	
	//metodos abstractos: public, protected, default
	abstract String getTipo(); //default
	public abstract void ensamblarse();	
	
	//metodos concretos: 
	//metodo final y static: public, private, protected, default
	public void imprimir3(){
		System.out.println("ok");
	}
	final void imprimir(){
		System.out.println("ok");
	}
	private final void imprimir2(){
		System.out.println("ok");
	}
	protected static void ensamblarse2(){
		System.out.println("ok");
	}
	//protected final abstract void ensamblarse2();
	//protected static abstract void ensamblarse2();	

	public static void main(String args[]){
		//Vehiculo ve = new Vehiculo(); //no compila
		Auto auto = new Auto();
		auto.imprimir();
	}
}

class Auto extends Vehiculo{	
	protected String getTipo(){return "";}	
	public void ensamblarse(){}
	//void imprimir(){}
	protected final static void ensamblarse2(){}

	public void prueba(){}
}

final class AutoFinal extends Vehiculo{	
	public String getTipo(){return "";}	
	public void ensamblarse(){}

	//abstract void prueba(){}
}

/*
final class AutoHija extends AutoFinal{	
	public String getTipo(){return "";}	
	public void ensamblarse(){}
}*/