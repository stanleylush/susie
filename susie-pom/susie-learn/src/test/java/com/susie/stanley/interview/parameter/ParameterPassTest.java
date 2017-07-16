package com.susie.stanley.interview.parameter;

import org.junit.Test;

/**
 * 参数传递
 * @author lu
 */
public class ParameterPassTest {
	
	public int num = 10;
	public String str = "hello";
	public Integer integer = new Integer(11);
	public StringBuffer strb = new StringBuffer("I");
	
	public void changeParameter(int i, String s, Integer in, StringBuffer sb){
		i = 20;
		s = "hi";
		// in = new Integer(22); // in = 22;
		in = in+1;
		sb.append("'am ok");
	}
	
	/**
	 * 传递前：num=10 str=hello integer=11 strb=I
	 * 传递后：num=10 str=hello integer=11 strb=I'am ok
	 * 1、基本数据类型、包装类、String：值拷贝
	 * 2、对象：地址拷贝
	 */
	@Test
	public void changeParameterTest(){
		System.out.println("传递前：num="+num+" str="+str+" integer="+integer+" strb="+strb);
		changeParameter(num, str, integer, strb);
		System.out.println("传递后：num="+num+" str="+str+" integer="+integer+" strb="+strb);
	}

}
