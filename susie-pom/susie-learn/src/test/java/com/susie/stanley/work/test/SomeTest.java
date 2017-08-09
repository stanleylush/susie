package com.susie.stanley.work.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
	
	@Test
	public void testExceptionReturn(){
		System.out.println(exceptionReturn2());
	}
	
	private String exceptionReturnCatch(){
		try {
			FileInputStream file = new FileInputStream("a");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "return from catch";
		}
		return "1";
	}
	
	private String exceptionReturn2(){
		
		String[] strs = new String[1];
		strs[0] = "0";
		try{
			strs[1] = "1";
		}catch(Exception e){
			e.getStackTrace();
		}
		
		return strs[0];
	}

}
