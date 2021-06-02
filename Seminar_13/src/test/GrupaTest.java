package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class GrupaTest {

	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void constructorTest() {
		Grupa grupa = new Grupa(1079);
		Assert.assertEquals(1079,grupa.getNrGrupa());
	}
	
	@Test
	public void testareLimitaInverioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testareLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void inAfaraLimitelorTest() {
		Grupa grupa = new Grupa(1300);		
	}
	
	@Test(timeout = 1000)
	public void performantaTest() {
		Grupa grupa = new Grupa(1050);
	}
	
	@Test
	public void testareCorectitudinePromovabilitate() {
		Grupa grupa = new Grupa(1005);
		for(int i = 1; i < 11; i++) {
			Student student = new Student();
			student.adaugaNota(i);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.6f,grupa.getPromovabilitate(),.001f);
	}
	
	@Test
	public void testareLimitaInferioaraPromovabilitate() {
		Grupa grupa = new Grupa(1005);
		for(int i = 1; i < 11; i++) {
			Student student = new Student();
			student.adaugaNota(1);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.0f,grupa.getPromovabilitate(),.001f);
	}
	
	@Test
	public void testareLimitaSuperioaraPromovabilitate() {
		Grupa grupa = new Grupa(1005);
		for(int i = 1; i < 11; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1f,grupa.getPromovabilitate(),.001f);
	}
	
	@Test
	public void boundaryPromovabilitate() {
		Grupa grupa = new Grupa(1010);
		assertEquals(0, grupa.getPromovabilitate(),0.001f);
	}
	
	@Test
	public void cardinalityPromovabilitateTest() {
		Grupa grupa = new Grupa(1050);
		Student student = new Student();
		student.adaugaNota(5);
		grupa.adaugaStudent(student);
		
		assertEquals(1f, grupa.getPromovabilitate(),0.001f);
	}
	
	
}
