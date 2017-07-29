package com.susie.stanleylus;

/**
 * 通过内部类单例模式，维护数据库链接
 * @author stanleylus
 */
public class PoolManager {
	
	private static class CreatePool{
		private static MyPoolImpl pool = new MyPoolImpl();
	}
	
	public static MyPoolImpl getInstance(){
		return CreatePool.pool;
	}

}
