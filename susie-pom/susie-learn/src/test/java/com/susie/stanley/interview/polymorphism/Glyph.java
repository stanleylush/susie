package com.susie.stanley.interview.polymorphism;

public class Glyph {
	
	public Glyph(){
		System.out.println("Glyph() before draw()");
		draw(); // 此时此方法未完成实例化
		System.out.println("Glyph() before draw()");
	}
	
	public void draw(){
		System.out.println("Glyph draw()");
	}

}
