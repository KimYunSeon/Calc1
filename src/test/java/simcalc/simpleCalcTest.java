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

}
