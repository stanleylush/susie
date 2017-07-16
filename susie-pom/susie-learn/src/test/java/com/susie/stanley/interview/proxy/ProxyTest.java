package com.susie.stanley.interview.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;

public class ProxyTest {
	
	/**
	 * 静态代理调用
	 */
	@Test
	public void staticProxyTest(){
		LazyPerson lazy = new LazyPerson();
		Person person = new PersonStaticProxy(lazy);
		person.eat("shit");
	}
	
	/**
	 * 动态代理实现
	 */
	@Test
	public void dynamicProxyTest(){
		LazyPerson lazy = new LazyPerson();
		Class lazyClass = lazy.getClass();
		InvocationHandler handler = new PersonDynamicProxy(lazy);
		Person lazyPerson = (Person) Proxy.newProxyInstance(lazyClass.getClassLoader(), 
				lazyClass.getInterfaces(), handler);
		lazyPerson.eat("meet");
	}

}
