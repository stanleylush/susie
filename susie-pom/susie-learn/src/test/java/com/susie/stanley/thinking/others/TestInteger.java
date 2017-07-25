package com.susie.stanley.thinking.others;

import org.junit.Test;

public class TestInteger {
	
	@Test
	public void testIntegerEquals(){
		Integer i = new Integer(5);
		Integer j = new Integer(5);
		System.out.println(i == j);
		System.out.println(i.equals(j));
		System.out.println(i.MAX_VALUE);
	}
	
	/**
	 * 自动装箱、自动拆箱
	 */
	@Test
	public void testInteger(){
		Integer a = 100; // 自动装箱，相当于 Integer.valueOf(100);
		Integer a1 = Integer.valueOf(100);
		int b = a; // 自动拆箱，相当于 a1.intValue();
		int b1 = a1.intValue();
	}
	
	/**
	 * 动装箱时的缓存问题
	 * public static Integer valueOf(int i) {
     *   assert IntegerCache.high >= 127; // 断言Integer缓存最大值>=127
     *   if (i >= IntegerCache.low && i <= IntegerCache.high)    // 1、如果输入参数在Integer缓存范围内
     *       return IntegerCache.cache[i + (-IntegerCache.low)]; // 2、取缓存中的值
     *   return new Integer(i); // 否则new一个值
     * }
     * IntegerCache.high可以在properties文件中设置
	 */
	@Test
	public void testInteger2(){
		Integer a = 127;
		Integer b = 127;
		Integer c = 128;
		Integer d = 128;
		System.out.println(a==b); // ab都是从缓存中取的值，所以==为true
		System.out.println(c==d); // 超过了缓存最大值，c、d 是两个对象，所以==为false
	}

}
