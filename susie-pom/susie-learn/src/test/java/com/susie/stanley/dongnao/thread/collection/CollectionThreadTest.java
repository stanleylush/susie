package com.susie.stanley.dongnao.thread.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CollectionThreadTest{

	public static void main(String[] args){
		System.out.println("start");
		int count = 10;
		List<Object> list = new ArrayList<Object>();
		CountDownLatch cdl = new CountDownLatch(count);
		for(int i=0; i< count; i++){
			Thread t = new Thread(new CollectionThread(list, cdl));
			t.start();
		}
		try {
			cdl.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end "+list.size());
	}
	
}
