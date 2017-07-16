package com.susie.stanley.interview.proxy;

/**
 * 静态代理
 * @author lu
 */
public class PersonStaticProxy implements Person {

	private Person person;
	
	/**
	 * @param person // 被代理的对象
	 */
	public PersonStaticProxy(Person person){
		this.person = person;
	}
	
	@Override
	public void eat(String food) {
		washHand();
		this.person.eat("");
		comment();
	}
	
	public void washHand(){
		System.out.println("wash hand before eat");
	}
	
	public void comment(){
		System.out.println("comment after eat");
	}

}
