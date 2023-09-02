import java.util.Arrays;

public class CompareArrays{

	public static void main(String args[]){

	int[] a1 = {1,2,3};	
	int[] b1 = {1,2,3};	
	System.out.println(Arrays.compare(a1,b1)); //0
	System.out.println(Arrays.compare(b1,a1)); //0

	int[] a = {1,2,3,4,20,23};	//6
	int[] b = {1,2,3};			//3
	System.out.println(Arrays.compare(a,b)); //+
	System.out.println(Arrays.compare(b,a)); //-


	int[] c = {1,2,3,4,5,6};	
	int[] d = {1,2,6};
	System.out.println(Arrays.compare(c,d)); //-
	System.out.println(Arrays.compare(d,c)); //+

	int[] c1 = {8,3,4,5};	
	int[] d1 = {4,6};
	System.out.println(Arrays.compare(c1,d1)); //+
	System.out.println(Arrays.compare(d1,c1)); //-
	
	// "a" < "d", 1 < 4
	String[] c2 = {"abcd",null,"hello"};
	String[] d2 = {"aacd", null, "hello"};
	System.out.println(Arrays.compare(c2,d2)); //+
	System.out.println(Arrays.compare(d2,c2)); //-

	}

}