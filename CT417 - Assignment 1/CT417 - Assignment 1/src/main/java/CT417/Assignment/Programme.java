package CT417.Assignment;

import java.util.List;
import org.joda.time.DateTime;
public class Programme {
	
	// declaring programme variables
	private DateTime start;
	private DateTime end;
	private String code;
	private String name;
	private List<Module> modules;
	private List<Student> students;
	
	//programme constructors
	public Programme(String name, String code, DateTime start, DateTime end, List<Module> modules) {
		this.name = name;
		this.code = code;
		this.start = start;
		this.end = end;
		this.modules = modules;
	}
	
	public Programme() {};
	
	//programme getters and setters
	public DateTime getStartDate() {
		return start;
	}

	public void setStartDate(DateTime start) {
		this.start = start;
	}

	public DateTime getEndDate() {
		return end;
	}

	public void setEndDate(DateTime end) {
		this.end = end;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
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
	
}

