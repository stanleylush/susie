package com.susie.stanley.jvm;

public class AllotationTest {

	public static final int _1MB = 1024*1024;
	
	public static void main(String[] args) {
		testAllotation();
	}
	/**
	 * VM参数： -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 * 			-XX:PretenureSizeThreshold=3145728
	 * */
	public static void testPretenureSizeThreshold(){
		byte[] allocation = new byte[4 * _1MB]; // >3m，直接分配到老年代
	}
	/**
	 * VM参数： -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
	 * java堆20m不可扩展，Eden 10m，老年代10m，Eden:Survivor 8:1
	 * */
	public static void testAllotation(){
		byte[] allocation1, allocation2, allocation3, allocation4;
		allocation1 = new byte[2 * _1MB];
		allocation2 = new byte[2 * _1MB];
		allocation3 = new byte[2 * _1MB];
		allocation4 = new byte[4 * _1MB]; // 出现一次Minor GC
	}
}
