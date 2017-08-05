package com.susie.stanley.dongnao.thread.collection;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CollectionThread implements Runnable{

	private List<Object> list;
	private CountDownLatch countDL;
	
	CollectionThread(List<Object> list, CountDownLatch cdl){
		this.list = list;
		this.countDL = cdl;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			list.add(new Object());
		}
		System.out.println(Thread.currentThread().getName()+" "+list.size());
		countDL.countDown();
	}
	
}
