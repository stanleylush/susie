package com.susie.stanley.interview.polymorphism;

import java.util.Random;

import org.junit.Test;

/**
 * 多态：java通过方法调用动态绑定的能力，来实现多态。编译父类，运行子类。</br>
 * 1、简化代码：不用重载多个方法</br>
 * 2、避免修改，易扩展：避免修绑定父类的方法</br>
 * <strong>除了static,final方法（构造函数相当于static，private相当于final），其它方法都是动态绑定</strong></br>
 * <strong>全局变量不具有多态性</strong></br>
 * <strong>编写只与父类打交道的方法，来运行子类的行为。</strong>
 * */
public class Polymorphism {

	/**
	 * new 父类，方法块在动态加载时的执行顺序
	 * animal静态块static{}
	 * animal非静态块{}
	 * animal构造函数
	 * animal run
	 */
	@Test
	public void supChunkOrder(){
		Animal a = new Animal();
		a.run();
	}
	/**
	 * new 子类，方法块在动态加载时的执行顺序
	 * animal静态块static{}
	 * dog 静态块static{}
	 * animal非静态块{}
	 * animal构造函数
	 * dog 非静态块{}
	 * dog 构造函数
	 * dog run
	 */
	@Test
	public void subChunkOrder(){
		Dog d = new Dog();
		d.run();
	}
	/**
	 * 父类引用子类对象，方法块在动态加载时的执行顺序
	 * animal静态块static{}
	 * dog 静态块static{}
	 * animal非静态块{}
	 * animal构造函数
	 * dog 非静态块{}
	 * dog 构造函数
	 * dog run
	 */
	@Test
	public void subChunkOrder2(){
		Animal ad = new Dog();
		ad.run();
	}
	/**
	 * 组合、聚合结构，方法块动态加载顺序
	 */
	@Test
	public void componetChunkOrder(){
		ZoonPark zoon = new ZoonPark();
		zoon.lightshow();
	}
	/**
	 * 普通类的多态
	 */
	@Test
	public void getCycleName(){
		Cycle cycle = new Unicycle();
		cycle.getWheels();
	}
	/**
	 * 数组，具有多态性
	 * 参数，多态
	 * generateCycle()返回值，多态
	 */
	@Test
	public void rideCycleTest(){
		Cycle[] cycles = cycleFactory();
		for(int i=0; i<cycles.length;i++){
			rideCycle(cycles[i]);
		}
	}
	/**
	 * 全局变量，不具有多态性
	 */
	@Test
	public void testField(){
		Cycle cycle1 = new Unicycle();
		System.out.println(cycle1.material);
		System.out.println(cycle1.getMaterial());
		Cycle cycle2 = new Bicycle();
		System.out.println(cycle2.material);
		System.out.println(cycle2.getMaterial());
	}
	/**
	 * 静态方法，不具有多态性
	 */
	@Test
	public void testStatic(){
		Cycle cycle = new Unicycle();
		cycle.getSize();
	}
	
	/**
	 * 构造函数与多态：1、引用记数
	 */
	@Test
	public void referenceCount(){
		Shared shared = new Shared();
		Composing[] composings = {new Composing(shared),
				new Composing(shared),new Composing(shared),
				new Composing(shared),new Composing(shared)};
		for(Composing c: composings){
			c.dispose();
		}
	}
	/**
	 * 构造函数与多态：2、父类构造函数调用未完全实例化的对象的被覆盖的方法
	 */
	@Test
	public void constructorCallMethod(){
		new RoundGlyph(5);
	}
//-------------- private method ------------------------------------
	/**
	 * 骑几轮自行车，参数多态
	 * 调用父类独有方法，重写此方法调用的一个方法，会发生多态现象
	 * @param cycle
	 */
	private void rideCycle(Cycle cycle){
		cycle.getWheels();
	}
	
	/**
	 * 制造自行车，返回值多态
	 * @return
	 */
	private Cycle[] cycleFactory(){
		Cycle[] cycles = new Cycle[3];
		for(int i=0; i<cycles.length; i++){
			cycles[i] = generateCycle();
		}
		return cycles;
	}
	
	/**
	 * 随机生成子类
	 * @return
	 */
	private Cycle generateCycle(){
		Random r = new Random(47);
		switch(r.nextInt(3)){
			default:
			case 0: return new Unicycle();
			case 1: return new Bicycle();
			case 2: return new Tricycle();
		}
	}

}
