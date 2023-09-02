import java.util.Arrays;

public class MismatchArrays{

	public static void main(String args[]){

	int[] a = {1,2,3,4,5};	
	int[] b = {1,2,3};
	System.out.println(Arrays.mismatch(a,b)); //3
	System.out.println(Arrays.mismatch(b,a)); //3


	int[] c = {1,2,3,4,5};	
	int[] d = {1,2,6};
	System.out.println(Arrays.mismatch(c,d)); //2
	System.out.println(Arrays.mismatch(d,c)); //2

	int[] e = {1,2,3,4,5};	
	int[] f = {1,2,3,4,5};
	System.out.println(Arrays.mismatch(e,f)); //-1
	System.out.println(Arrays.mismatch(f,e)); //-1

	int[] g = {1,2,3,4,5};	
	int[] h = {5,4,3,2,1};
	System.out.println(Arrays.mismatch(g,h)); //0
	System.out.println(Arrays.mismatch(h,g)); //0
	}

}