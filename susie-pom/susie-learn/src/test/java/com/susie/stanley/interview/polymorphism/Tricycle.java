package com.susie.stanley.interview.polymorphism;

public class Tricycle extends Cycle {

	public Tricycle() {
		super(3);
	}

	@Override
	public String getCycleName() {
		return "Tricycle";
	}

	private void mySecret(){
		System.out.println("Tricycle private method");
	}
	
	public String getMaterial(){
		return material;
	}
	
	public static void getSize(){
		System.out.println("tricycle size is 3");
	}
}
