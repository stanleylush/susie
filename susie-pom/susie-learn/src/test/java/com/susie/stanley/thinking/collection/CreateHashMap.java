package com.susie.stanley.thinking.collection;

/**
 * 自己手动写hashMap
 * @author lu
 *
 * @param <K>
 * @param <V>
 */
public class CreateHashMap<K,V> implements MyHashMap<K,V> {
	
	/**
	 * hash 任意长度 映射规则 固定长度
	 * 
	 * hash表 找数据
	 * 	1、找下标，key经过hash后，生成数组下标：int index = hash(key);
	 * 		1.1、莫取余 int index = key%m; （m=比数组长度小的最大质数）
	 * 			Array arr; arr.length = 16; m=15;
	 * 			key=1;  value=23; index=1%15=1;  arr[1] = 23;
	 * 			key=16; value=44; index=16%15=1; arr[1] = 44;
	 * 		1.2、处理表冲突
	 * 			1.2.1、线性探测，指定步长，直到找到下个步长为空的位置
	 * 			1.2.2、链表，
	 * 	2、取数据，通过数组下标找到value：int value = arr[index]; // O(n)
	 * 
	 * 1、无序
	 * 2、需要更多空间
	 * 
	 * */
	
	private static Integer defaultLength = 16; // 2的倍数
	private static double defaultLoad = 0.75; // 负载因子
	private Entry<K,V>[] table = null;
	private int size = 0;
	
	CreateHashMap(){
		this(defaultLength, defaultLoad);
	}
	
	CreateHashMap(int defaultLength, double defaultLoad){
		this.defaultLength = defaultLength;
		this.defaultLoad = defaultLoad;
		table = new Entry[defaultLength];
	}
	
	/**
	 * 获取下标
	 * @param key
	 * @return
	 */
	private int getIndex(K key){
		int m = this.defaultLength - 1;
		return key.hashCode() % m;
	}

	@Override
	public V put(K key, V value) {
		// 获取数组下标
		int index = this.getIndex(key);
		// 根据数组下标，判断该位置是否有数据
		Entry<K,V> e = table[index];
		if(null == e){
			table[index] = new Entry(key, value, null, index);
			size ++;
		}else {
			Entry newEntry = new Entry(key, value, e, index);
			table[index] = newEntry;
		}
		return null;
	}

	@Override
	public V get(K key) {
		int index = this.getIndex(key);
		return table[index] == null? null : table[index].getValue();
	}

	@Override
	public int size() {
		return size;
	}
	
	class Entry<K,V> implements MyEntry<K,V>{
		
		K key;
		V value;
		Entry<K,V> next;
		int index; // 数组下标

		Entry(K k, V v, Entry<K,V> n, int i){
			key = k;
			value = v;
			next = n;
			index = i;
		}
		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}
		
	}
}
