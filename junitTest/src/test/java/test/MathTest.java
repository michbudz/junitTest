package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

	@Test
	public void testMath() {
		Math m = new Math();
	}

	@Test
	public void testMultiple() {
		Math m = new Math();
		m.multiple(0.0, 0.0);
	}
	
	@Test
	public void testDivide(){
		Math m = new Math();
		assertEquals((Double)1.0,m.divide(0.1, 0.1));

	}

}
