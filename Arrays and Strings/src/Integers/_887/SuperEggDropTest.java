package Integers._887;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SuperEggDropTest {
	SuperEggDrop superEggDrop;
	@BeforeEach
	void setUp() throws Exception {
		superEggDrop = new SuperEggDrop();
	}

	@Test
	void testSuperEggDrop() {
		assertEquals(2, superEggDrop.superEggDrop(1, 2));
		assertEquals(3, superEggDrop.superEggDrop(2, 6));
		assertEquals(4, superEggDrop.superEggDrop(3, 14));
		assertEquals(1, superEggDrop.superEggDrop(10, 1));
		assertEquals(4, superEggDrop.superEggDrop(2, 10));
	}

	@Test
	void superEggDropBest() {
//		assertEquals(2, superEggDrop.superEggDropBest(1, 2));
		assertEquals(3, superEggDrop.superEggDropBest(2, 6));
		assertEquals(4, superEggDrop.superEggDropBest(3, 14));
		assertEquals(1, superEggDrop.superEggDropBest(10, 1));
		assertEquals(4, superEggDrop.superEggDropBest(2, 10));
	}
}
