public class RuntimeExceptionTest{
	static String name;
	public static void main(String args[]){
		//ArithmeticException
		//int respuesta = 11/0; 

		//ArrayIndexOutOfBoundsException
		int[] countsOfMoose = new int[3];
		//System.out.println(countsOfMoose[3]);

		//ClassCastException
		Object type = "moose";
		//Integer number = (Integer) type; 

		//NullPointerException
		//System.out.println(name.length());

		//IllegalArgumentException
		RuntimeExceptionTest e = new RuntimeExceptionTest();
		//e.setAge(-1);

		//NumberFormatException
		Integer.parseInt("10.0");
	}

	public void setAge(int age){
		if(age<0) throw new IllegalArgumentException("invalid age");
	}
}