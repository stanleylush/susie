package com.susie.stanley.thinking.collection;

import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

/**
 * Iterable 接口被 foreach 用来在序列中移动
 * @author lu
 *
 */
public class TestIterator implements Iterable<String> {

	protected String[] words = ("s t a n l e y l u s").split(" ");
	
	public Iterator<String> iterator(){
		return new Iterator<String>(){
			private int index = 0;
			public boolean hasNext(){
				return index < words.length;
			}
			public String next(){
				return words[index++];
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	
	@Test
	public void test(){
		for(String s: new TestIterator()){
			System.out.print(s);
		}
	}
	
	/**
	 * System.getenv().entrySet();
	 * 	Map<String, String> . Set<Entry<String,String>>
	 */
	@Test
	public void testIteratorMap(){
		for(Map.Entry entry: System.getenv().entrySet()){
			System.out.println(entry.getKey()+"："+entry.getValue());
		}
	}

}
