package com.susie.stanley.thinking.typeinfo.classliterals;

import java.util.Random;

/**
 * 编译期常量
 * .class和Class.forName()的区别
 * @author lu
 */
public class ClassInitialization {
	
	public static Random rand = new Random(47);

	public static void main(String[] args) throws ClassNotFoundException {
		Class<Initable> initable = Initable.class; // 延迟初始化
		System.out.println(Initable.staticFinal); // 调用static final变量（编译期常量）不会初始化类
		System.out.println(Initable.staticFinal2); // 调用static final变量（非编译期常量）会初始化类
		System.out.println(Initable2.staticNonFinal);// 调用static 变量会初始化类
		// 直接初始化
		Class<?> initable3 = Class.forName("com.susie.stanley.interview.typeinfo.classliterals.Initable3");
		System.out.println(Initable3.staticNonFinal);
	}

}
