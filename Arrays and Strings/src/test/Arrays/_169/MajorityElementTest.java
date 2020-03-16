package test.Arrays._169;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays._169.MajorityElement;

class MajorityElementTest {

	MajorityElement majorityElement;
	
	@BeforeEach
	void setUp() throws Exception {
		majorityElement = new MajorityElement();
	}

	@Test
	void testMajorityElement() {
		assertEquals(3, majorityElement.majorityElement(new int[] {3,2,3}));
		assertEquals(2, majorityElement.majorityElement(new int[] {2,2,1,1,1,2,2}));
	}

	@Test
	void testMajorityElement2() {
		assertEquals(3, majorityElement.majorityElement2(new int[] {3,2,3}));
		assertEquals(2, majorityElement.majorityElement2(new int[] {2,2,1,1,1,2,2}));
	}
	
	@Test
	void testmajorityElementBest() {
		assertEquals(3, majorityElement.majorityElementBest(new int[] {3,2,3}));
		assertEquals(2, majorityElement.majorityElement2(new int[] {2,2,1,1,1,2,2}));
	}
}
