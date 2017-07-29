package com.susie.stanleylus;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class DbPoolTest {
	
	private static DbPoolImpl pool = DbPoolManager.getInstance();
	
	@Test
	public synchronized static void selectData(){
		DbConnection conn = pool.getConnection();
		ResultSet rSet = conn.queryBySql("select * from user");
		try {
			while(rSet.next()){
				System.out.println(rSet.getString(""));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
