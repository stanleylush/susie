package com.susie.stanley.interview.polymorphism;

public class ZoonPark {
	
	Animal dog  = new Animal();

	// 1、静态块
	static{
		System.out.println("ZoonPark 静态块static{}");
	}
	// 2、非静态块
	{
		System.out.println("ZoonPark 非静态块{}");
	}
	// 3、构造函数
	public ZoonPark(){
		System.out.println("ZoonPark 构造函数");
	}
	// 4、普通方法
	public void lightshow(){
		System.out.println("ZoonPark 普通方法");
	}

}
