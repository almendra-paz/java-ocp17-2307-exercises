import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student3{
	private int id;
	private String name;

	public String getName(){
		return this.name;
	}

	public int getId(){
		return this.id;
	}

	public String toString(){
		return "id: "+id+", name: "+name;
	}

	public static void main(String args[]){
		var a1= new Student3();
		a1.id=10; 	a1.name = "Ana";
		var a2 = new Student3();
		a2.id =10; 	a2.name = "Belinda";
		var a3 = new Student3();
		a3.id =5; 	a3.name = "Carlos";		

		List<Student3> students = new ArrayList<>();
		students.add(a1);
		students.add(a2);
		students.add(a3);
		
		//Collections.sort(students);
		
		System.out.println("order por defecto: "+students);

		Comparator<Student3> byId = Comparator.comparing(Student3::getId);
		// Comparator.comparing(a-> a.id);
		Collections.sort(students, byId);
		System.out.println("order by Id: "+students);
		
		
		Comparator<Student3> byIdRev = Comparator.comparing(Student3::getId).reversed();
		Collections.sort(students, byIdRev);		
		System.out.println("order byIdReverso: "+students);
		
		Comparator<Student3> byIdThenName = 					Comparator.comparing(Student3::getId)
				.thenComparing(Student3::getName);
		/*
		Comparator<Student3> byIdThenName2 = 					
		Comparator.<Student3, Integer>comparing(s ->s.getId()).thenComparing(s ->s.getName());*/		
		Collections.sort(students, byIdThenName);
		System.out.println("order byIdAndName: "+students);
		
		
		Comparator<Student3> byIdThenNameReversed = byIdThenName.reversed();
		Collections.sort(students, byIdThenNameReversed);
		System.out.println("order byIdThenNameReversed: "+students);		
		

		
		
		
	}

}