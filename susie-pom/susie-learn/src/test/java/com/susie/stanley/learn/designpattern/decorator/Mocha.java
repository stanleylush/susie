package com.susie.stanley.learn.designpattern.decorator;

public class Mocha extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		String description = beverage.getDescription() + " + Mocha";
		return description;
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}

}
