package com.susie.stanley.interview.polymorphism;

public class RoundGlyph extends Glyph {
	
	private int radius = 1;
	
	public RoundGlyph(int r){
		this.radius = r;
		System.out.println("RoundGlyph.RoundGlyph() redius=" + this.radius);
	}
	
	public void draw(){
		System.out.println("RoundGlyph.draw() redius=" + this.radius);
	}

}
