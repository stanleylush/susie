package com.susie.stanley.thinking.typeinfo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @author lu
 * 14.6 反射 p336
 */
public class ShowMethods {
	
	private static String usage = "usage:\n"
			+ "ShowMethods qualified.class.name\n"
			+ "To show all methods in class or:\n"
			+ "ShowMethods qualified.class.name word\n"
			+ "To search for methods involving 'word'";

	private static Pattern p = Pattern.compile("\\w+\\.");
	
	public static void main(String[] args) {
		if(args.length < 1){
			System.out.print(usage);
			System.exit(0);
		}
		int lines = 0;
		try {
			Class<?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if(args.length == 1){
				for(Method m: methods){
					System.out.print(p.matcher(m.toString()).replaceAll(""));
				}
				for(Constructor ctor: ctors){
					System.out.print(p.matcher(ctor.toString()).replaceAll(""));
				}
			} else {
				for(Method m: methods){
					if(m.toString().indexOf(args[1]) != -1){
						System.out.print(p.matcher(m.toString()).replaceAll(""));
						lines++;
					}
				}
				for(Constructor ctor: ctors){
					if(ctor.toString().indexOf(args[1]) != -1){
						System.out.print(p.matcher(ctor.toString()).replaceAll(""));
						lines++;
					}
				}
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
