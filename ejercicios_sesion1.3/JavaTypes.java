public class JavaTypes{
	
	//variables de clase
	static private int $int; 	
	static private byte $byte;
	static private long $long;
	static private short $short;
	// variables de instancia
	private char $char;	//espacio en blanco	
	private float $float;
	private double $double;
	private boolean $boolean;
	private String $str1;
		
	public static void main(String args[]){		
		System.out.println("---Variables de instancia");	
		JavaTypes obj1 = new JavaTypes();
		System.out.println(obj1.$int);
		System.out.println($int);
		System.out.println(obj1.$byte);
		System.out.println(obj1.$long);
		System.out.println(obj1.$short);
		System.out.println(obj1.$char);
		System.out.println(obj1.$float);
		System.out.println(obj1.$double);
		System.out.println(obj1.$boolean);
		System.out.println(obj1.$str1);		

		System.out.println("---Variables locales");
		int localVariable;
		//System.out.println(localVariable);

	}	
	
}