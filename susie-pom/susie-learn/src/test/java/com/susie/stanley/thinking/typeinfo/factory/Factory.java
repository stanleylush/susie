package com.susie.stanley.thinking.typeinfo.factory;

/**
 * @author lu
 * 14.4 注册工厂 p332
 * @param <T>
 */
public interface Factory<T> {
	
	public T create();

}
