package com.susie.stanley.blog.test;

import org.junit.Test;

public class TestSynchronized {
	private String str = "a";
	@Test
	public void testSynchronizedObjects(){
		new Thread(new Runnable(){
			@Override
			public void run() {
				getStr(str);
			}
		}).start();
		new Thread(new Runnable(){
			@Override
			public void run() {
				getStr(str);
			}
		}).start();
	}
	
	public String getStr(String lock){
		synchronized(lock){
			System.out.println(lock);
		}
		return "0";
	}
	
	public synchronized static void getStaticStr(){
		System.out.println("static");
	}

}
