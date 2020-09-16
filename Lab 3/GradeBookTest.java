import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	
	GradeBook grades, grades2;
	
	@Before
	public void setUp() throws Exception{
		
		grades = new GradeBook(5);
		grades.addScore(90);
		grades.addScore(74);
		
		grades2 = new GradeBook(5);
		grades2.addScore(80);
		grades2.addScore(96);
	}

	@After
	public void tearDown() throws Exception{
		
		grades = null;
		grades2 = null;
	}
	
	@Test
	public void testAddScore() {
		
	assertTrue(grades.toString().equals("90 74 "));
	assertTrue(grades2.toString().equals("80 96 "));	
	}
	
	@Test
	public void testSum() {
		
	assertEquals(164, grades.sum(), .0001);
	assertEquals(176, grades2.sum(), .0001);
	}
	
	@Test
	public void testMinimum() {
		
		assertEquals(74, grades.minimum(), .001);
		assertEquals(80, grades2.minimum(), .001);
	}
	
	@Test
	public void testFinalScore() {
		
		assertEquals(90, grades.finalScore(), .001);
		assertEquals(96, grades2.finalScore(), .001);
	}
}
