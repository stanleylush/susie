package com.susie.stanley.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {

	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<String> f = es.submit(new CallableTest());
		System.out.println("开始：");
		try {
			System.out.println(f.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	public static class CallableTest implements Callable<String>{
		@Override
		public String call() throws Exception {
			return "你好！";
		}
	}

}
