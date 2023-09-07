import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(Student student){
		//Belinda.compareTo(Ana)-> +
		//return student.name.compareTo(this.name);
		//return this.name.compareTo(student.name);
		//return student.id - this.id; 
		return this.id - student.id;
	}

	public String toString(){
		return "name: "+name;
	}

	public static void main(String args[]){
		/*
		System.out.println("anarajando".compareTo("morado")); //-
		System.out.println("anarajando".compareTo("anarajando")); 
		System.out.println("morado".compareTo("anarajando")); //+
		
		"anarajando" "morado"
		*/
		
		var a1= new Student(10, "Ana");		
		var a2 = new Student(3, "Belinda");		
		var a3 = new Student(5, "Carlos");		
		System.out.println(a1.compareTo(a2)); //-7

		List<Student> students = new ArrayList<Student>();
		students.add(a1);
		students.add(a2);
		students.add(a3);
		Collections.sort(students);
		System.out.println(students);
	}

}