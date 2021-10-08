package CT417.Assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTesting {

	@Test
	public void test() {
		Student s1 = new Student();
		s1.setName("Ronan");
		s1.setAge(22);
		assertEquals("Ronan22", s1.getUsername());
	}

}
