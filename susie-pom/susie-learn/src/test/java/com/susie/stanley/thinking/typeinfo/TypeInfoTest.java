package com.susie.stanley.thinking.typeinfo;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.susie.stanley.thinking.typeinfo.classobj.ToyTest;

public class TypeInfoTest {

	/**
	 * RTTI：在运行时，识别一个对象类型
	 */
	@Test
	public void RTTItest() {
		List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle());
		for(Shape shape:shapes){
			shape.draw();
		}
	}
	
	/**
	 * Class类的部分方法
	 * 	1、Class.forName()
	 * 	2、class.getInterfaces()
	 * 	3、class.getSuperclass()
	 * 	4、object.getClass()
	 * Class --> Object
	 * 	Object obj = class.newInstance()
	 */
	@Test
	public void ClassObjTest(){
		Class c = null;
		try {
			c = Class.forName("com.susie.stanley.interview.typeinfo.classobj.FancyToy"); // 1、获取一个Class对象引用
		} catch (ClassNotFoundException e) {
			System.out.println("Can't find FancyToy!");
			System.exit(1);
		}
		ToyTest.printInfo(c);
		// get interface
		for(Class iface : c.getInterfaces()){ // 2、获取一个Class对象引用
			ToyTest.printInfo(iface);
		}
		// get supper class
		Class sup = c.getSuperclass(); // 3、获取一个Class对象引用
		Object obj = null;
		try {
			obj = sup.newInstance(); // 获取一个实例
		} catch (InstantiationException e) {
			System.out.println("Can't instantiate!");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Can't access!");
			System.exit(1);
		}
		ToyTest.printInfo(obj.getClass()); // 4、获取一个Class对象引用
	}

}
