package com.susie.stanley.interview.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonDynamicProxy implements InvocationHandler {
	
	private Object obj;
	/**
	 * 为代理关联被代理对象
	 * @param obj // 被代理的对象
	 */
	public PersonDynamicProxy(Object obj){
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		washHand();
		method.invoke(obj, args); // 调用被代理对象的方法，同时以数组形式传入该方法的参数
		comment();
		return null;
	}

	public void washHand(){
		System.out.println("wash hand before eat");
	}
	
	public void comment(){
		System.out.println("comment after eat");
	}
}
