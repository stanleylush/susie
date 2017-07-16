package com.susie.stanley.interview.proxy;

public class LazyPerson implements Person {

	@Override
	public void eat(String food) {
		System.out.println("LazyPerson I'm eating "+food);
	}

}
