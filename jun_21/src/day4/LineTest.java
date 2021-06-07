package day4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineTest {

	Line l1 = new Line(0.0, 0.0, 1.0, 1.0);
	Line l2 = new Line(0.0, 1.0, 1.0, 2.0);
	Line l3 = new Line(0.0, 0.0, 1.0, 2.0);
	Line l4 = new Line(0.0, 0.0, 3.0, 4.0);
	
	@Test
	void testGetSlope() {
		assertEquals(l1.getSlope(), 1.0);
	}
	
	@Test
	void testGetDistance() {
		assertEquals(l4.getDistance(), 5.0);
	}
	
	@Test
	void testParallelTo() {
		assertTrue(l1.parallelTo(l2));
		assertFalse(l1.parallelTo(l3));
	}

}
