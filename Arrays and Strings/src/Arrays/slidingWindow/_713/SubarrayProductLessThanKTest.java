package Arrays.slidingWindow._713;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubarrayProductLessThanKTest {

	SubarrayProductLessThanK subarrayProductLessThanK;
	
	@BeforeEach
	void setUp() throws Exception {
		subarrayProductLessThanK = new SubarrayProductLessThanK();
	}

	@Test
	void testNumSubarrayProductLessThanK() {
//		assertEquals(7, subarrayProductLessThanK.numSubarrayProductLessThanK(new int[] {1, 2, 3, 4}, 10));
		assertEquals(8, subarrayProductLessThanK.numSubarrayProductLessThanK(new int[] {10, 5, 2, 6}, 100));
	}

}
