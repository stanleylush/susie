package com.susie.stanley.thinking.typeinfo.classliterals;

public class Initable {
	
	static final int staticFinal = 47; // 编译期常量
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	static{
		System.out.println("Initializing Initable");
	}

}
