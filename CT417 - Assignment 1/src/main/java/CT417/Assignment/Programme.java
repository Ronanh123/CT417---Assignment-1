package CT417.Assignment;

import java.util.List;

import org.joda.time.DateTime;
public class Programme {
	
	private DateTime startDate;
	private DateTime endDate;
	private String name;
	private List<Module> modules;
	private List<Student> students;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	

}

