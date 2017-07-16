package com.susie.stanley.interview;

import org.junit.Test;

public class StringTest {
	
	private static String a = "abc";
	private String c = "abc";
	int i = 1;

	@Test
	public void test() {
		setStr("ef");
		System.out.println(a);
		System.out.println(c);
		
		String b = "b";
		b = "bb";
		System.out.println(b);
		
		
	}
	
	private void setStr(String str){
		a = str;
	}

}
