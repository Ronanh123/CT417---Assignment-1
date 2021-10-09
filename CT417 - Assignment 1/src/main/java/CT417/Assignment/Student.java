
package CT417.Assignment;

import java.util.Date;
import java.util.List;

public class Student {

	private String name;
	private int age;
	private String course;
	private List<Module> modules;
	private String username;
	private Date dob;

	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getUsername() {
		return name + age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setCourse(String course) {
		this.course = course;
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
	
}

