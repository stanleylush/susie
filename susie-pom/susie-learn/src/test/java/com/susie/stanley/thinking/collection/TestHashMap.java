package com.susie.stanley.thinking.collection;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestHashMap {
	
	public static void main(String[] args){
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1", "a"); // 存储
		map.put("2", "b"); // 不存储
		map.put("2", "b2"); // 存储
		map.put(null, "c"); // 不存储
		map.put(null, "c2"); // 不存储
		map.put(null, null); // 存储
		
		System.out.println(map.get("2")); // c2
		System.out.println(map.get(null) == null); // true
		System.out.println(map.get(null) == "null"); // false
	}
	
	@Test
	public void testPut(){
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1", "a");
		map.put("2", "b");
		map.put("2", "b2");
		
		System.out.println(map.get("2"));
		
	}

}
