package test.Arrays._283;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays._283.MoveZeroes;

class MoveZeroesTest {

	MoveZeroes moveZeroes;
	
	@BeforeEach
	void setUp() throws Exception {
		moveZeroes = new MoveZeroes();
	}

//	@Test
//	void testMoveZeroes() {
//		moveZeroes.moveZeroes(new int []{0,1,0,3,12});
//	}
	
	@Test
	void testMoveZeroes2() {
		moveZeroes.moveZeroes2(new int []{0,1,0,3,12});
	}

}
