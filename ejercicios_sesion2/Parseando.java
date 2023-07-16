public class Parseando{

	public static void main(String args[]){

		String strBase2 = "10";
		String str3 = "11";
		String strBase4 = "30";

		System.out.println(Integer.parseInt(strBase2));//10
		System.out.println(Integer.parseInt(str3, 2));//3
		System.out.println(Integer.parseInt(strBase4, 2));
	}

}