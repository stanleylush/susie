package com.susie.stanley.learn.designpattern.decorator;

import org.junit.Test;

public class TestDecorator {

	@Test
	public void test() {
		
		Beverage beverage = new Mocha(new Mocha(new Soy(new Whip(new HouseBlend("House Blend")))));
		
		System.out.println(beverage.getDescription() + " Cost: $" + beverage.cost());
	}

}
