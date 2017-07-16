package com.susie.stanley.interview.polymorphism;

public class Shared {

	private int refcount = 0; // 引用数
	private static long counter = 0; // 实例数，类级别的计数器，所有实例共享此变量
	private final long id = counter++; // 实例ID，定义为final,为每个实例指定不可改变的ID值
	
	public Shared(){
		System.out.println("Creating " + this);
	}
	
	public void addRef(){
		refcount++;
	}
	
	protected void dispose(){
		if(--refcount == 0){
			System.out.println("Disposing " + this);
		}
	}
	
	public String toString(){
		return "Shared " + id;
	}
	
}
