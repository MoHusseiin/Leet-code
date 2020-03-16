package test.Arrays._16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays._16.ThreeSumClosest;

class ThreeSumClosestTest {

	ThreeSumClosest threeSumClosest;
	
	@BeforeEach
	void setUp() throws Exception {
		threeSumClosest = new ThreeSumClosest();
	}

	@Test
	void testThreeSumClosest() {
		assertEquals(2, threeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
	}

}
