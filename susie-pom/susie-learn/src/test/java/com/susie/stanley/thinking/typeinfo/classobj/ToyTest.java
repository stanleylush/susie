package com.susie.stanley.thinking.typeinfo.classobj;

public class ToyTest {
	
	public static void printInfo(Class c){
		System.out.println("Class name: " + c.getName() + " is interface? [" + c.isInterface() + "]");
		System.out.println("Simple name: " + c.getSimpleName());
		System.out.println("Canonical name: " + c.getCanonicalName());
	}
	
	public static void main(String[] args){
		Class c = null;
		try {
			// 生成对Class对象的引用
			c = Class.forName("com.susie.stanley.interview.typeinfo.classobj.FancyToy");
			// 在编译时就会检查，更安全、也更高效。
			// 不会自动执行初始化该Class对象，初始化被延迟到了对静态方法或者非常数静态域进行首次引用时才执行
			c = FancyToy.class;
		} catch (ClassNotFoundException e) {
			System.out.println("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		// 获取类实现的接口数组
		for(Class face : c.getInterfaces()){
			printInfo(face);
		}
		// 获取类继承的父类
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			// 创建一个对象，必须有默认的构造方法
			obj = c.newInstance();
		} catch (InstantiationException e) { // 如果 c 没有默认的构造方法，调用 newInstance()方法会报此错误。
			System.out.println("Can't find Instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Can't find Access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}

}
