package com.susie.stanley.jvm;

public class TestJVM {

	// java 
	
	public static void main(String[] args) {
		ClassLoader cl = TestJVM.class.getClassLoader();
		System.out.println(cl);
		System.out.println(cl.getParent());
		
		
	}

}
