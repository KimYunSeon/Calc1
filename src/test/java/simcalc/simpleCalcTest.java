package simcalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class simpleCalcTest {

	@Test
	public void testAdd() {
		SimpleCalc calc = new SimpleCalc();
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
	}
	@Test
	public void testSub() {
		SimpleCalc calc = new SimpleCalc();
		calc.sub(20, 10);
		assertEquals(10, calc.getResult());
	}
	@Test
	public void testDiv() {
		SimpleCalc calc = new SimpleCalc();
		calc.div(20, 10);
		assertEquals(2, calc.getResult());
	}

}
