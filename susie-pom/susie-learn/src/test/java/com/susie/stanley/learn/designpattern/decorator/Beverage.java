package com.susie.stanley.learn.designpattern.decorator;

public abstract class Beverage {
	
	public String description;
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();

}
