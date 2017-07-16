package com.susie.stanley.interview;

import org.junit.Ignore;
import org.junit.Test;

public class MemoryTest {
	
	/**
	 * 内存溢出
	 */
	@Ignore
	@Test
	public void test(){
		String str = "";
		for(int i=0; i<Integer.MAX_VALUE; i++){
			str = str + "abc";
			System.out.println(str);
			System.out.println(i);
		}
		str = null;
	}

}
