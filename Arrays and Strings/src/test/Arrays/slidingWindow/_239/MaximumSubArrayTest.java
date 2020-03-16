package test.Arrays.slidingWindow._239;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays.slidingWindow._239.MaximumSubArray;

class MaximumSubArrayTest {

	MaximumSubArray maximumSubArray;
	
	@BeforeEach
	void setUp() throws Exception {
		maximumSubArray = new MaximumSubArray();
	}

	@Test
	void testMaxSlidingWindow() {
//		assertArrayEquals(new int[] {3,3,5,5,6,7}, maximumSubArray.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3));
//		assertArrayEquals(new int[] {1, -1}, maximumSubArray.maxSlidingWindowBest(new int[] {1,-1}, 1));
	}
	
	@Test
	void testMaxSlidingWindowBest() {
		assertArrayEquals(new int[] {3,3,5,5,6,7}, maximumSubArray.maxSlidingWindowBest(new int[] {1,3,-1,-3,5,3,6,7}, 3));
		assertArrayEquals(new int[] {1, -1}, maximumSubArray.maxSlidingWindowBest(new int[] {1,-1}, 1));
		assertArrayEquals(new int[] {1}, maximumSubArray.maxSlidingWindowBest(new int[] {1}, 1));
		assertArrayEquals(new int[] {}, maximumSubArray.maxSlidingWindowBest(new int[] {}, 0));
		assertArrayEquals(new int[] {7, 4}, maximumSubArray.maxSlidingWindowBest(new int[] {7,2,4}, 2));
	}

}
