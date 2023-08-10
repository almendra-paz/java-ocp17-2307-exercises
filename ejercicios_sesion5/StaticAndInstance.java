public class StaticAndInstance{
	String nameInstance;		// variable de instancia
	static int numberOfInstances; //contador de instancias

	public static void main (String args[]){	
		System.out.println(StaticAndInstance.numberOfInstances);	//0
	
		StaticAndInstance acct1 = new StaticAndInstance();		
		acct1.nameInstance = "first instance";
		acct1.numberOfInstances = 10; //1

		StaticAndInstance acct2 = new StaticAndInstance();	
		acct2.nameInstance = "second instance";
		acct2.numberOfInstances = 20;

		System.out.println("name1: "+acct1.nameInstance);
		System.out.println("number1: "+StaticAndInstance.numberOfInstances); //20

		System.out.println("name2: "+acct2.nameInstance);
		System.out.println("number2: "+acct2.numberOfInstances);//20
		
		StaticAndInstance acct3 = new StaticAndInstance();
		System.out.println("number3: "+acct3.numberOfInstances);
		
		System.out.println(
		StaticAndInstance.numberOfInstances);
	}
}