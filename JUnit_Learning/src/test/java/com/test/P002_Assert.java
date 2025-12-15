package com.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class P002_Assert {
	@Test
	public void test1() {
		System.out.println("test 1 method");
	}

	@Test
	public void test2() {
//		assertEquals(12,10);
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 1, 2, 3, 4 };
//		assertArrayEquals(a, b);
//		assertTrue(false);
		System.out.println("test 2 method");
	}

	@Test
	public void test3() {
		System.out.println("test 3 method");
	}
}
