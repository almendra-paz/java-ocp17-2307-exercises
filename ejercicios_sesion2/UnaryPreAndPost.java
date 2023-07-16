public class UnaryPreAndPost{

	public static void main(String args[]){
		// post increment
		int i = 1;
		//i++;
		//++i;
		int k = i++;	//i incrementa 2 pero devuelve	1			
		System.out.println(i); //valor de i es 2
		System.out.println(k); //valor de k es 1

		int c = 5;
		//int c2 = c++;		
		c = c++;			// c aumenta a 6, pero asigna 5 a la variable c
		System.out.println("c: "+c);	//c = 5
		//System.out.println("c2: "+c2);	//c2 = 5

		// pre increment
		int a = 1;
		int b = ++a;	//a incrementa a 2 y devuelve 2
		System.out.println(a); //valor de a es 2
		System.out.println(b); //valor de b es 2	

		//final Alumno al1 = new Alumno();
		//al1 = al2;		
		
		// Wrappers
		Integer integeri = 1000;
		Integer integerj = integeri;
		
		System.out.println("integerj == integeri? "+(integerj == integeri)); //true
		
		integeri++;		// intergei --> 1001
		
		System.out.println("integerj == integeri? "+(integerj == integeri)); //false
		System.out.println(integerj); //1000
		System.out.println(integeri); //1001

		//int d = 0;
		//int int1 = ++d++;

	}
}



