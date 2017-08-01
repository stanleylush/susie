package com.susie.stanley.dongnao.thread;

/**
 * 厕所
 * @author stanleylus
 */
public class TestThread {
	// 主、子线程每1轮，轮流，主做足40次，子线程30次
	public static void main(String[] args){
		final ToiletLock toiletBusiness = new ToiletLock();
		// 子线程要求：50轮，每轮循环30次
		new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0;i<=10; i++){
					// 子线程的业务
					toiletBusiness.businessSub(i);
				}
			}
		}).start();
		// 主线程：
		for(int i=0;i<=10; i++){
			// 主线程的业务
			toiletBusiness.businessMain(i);
		}
	}
}
