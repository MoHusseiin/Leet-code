package test.Arrays.buy_sell._123;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays.buy_sell._123.MaxProfit3;

class MaxProfit3Test {
	
	MaxProfit3 maxProfit3;
	
	@BeforeEach
	void setUp() throws Exception {
		maxProfit3 = new MaxProfit3();
	}

	@Test
	void testMaxProfit() {
		assertEquals(6, maxProfit3.maxProfit(new int[] {3,3,5,0,0,3,1,4}));
		assertEquals(4, maxProfit3.maxProfit(new int[] {1,2,3,4,5}));
		assertEquals(0, maxProfit3.maxProfit(new int[] {7,6,4,3,1}));
	}

}
