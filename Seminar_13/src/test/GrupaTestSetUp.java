package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class GrupaTestSetUp {
	Grupa grupa;
	@Before
	public void setUp() throws Exception{
		grupa=new Grupa(1048);
		for(int i=1;i<36;i++) {
			Student student = new Student();
			student.adaugaNota(i%10 +1);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test(timeout=100)
	public void performancePromovabilitateTest() {
		grupa.getPromovabilitate();
	}
}
