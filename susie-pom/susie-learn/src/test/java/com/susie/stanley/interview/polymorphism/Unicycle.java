package com.susie.stanley.interview.polymorphism;

public class Unicycle extends Cycle {
	
	public String material = "uni";
	
	public Unicycle() {
		super(1);
	}
	
	public String getCycleName(){
		return "Unicycle";
	}
	
	private void mySecret(){
		System.out.println("Unicycle private method");
	}
	
	public String getMaterial(){
		return material;
	}
	
	public static void getSize(){
		System.out.println("unicycle size is 1");
	}
}
