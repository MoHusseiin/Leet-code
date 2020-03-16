package test.Arrays._412;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Arrays._412.FizzBuzz;

class FizzBuzzTest {

	FizzBuzz fizzBuzz;
	
	@BeforeEach
	void setUp() throws Exception {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	void testFizzBuzz() {
		assertEquals(15, fizzBuzz.fizzBuzz(15).size());
	}

}
