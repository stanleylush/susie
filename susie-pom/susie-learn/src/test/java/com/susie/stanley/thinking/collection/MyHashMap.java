package com.susie.stanley.thinking.collection;

public interface MyHashMap<K, V> {

	public V put(K key, V value);
	
	public V get(K key);
	
	int size();
	
	interface MyEntry<K, V>{
		
		public K getKey();
		
		public V getValue();
	}
}
