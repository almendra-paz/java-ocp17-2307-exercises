public record AlumnoRecord(String id, String name, int edad) {

	public static void main(String args[]){
		System.out.println("------");
		var alumno = new AlumnoRecord("12", "Juan", 20);
		System.out.println(alumno.id()); //acceder a sus campos
		System.out.println(alumno.name());
		System.out.println(alumno.edad());

		System.out.println("--- toString, Equals, HashCode ---");
		System.out.println(alumno);

		var alumnoCopia = new AlumnoRecord("12", "Juan", 20);
		System.out.println(alumno.equals(alumnoCopia));
		System.out.println(alumno.hashCode());

		//nested record
		AlumnoRecord3 alum3 = 
		new AlumnoRecord3("11", true, alumno);
	}

	public record AlumnoRecord3(String id, boolean status, 
		AlumnoRecord rec){

	}

}