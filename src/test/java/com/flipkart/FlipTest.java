package com.flipkart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FlipTest {
		
		FlipkartTest f=new FlipkartTest();
		Integer[] s= {15,25,13,8};
		@Test
		public void getValue() {
			 assertEquals(f.getMin(s), 8);
		}
		
	
}
