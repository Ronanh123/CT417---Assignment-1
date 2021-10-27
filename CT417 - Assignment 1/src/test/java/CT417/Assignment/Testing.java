package CT417.Assignment;

import static org.junit.Assert.*;

import org.junit.Test;

import org.joda.time.DateTime;


// this Junit test class checks that the methods for the student, module and programme classes are all working correctly
// I have a test for each class, testing some aspects of each
public class Testing {

	Programme science = new Programme();
	
	// student tests
	@Test
	public void TestStudent() {
		DateTime d = new DateTime();
		Student s = new Student("John", 21, science,new DateTime("2000-03-11"));
		assertEquals(science, s.getProgramme());
		assertEquals("John21", s.getUsername());// username = name + age
	}
	
	//module tests
	@Test
	public void TestModule() {
		Module m = new Module("Pyschology", "PA123");
		assertEquals("Pyschology", m.getName());
		assertEquals("PA123", m.getCode());
	}
	
	//programme tests
	@Test
	public void TestProgramme() {
		science.setName("Science");
		science.setCode("SC123");
		assertEquals("Science", science.getName());
		assertEquals("SC123", science.getCode());
	}

}
