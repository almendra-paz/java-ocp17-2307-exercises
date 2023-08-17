public final class FinalClass extends Vehiculo{
	public String getTipo(){
		return "final type";
	}
	public void ensamblarse(){
		System.out.println("ensamblando objeto final");
	}
	//public abstract void saludar();

	public static void main(String[] args){
		FinalClass f = new FinalClass();
		System.out.println("ok");
	}
}

abstract class Vehiculo{
	public abstract String getTipo();
	public abstract void ensamblarse();

	public final void saludar(){
		System.out.println("ok");
	}
}