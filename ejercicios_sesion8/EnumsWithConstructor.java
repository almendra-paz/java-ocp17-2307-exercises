public class EnumsWithConstructor{
	public static void main(String args[]){
		System.out.println(DocumentType.DNI); //DNI
		System.out.println(DocumentType.DNI.name);
		System.out.println(DocumentType.CE.name);

		DocumentType.DNI.llenarName();
		System.out.println(DocumentType.DNI.name);
		//DocumentType.DNI.printDescription();
		//DocumentType.CE.printDescription();

		/*DocumentType.CE.print("static message");//static method
		DocumentType.PASS.sumar(5);		
		System.out.println(DocumentType.DNI.edad);
		DocumentType.DNI.edad = 20;
		System.out.println(DocumentType.edad);
		System.out.println(DocumentType.DNI.edad);
		System.out.println(DocumentType.CE.edad);
		*/
	}	
}

class Type{}

enum DocumentType {
	DNI("dni"){
		public int edad1;	
		public static final int edad2 = 10;
		public void sumar(int op1){
			System.out.println(op1+2);
		}		
		public void llenarName(){
			Type t = new Type();
			name = "DNI";
		}		
	}, 
	CE("carnet de extranjeria"){
		public void sumar(int op1){
			System.out.println(op1+3);
		}
		public void printDescription(){		
			System.out.println("CE>>"+edad);
		}
	},
	PASS ("pasaporte"){
		public void sumar(int op1){
			System.out.println(op1+4);
		}
	};

	// solo puede ser privado
	private DocumentType(String description){
		System.out.println("in constructor: "+ description);
		this.description = description;
	}

	//variables de instancia o estáticos
	protected final String description;
	public String name;
	protected static int edad;
	
	
	public void printDescription(){		
		System.out.println(description);
	}
	public static final void print(String message){		
		System.out.println(message);
	}
	public abstract void sumar(int op1);

	public void llenarName(){
		name = null;
	}

}

