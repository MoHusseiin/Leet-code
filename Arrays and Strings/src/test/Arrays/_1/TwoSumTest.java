package test.Arrays._1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays._1.TwoSum;

class TwoSumTest {

	TwoSum twoSum;
	
	@BeforeEach
	void setUp() throws Exception {
		twoSum = new TwoSum();
	}

	@Test
	void testTwoSum() throws Exception{
		assertArrayEquals(new int[] {1 ,3}, twoSum.twoSum(new int[] {2, 3, 7, 4, 8}, 7));
		assertArrayEquals(new int[] {0 ,3}, twoSum.twoSum(new int[] {2, 3, 7, 4, 8}, 6));
		assertArrayEquals(new int[] {0 ,4}, twoSum.twoSum(new int[] {-2, 3, 7, 4, 8}, 6));
	}
	
	@Test
	void testCountPairsWithGivenSum() throws Exception{
		assertEquals(2, twoSum.countPairsWithGivenSum(new int[] {1, 5, 7, -1}, 6));
		assertEquals(3, twoSum.countPairsWithGivenSum(new int[] {1, 5, 7, -1, 5}, 6));
		assertEquals(6, twoSum.countPairsWithGivenSum(new int[] {1, 1, 1, 1}, 2));
		assertEquals(9, twoSum.countPairsWithGivenSum(new int[] {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1}, 11));
	}

}
