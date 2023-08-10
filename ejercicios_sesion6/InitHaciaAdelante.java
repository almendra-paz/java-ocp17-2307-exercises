public class InitHaciaAdelante{	
	private int MAX = 3;	
	
	{
		MAX = 4;
		System.out.println("hello ");
	}
	
	{	
		//System.out.println(i);	// error de compilación
		//System.out.println(j);
		i = 20;	
		//int k = i;
		//System.out.println(i);
		imprimir();
		MAX = 5;		
	}		
	
	private int i = 0;
	private int j = 20;
		
	public static void main(String arg[]){
		InitHaciaAdelante e = new InitHaciaAdelante();
		System.out.println(e.MAX); //5
		System.out.println(e.i); //20
		//e.imprimir();
	}
	
	public void imprimir(){
		System.out.println("valor i: "+i); //20
		System.out.println("valor j: "+j); //0
	}
}
