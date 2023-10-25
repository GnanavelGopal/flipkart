package com.flipkart;

import java.util.Arrays;
import java.util.List;

public class FlipkartTest {
	public int getMin(Integer[] a) {
		List<Integer> m=Arrays.asList(a);
		int b=m.stream().min(Integer::compare).get();
		return b;
	}
}
