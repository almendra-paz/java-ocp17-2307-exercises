public class NestedClases2{
	
	//inner class
	public class Inner{
		private String saludo = "hello";
		public void saludar(){
			System.out.println(saludo);
			staticMethod();
			instanceMethod();
		}
	}
	
	//static inner class
	public static class StaticInner{
		private String saludo = "hello";
		public void saludar(){
			System.out.println(saludo);
			staticMethod();
		}
	}	
		
	public void imprimir(){
		//Local class
		class LocalClass{			
			private String saludo = "hello local class";
			public void saludar(){
				System.out.println(saludo);
				staticMethod();
				instanceMethod();
			}
		}
		
		//Anonymous class
		Inner newInner = new Inner(){
			private String saludo = "hello anonymous class";
			private static int EDAD = 18;
			public static void innerStaticMethod(){
				System.out.println("impresion");
			}

			public void saludar(){
				System.out.println(saludo);
				staticMethod();
				instanceMethod();
				innerStaticMethod();
			}
		};
		
		LocalClass localClass = new LocalClass();
		localClass.saludar();		

		newInner.saludar();		
		invocandoNested(newInner);
	}
	
	public static void main(String args[]){			
		//inner class
		NestedClases2 outer = new NestedClases2();
		Inner inner = outer.new Inner();
		// static inner class
		StaticInner staticInner = new StaticInner();	

		outer.imprimir();		
	}
	
	private void invocandoNested(Inner inner){
		inner.saludar();
	}

	private void instanceMethod(){}
	private static void staticMethod(){}
}