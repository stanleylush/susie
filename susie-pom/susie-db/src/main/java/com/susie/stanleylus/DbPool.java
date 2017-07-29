package com.susie.stanleylus;

public interface DbPool {
	
	public DbConnection getConnection();
	
	public void createConnection(int count);

}
