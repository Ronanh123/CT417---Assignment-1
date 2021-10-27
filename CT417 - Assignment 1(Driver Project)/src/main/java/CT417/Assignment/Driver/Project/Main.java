package CT417.Assignment.Driver.Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import CT417.Assignment.*;
import CT417.Assignment.Module;

public class Main{

	public static void main(String[] args) {
		
		String[] names = new String[]{"John", "Anne", "Bob", "Sean", "Michael", "Bill"};
		int[] ages = new int[] {22,24,22,21,18,19};
		Student[] studentList= new Student[6];
		String[] moduleNames = new String[] {"Software Eng", "Maths", "Engineering", "Science", "Calculus"};
		String[] modules = new String[] {"CT417", "MA140", "EG150", "SC342", "MM450"};
		Random rand = new Random();

		
		List<Student> moduleStudents = new ArrayList<Student>();
		List<Module>  moduleList = new ArrayList<Module>();
		
		for(int i =0;i <6;i++) {
			Student s = new Student(names[i],ages[i]);
			studentList[i] = s;
		}
		
		
		
		for(int i = 0; i < modules.length;i++) {
			Module m = new Module(moduleNames[i], modules[i]);
			m.setName(moduleNames[i]);
			moduleList.add(m);
		}
		
		for(Module m: moduleList) {
			List<Student> temp = new ArrayList<Student>();
		    int randomNum = rand.nextInt((studentList.length));
		    for(int i = 0;i <randomNum;i++) {
		    	int ran = rand.nextInt((studentList.length - randomNum) + randomNum);
		    	temp.add(studentList[ran]);
		    }
		    m.setStudents(temp);
		    
		}	
		
		Programme bct = new Programme("Computer Science");
		Programme eng = new Programme("Undenominated Engineering");
		
		bct.setModules(new ArrayList<Module>(Arrays.asList(moduleList.get(0),moduleList.get(1))));
		
		
		eng.setModules(new ArrayList<Module>(Arrays.asList(moduleList.get(1),moduleList.get(2), moduleList.get(3), moduleList.get(4))));
		
		List<Programme> progs = new ArrayList<Programme>();
		progs.add(bct);
		progs.add(eng);
		
		for(Programme p: progs) {
			System.out.println("\nProgramme Name: " + p.getName());
			System.out.println("Programme Modules: ");
			for(Module m: p.getModules()) {
				System.out.println(m.getName() + " - " + m.getCode());
				System.out.println("Students");
				for(Student s: m.getStudents()) {
					System.out.println("Student Name: " + s.getName() + "\tUsername: " + s.getUsername());
				}
			}
		}

		
	}
}
