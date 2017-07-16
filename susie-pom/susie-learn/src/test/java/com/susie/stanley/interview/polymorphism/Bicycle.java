package com.susie.stanley.interview.polymorphism;

public class Bicycle extends Cycle {

	public Bicycle() {
		super(2);
	}

	@Override
	public String getCycleName() {
		return "Bicycle";
	}
	
	private void mySecret(){
		System.out.println("Bicycle private method");
	}
	
	public String getMaterial(){
		material = "bi";
		return material;
	}
	
	public static void getSize(){
		System.out.println("bicycle size is 2");
	}
}
