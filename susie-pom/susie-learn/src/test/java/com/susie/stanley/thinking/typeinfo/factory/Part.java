package com.susie.stanley.thinking.typeinfo.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part {
	
	private static Random rand = new Random(47);
	public static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
	
	static{
		
	}
	
	public String toString(){
		return getClass().getSimpleName();
	}
	
	public static Part createRandom(){
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}
