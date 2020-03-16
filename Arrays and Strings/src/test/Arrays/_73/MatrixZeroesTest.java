package test.Arrays._73;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays._73.MatrixZeroes;

class MatrixZeroesTest {

	MatrixZeroes matrixZeroes;
	
	@BeforeEach
	void setUp() throws Exception {
		matrixZeroes = new MatrixZeroes();
	}

	@Test
	void testSetZeroes() {
//		matrixZeroes.setZeroes(new int[][] {{1,1,1},
//			  {1,0,1},
//			  {1,1,1}});
		matrixZeroes.setZeroes(new int[][] {{0,1,2,0},
			  {3,4,5,2},
			  {1,3,1,5}});
	}

}
