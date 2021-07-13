package com.sudheer.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.sudheer.junit.MyMath;

class MyMathTest {

	MyMath myMath = new MyMath();
	@Before
	public void before() {
		System.out.println("Before method");
	}
	@After
	public void after() {
		System.out.println("After method");
	}
	@Test
	void testWith1Number() {
		System.out.println("Test 1");
		assertEquals(1,myMath.sum(new int[] {1}));
	}
	@Test
	void testWith2Number() {
		System.out.println("Test 2");
		assertEquals(3,myMath.sum(new int[] {1,2}));
	}
	@Test
	void testOf3Numbers() {
		System.out.println("Test 3");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}

}
