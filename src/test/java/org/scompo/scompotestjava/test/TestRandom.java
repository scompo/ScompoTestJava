package org.scompo.scompotestjava.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.scompo.scompotestjava.Tester;

public class TestRandom {

	/**
	 * This test always passes! 
	 */
	@Test
	public void test() {
		assertEquals(1, 2);
	}
	
	@Test
	public void testerTest(){
		
		assertTrue(Tester.test(true));
		assertFalse(Tester.test(false));
	}

}
