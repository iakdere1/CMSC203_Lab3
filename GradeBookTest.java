import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook gradeBook1;
	GradeBook gradeBook2;

	@BeforeEach
	void setUp() throws Exception {
		
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);
		
		gradeBook1.addScore(75);
		gradeBook1.addScore(20);
		
		gradeBook2.addScore(81);
		gradeBook2.addScore(54);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
	}

	@Test
	void testGetScoreSize() {
	}

	@Test
	void testToString() {
		
	}

	@Test
	void testAddScore() {
		assertTrue((gradeBook1.toString()).equals("75.0, 20.0, "));
		assertTrue((gradeBook2.toString()).equals("81.0, 54.0, "));
	}

	@Test
	void testSum() {
		assertEquals(95.0, gradeBook1.sum(), 0.1);
		assertEquals(135.0, gradeBook2.sum(), 0.1);
	}

	@Test
	void testMinimum() {
		assertEquals(20.0, gradeBook1.minimum(), 0.1);
		assertEquals(54.0, gradeBook2.minimum(), 0.1);
	}

	@Test
	void testFinalScore() {
		assertEquals(2, gradeBook1.getScoreSize(), 0.1);
		assertEquals(2, gradeBook2.getScoreSize(), 0.1);
	}

}
