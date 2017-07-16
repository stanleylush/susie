package com.susie.stanley.interview;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class MyClassLoaderTest {

	@Test
	public void test() {
		
		MyClassLoader myClassLoader = new MyClassLoader("/Users/lu/mycode/code");
		
		try {
			Class c = myClassLoader.loadClass("LoadMe");
			if(c != null){
				try {
					Object obj = c.newInstance();
					Method method = c.getDeclaredMethod("get", null);
					method.invoke(obj, null);
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
