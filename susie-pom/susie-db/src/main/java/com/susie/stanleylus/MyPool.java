package com.susie.stanleylus;

public interface MyPool {
	
	public DbConnection getConnection();
	
	public void createConnection(int count);

}
