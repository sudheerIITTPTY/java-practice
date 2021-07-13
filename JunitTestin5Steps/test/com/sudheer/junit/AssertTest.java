package com.sudheer.junit;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class AssertTest {
	
	
	@Before
	public void before() {
		System.out.print("Hello World");
	}

	@Test
	void test() {
		//to check the integer values or numberic values
		assertEquals(5,5);
		//to check boolean values
		boolean cond = true;
		assertTrue(cond);
		//assertFalse(cond);
		//for array equals(when method returns array as output)
		//assertArrayEquals(expected,actuals);
		String name = null;
		assertNull(name);
		//assertNotNull(name);
	}

}
