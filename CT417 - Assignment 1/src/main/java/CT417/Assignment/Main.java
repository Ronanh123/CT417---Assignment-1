package CT417.Assignment;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Student john = new Student();
		john.setName("John");
		john.setAge(22);
		Module math = new Module("MA150");
		Module dbs = new Module("CT440");
		List<Module> modules = new ArrayList<Module>();
		modules.add(math);
		modules.add(dbs);
		john.setModules(modules);
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getUsername());
		
		System.out.println("\nModules: ");
		for(Module m: john.getModules()) {
			System.out.println(m.getCode());
		}
		
	}

}
