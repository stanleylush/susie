package com.susie.stanley.dongnao.thread;

public class ToiletLock2 {
	// 厕所-没锁
	private boolean isLocked = false;
	
	public synchronized void businessSub(int roundNo){
		// 锁了，有人在厕所，那么就等
		while(isLocked){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 没锁，上厕所，锁
		isLocked = true;
		System.out.print("(-"+roundNo+")");
		for(int i=0; i<=10; i++){
			System.out.print("-"+i);
		}
		System.out.println();
		// 上完厕所，开锁，通知他人可上厕所
		isLocked = false;
		this.notify();
	}
	
	public synchronized void businessMain(int roundNo){
		// 锁了，等
		while(isLocked){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 没锁，上厕所，锁
		isLocked = true;
		System.out.print("(-"+roundNo+")");
		for(int i=0; i<=20; i++){
			System.out.print("+"+i);
		}
		System.out.println();
		// 上完厕所，开锁，通知他人可上厕所
		isLocked = false;
		this.notify();
	}
}
