package com.susie.stanley.interview.polymorphism;

public class Animal {
	// 类加载时，4种方法块执行顺序为：静态块static{}、非静态块{}、构造函数、synchronized
	// 1、静态块
	static{
		System.out.println("animal静态块static{}");
	}
	// 2、非静态块
	{
		System.out.println("animal非静态块{}");
	}
	// 3、构造函数
	public Animal(){
		System.out.println("animal构造函数");
	}
	// 4、普通方法
	public void run(){
		System.out.println("animal run");
	}
}
