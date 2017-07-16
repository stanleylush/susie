package com.susie.stanley.interview.polymorphism;

public class Cycle {
	
	public int wheelsNum;
	public String cycleName;
	public String material;
	
	public Cycle(){
		
	}

	public Cycle(int num){
		this.wheelsNum = num;
	}
	public Cycle(String name){
		this.cycleName = name;
	}
	
	public void getWheels(){
		System.out.println("我在骑"+getCycleName()+"自行车");
	}
	
	public String getCycleName(){
		return cycleName;
	}
	
	public String getMaterial(){
		return material;
	}
	
	public static void getSize(){
		System.out.println("cycle size is 0");
	}
	
	/**
	 * 用来测试：父类的private方法，子类不能继承，不能动态加载，所以无法实现多态
	 */
	private void mySecret(){
		System.out.println("Cycle private method");
	}
	
	public static void main(String[] args){
		Cycle cycle = new Unicycle();
		cycle.mySecret();
	}
}
