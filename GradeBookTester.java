//task 2 - create this tester class
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	//task 3 - fill in the setUp and tearDown methods
	GradeBook book1;
	GradeBook book2;
	@BeforeEach
	void setUp() throws Exception {
		book1 = new GradeBook(5);
		book2 = new GradeBook(5);
		book1.addScore(98.6);
		book1.addScore(86.7);
		book1.addScore(76.5);
		book2.addScore(87.7);
		book2.addScore(64.3);
	}

	@AfterEach
	void tearDown() throws Exception {
		book1 = null;
		book2 = null;
	}
	//task 4
	@Test
	void testAddScore() {
		//fail("Not yet implemented");
		assertTrue(book1.toString().equals("98.6 86.7 76.5"));
	}

	@Test
	void testSum() {
		//fail("Not yet implemented");
		assertEquals(152, book2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		//fail("Not yet implemented");
		assertEquals(76.5, book1.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		//fail("Not yet implemented");
		assertEquals(87.7, book2.finalScore());
	}

	@Test
	void testGetScoreSize() {
		//fail("Not yet implemented");
		assertEquals(5, book1.getScoreSize());
	}
/*
	@Test
	void testToString() {
		//fail("Not yet implemented");
	}
*/
}
