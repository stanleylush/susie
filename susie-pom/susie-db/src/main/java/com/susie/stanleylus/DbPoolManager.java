package com.susie.stanleylus;

/**
 * 通过内部类单例模式，维护数据库链接
 * @author stanleylus
 */
public class DbPoolManager {
	
	private static class CreatePool{
		private static DbPoolImpl pool = new DbPoolImpl();
	}
	
	public static DbPoolImpl getInstance(){
		return CreatePool.pool;
	}

}
