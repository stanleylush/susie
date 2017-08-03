package com.susie.stanley.dongnao.thread.price;

import java.util.Random;

public class PriceThread {
	
	private static int price;

	public static void main(String[] args) {
		for(int i=0; i<3; i++){
			new Thread(new Runnable(){
				@Override
				public void run() {
					synchronized(PriceThread.class){
						price = new Random().nextInt(10000);
						new A().getPrice();
						new B().getPrice();
					}
				}
			}).start();
		}

	}
	
	static class A{
		public int getPrice(){
			System.out.println(Thread.currentThread().getName()+" A "+price);
			return 0;
		}
	}
	static class B{
		public int getPrice(){
			System.out.println(Thread.currentThread().getName()+" B "+price);
			return 0;
		}
	}

}
