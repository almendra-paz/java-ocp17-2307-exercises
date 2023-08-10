public class GCStaticVar{
	static Object staticVar;

	public GCStaticVar(Object methodParam){
		staticVar = methodParam;
	}

	public static void main(String args[]){
		Object tempVar = new Object();

		GCStaticVar tc = new GCStaticVar(tempVar);
		tempVar = new Object();
		tc = null;
		System.gc();
		
		System.out.println(GCStaticVar.staticVar);		
	}
}