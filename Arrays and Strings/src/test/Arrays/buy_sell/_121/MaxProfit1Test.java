package test.Arrays.buy_sell._121;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays.buy_sell._121.MaxProfit1;

class MaxProfit1Test {

	MaxProfit1 maxProfit1;
	@BeforeEach
	void setUp() throws Exception {
		maxProfit1 = new MaxProfit1();
	}

	@Test
	void testMaxProfit() {
		assertEquals(5, maxProfit1.maxProfit(new int[] {7,1,5,3,6,4}));
		assertEquals(0, maxProfit1.maxProfit(new int[] {7,6,4,3,1}));
	}

	@Test
	void testMaxProfitBest() {
		assertEquals(5, maxProfit1.maxProfitBest(new int[] {7,1,5,3,6,4}));
		assertEquals(0, maxProfit1.maxProfitBest(new int[] {7,6,4,3,1}));
	}
}
