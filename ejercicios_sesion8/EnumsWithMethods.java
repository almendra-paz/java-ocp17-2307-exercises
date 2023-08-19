public class EnumsWithMethods{
	public static void main(String args[]){
		DocumentType.DNI.sayHello();
		DocumentType.PASS.sayHello();
		DocumentType.PASS.printDescription();
	}
	
}

enum DocumentType{
	DNI("dni"){
		public void printDescription(){}
	}, 
	CE("carnet de extranjeria"){
		public void printDescription(){}
	}, 
	PASS("pasaporte"){
		public void printDescription(){
			System.out.println("pasaporte");
		}
		public void sayHello(){
			System.out.println("welcome");
		}
	};

	private final String description;

	private DocumentType(String description){
		this.description = description;
	}

	public abstract void printDescription();
	public void sayHello(){
		System.out.println("hello");
	}

}

