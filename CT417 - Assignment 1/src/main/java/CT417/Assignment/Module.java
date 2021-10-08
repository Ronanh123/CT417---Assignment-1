package CT417.Assignment;
import java.util.List;

public class Module {

	private String name;
	private String code;
	private List<Student> students;
	private List<Programme> courses;
	
	public Module(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Programme> getCourses() {
		return courses;
	}
	public void setCourses(List<Programme> courses) {
		this.courses = courses;
	}
	
}

