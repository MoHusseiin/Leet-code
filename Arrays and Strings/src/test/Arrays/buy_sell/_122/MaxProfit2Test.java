package test.Arrays.buy_sell._122;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays.buy_sell._122.MaxProfit2;

class MaxProfit2Test {
	
	MaxProfit2 maxProfit2;
	
	@BeforeEach
	void setUp() throws Exception {
		maxProfit2 = new MaxProfit2();
	}

	@Test
	void testMaxProfit() {
		assertEquals(7, maxProfit2.maxProfit(new int[] {7,1,5,3,6,4}));
		assertEquals(4, maxProfit2.maxProfit(new int[] {1,2,3,4,5}));
		assertEquals(0, maxProfit2.maxProfit(new int[] {7,6,4,3,1}));
		assertEquals(865, maxProfit2.maxProfit(new int[] {100, 180, 260, 310, 40, 535, 695}));
	}

}
