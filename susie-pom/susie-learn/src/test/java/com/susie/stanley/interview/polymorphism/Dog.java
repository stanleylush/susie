package com.susie.stanley.interview.polymorphism;

public class Dog extends Animal {
	
	int i = 0;
	static int is = 0;
	Integer ier = new Integer(0);
	static Integer iers = new Integer(0);
	String str = "";
	static String strs = "";
	// 1、静态块
	static{
		System.out.println("dog 静态块static{}");
		is = 1;
		iers = new Integer(1);
		strs = "1";
		System.out.println("dog is="+is+";iers="+iers+";strs="+strs);
	}
	// 2、非静态块
	{
		System.out.println("dog 非静态块{}");
		i = 2;
		is = 2;
		ier = new Integer(2);
		iers = new Integer(2);
		str = "2";
		strs = "2";
		System.out.println("dog i="+i+";is="+is+";ier="+ier+";iers="+iers+";str="+str+";strs="+strs);
	}
	// 3、构造函数
	public Dog(){
		System.out.println("dog 构造函数");
		i = 3;
		is = 3;
		ier = new Integer(3);
		iers = new Integer(3);
		str = "3";
		strs = "3";
		System.out.println("dog i="+i+";is="+is+";ier="+ier+";iers="+iers+";str="+str+";strs="+strs);
	}
	// 4、普通方法
	public void run(){
		System.out.println("dog run");
		i = 4;
		is = 4;
		ier = new Integer(4);
		iers = new Integer(4);
		str = "4";
		strs = "4";
		System.out.println("dog i="+i+";is="+is+";ier="+ier+";iers="+iers+";str="+str+";strs="+strs);
	}
	public void bark(){
		System.out.println("dog bark");
	}

}
