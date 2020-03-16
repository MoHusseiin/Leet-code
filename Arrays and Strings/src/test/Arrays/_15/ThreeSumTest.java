package test.Arrays._15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays._15.ThreeSum;

class ThreeSumTest {
	ThreeSum threeSum;
	
	@BeforeEach
	void setUp() throws Exception {
		threeSum = new ThreeSum();
	}
	
	@Test
	void testAllThreeSumSort() {
		assertEquals(2, threeSum.allThreeSumSort(new int[]{-1, 0, 1, 2, -1, -4}).size());
		assertEquals(1, threeSum.allThreeSumSort(new int[]{0,0,0,0}).size());
	}
	
//	@Test
//	void testAllThreeSum() {
//		assertEquals(2, threeSum.allThreeSum(new int[]{-1, 0, 1, 2, -1, -4}).size());
//	}

//	@Test
//	void testThreeSumIntArrayTarget() {
//		assertArrayEquals(new int[]{3, 9, 12}, threeSum.threeSumTarget(new int[]{12, 3, 4, 1, 6, 9}, 24));
//		assertArrayEquals(new int[]{-4, 1, 2}, threeSum.threeSumTarget(new int[]{-1, 2, 1, -4}, -1));
//		assertArrayEquals(new int[]{-1, 1, 2}, threeSum.threeSumTarget(new int[]{-1, 2, 1, -4}, 2));
//		assertArrayEquals(new int[]{}, threeSum.threeSumTarget(new int[]{-1, 2, 1, -4}, 0));
//	}
//
//	@Test
//	void testThreeSumIntArrayInt() {
//		assertArrayEquals(new int[]{12, 3, 9}, threeSum.threeSum(new int[]{12, 3, 4, 1, 6, 9}, 24));
//		assertArrayEquals(new int[]{2, 1, -4}, threeSum.threeSum(new int[]{-1, 2, 1, -4}, -1));
//		assertArrayEquals(new int[]{-1, 2, 1}, threeSum.threeSum(new int[]{-1, 2, 1, -4}, 2));
//		assertArrayEquals(new int[]{}, threeSum.threeSum(new int[]{-1, 2, 1, -4}, 1));
//	}

}
