public class EqualsOverridden{
	public static void main(String[] args){
		X x1 = new X(); x1.val = 1;
		X x2 = new X(); x2.val = 1;
		System.out.println(x1.equals(x2));

		X x3 = new X(); x3.val = 1;
		Object x4 = new X(); ((X) x4).val = 1;
		System.out.println(x3.equals(x4));
	}
}

class X{
	int val;
	public boolean equals(Object x){
		System.out.println("override");
		if(! (x instanceof X)) return false;
		return this.val == ((X)x).val;
	}
	public boolean equals(X x){
		System.out.println("overload");
		return this.val ==x.val;
	}

}