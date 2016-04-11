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

	public void testMulti() {
		SimpleCalc calc = new SimpleCalc();
		calc.mul(20, 10);
		assertEquals(200, calc.getResult());
	}

	@Test
	public void testDiv() {
		SimpleCalc calc = new SimpleCalc();
		calc.div(20, 10);
		assertEquals(2, calc.getResult());
	}
	@Test
	public void testInc() {
		SimpleCalc calc = new SimpleCalc();
		calc.inc(100);
		assertEquals(100, calc.getResult());
		calc.inc(200);
		assertEquals(300, calc.getResult());
	}

}
