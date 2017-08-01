package com.susie.stanley.dongnao.thread;

/**
 * 主、子上厕所
 * @author stanleylus
 */
public class ToiletLock {
	// 厕所-没锁
	private boolean isSub = true;
	
	public synchronized void businessSub(int roundNo){
		// 锁了，有人在厕所，那么就等
		while(!isSub){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 没锁，上厕所，锁
		System.out.print("(-"+roundNo+")");
		for(int i=0; i<=10; i++){
			System.out.print("-"+i);
		}
		System.out.println();
		// 上完厕所，开锁，通知他人可上厕所
		isSub = false;
		this.notify();
	}
	
	public synchronized void businessMain(int roundNo){
		// 锁了，等
		while(isSub){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 没锁，上厕所
		System.out.print("(+"+roundNo+")");
		for(int i=0; i<=20; i++){
			System.out.print("+"+i);
		}
		System.out.println();
		// 上完厕所，开锁，通知他人可上厕所
		isSub = true;
		this.notify();
	}
}
