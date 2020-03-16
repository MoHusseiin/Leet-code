package test.Arrays._912;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays._912.SortArray;

class SortArrayTest {
	
	SortArray sortArray;
	
	@BeforeEach
	void setUp() throws Exception {
		sortArray = new SortArray();
	}

	@Test
	void testSortArrayInWaveForm() {
		assertArrayEquals(new int[] {3,2,6,5,20,10,100,80}, sortArray.sortArrayInWaveForm(new int[] {10, 5, 6, 3, 2, 20, 100, 80}));
		assertArrayEquals(new int[] {3,3,6,5,7}, sortArray.sortArrayInWaveForm(new int[] {3, 6, 5, 3, 7}));
		assertArrayEquals(new int[] {4,2,8,6,20}, sortArray.sortArrayInWaveForm(new int[] {20, 8, 6, 4, 2}));
	}
	
	@Test
	void testSortArrayInWaveFormBest() {
		assertArrayEquals(new int[] {10,5,6,3,20,2,100,80}, sortArray.sortArrayInWaveFormBest(new int[] {10, 5, 6, 3, 2, 20, 100, 80}));
		assertArrayEquals(new int[] {6,3,5,3,7}, sortArray.sortArrayInWaveFormBest(new int[] {3, 6, 5, 3, 7}));
		assertArrayEquals(new int[] {6,3,5,3,2}, sortArray.sortArrayInWaveFormBest(new int[] {3, 6, 5, 3, 2}));
		assertArrayEquals(new int[] {20,8,6,4,2}, sortArray.sortArrayInWaveFormBest(new int[] {20, 8, 6, 4, 2}));
	}
}
