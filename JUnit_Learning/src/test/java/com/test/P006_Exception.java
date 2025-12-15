package com.test;

import org.junit.Test;

public class P006_Exception {
	@Test
	public void test1() {
		System.out.println("test 1");
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test2() {
//		int i = 10 / 0;
		int a[] = { 1, 2, 3, 4 };
		System.out.println("test 2 : " + a[5]);
	}
}
