package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P003_CalcTest {

	@Test
	public void addTest() {
		Calc c = new Calc();
		int actual = c.add(11, 9);
		int expected = 10;
		assertEquals(expected, actual);
	}
}
