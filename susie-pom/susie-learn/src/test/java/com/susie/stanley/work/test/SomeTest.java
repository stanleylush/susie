package com.susie.stanley.work.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SomeTest {
	
	@Test
	public void testEachListNull(){
		List<String> strs = null;
		for(String str: strs){
			System.out.println(str);
		}
	}
	
	@Test
	public void testEachListAddNull(){
		List<String> strs = new ArrayList<String>();
		strs.add(null);
		for(String str: strs){
			System.out.println(str);
		}
	}
	
	@Test
	public void testEachListSize0(){
		List<String> strs = new ArrayList<String>();
		for(String str: strs){
			System.out.println(str);
		}
	}
	
	@Test
	public void testStringEquals(){
		String a = "1";
		System.out.println(a.equals("1"));
		System.out.println(a.equals(null));
	}

}
