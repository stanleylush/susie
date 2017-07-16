package com.susie.stanley.thinking.typeinfo;

public abstract class Shape {
	
	public void draw(){
		System.out.println(this +".draw()");
	}
	
	public abstract String toString();

}
