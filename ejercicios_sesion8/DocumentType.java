public enum DocumentType{
	DNI("dni"), CE("carnet de extranjeria"),PASS ("pasaporte");

	private final String description;
	private DocumentType(String description){
		this.description = description;
	}
	public void printDescription(){
		System.out.println(description);
	}
}

