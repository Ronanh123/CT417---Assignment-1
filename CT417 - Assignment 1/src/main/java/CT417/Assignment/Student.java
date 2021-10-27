package CT417.Assignment;

import java.time.format.*;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class Student {

	private String name;
	private int age;
	private Programme programme;
	private List<Module> modules;
	private String username;
	private DateTime dob;
	private String dateFormatString = "dd-MM-yyyy";
	DateTimeFormatter dateFormat = DateTimeFormat.forPattern("dd-MM-yyyy");

	//student constructor
	public Student(String name, int age, Programme programme,DateTime dob) {
		this.name = name;
		this.age = age;
		this.programme = programme;
		this.dob = dob;
	}
	
	// getters and setters for student variables
	
	public String getUsername() {//generates student's username from their name and age
		return name + age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Programme getProgramme() {
		return programme;
	}
	public void setCourse(Programme programme) {
		this.programme = programme;
	}
	public DateTime getDob() {
		return dob;
	}

	public void setDob(DateTime dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	public void PrintStudentInfo() {// method used for printing out student details: name, age, username, dob, course, modules
		System.out.println("Name: " + getName());
		System.out.println("Date of Birth: "+ (getDob().toString(dateFormat)));
		System.out.println("Age: " + getAge());
		System.out.println("Username: " + getUsername());
		System.out.println("Programme registered to: " + getProgramme().getName() + " - " + getProgramme().getCode());
		System.out.println("Programme Start Date: " + (getProgramme().getStartDate().toString(dateFormat)));
		System.out.println("Programme End Date: " + (getProgramme().getEndDate().toString(dateFormat)));
		System.out.println("Modules Registered to: ");
		for(Module m: getModules()) {
			System.out.println("\t\t\t" + m.getName() + " - " + m.getCode());
		}
		System.out.println("--------------------------------------------------------");
	}
}

