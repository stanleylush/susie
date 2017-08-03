package com.susie.stanley.dongnao.thread.price;

import java.util.Random;

public class PriceThreadLocal {
	// 空间换时间，将值set到当前线程到map中
	private static ThreadLocal<Integer> priceTL = new ThreadLocal<Integer>();

	public static void main(String[] args) {
		for(int i=0; i<3; i++){
			new Thread(new Runnable(){
				@Override
				public void run() {
					int price = new Random().nextInt(10000);
					priceTL.set(price);
					new A().getPrice();
					new B().getPrice();
				}
			}).start();
		}

	}
	
	static class A{
		public int getPrice(){
			int price = priceTL.get();
			System.out.println(Thread.currentThread().getName()+" A "+price);
			return 0;
		}
	}
	static class B{
		public int getPrice(){
			int price = priceTL.get();
			System.out.println(Thread.currentThread().getName()+" B "+price);
			return 0;
		}
	}

}
