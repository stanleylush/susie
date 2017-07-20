package com.susie.stanley.thinking.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
	
	/**
	 * 用map记录随机数产生次数
	 */
	@Test
	public void testRepeatRecord(){
		Random rand = new Random(47);
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=0; i<10000; i++){
			int key = rand.nextInt(128);
			Integer v = m.get(key);
			int value = v == null ? 1 : v+1;
			m.put(key, value);
//			if(m.containsKey(key)){
//				m.put(key, m.get(key)+1);
//			}else{
//				m.put(key, 1);
//			}
		}
		System.out.println(m);
	}

}
