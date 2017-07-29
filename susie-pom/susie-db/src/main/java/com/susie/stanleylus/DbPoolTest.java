package com.susie.stanleylus;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DbPoolTest {
	
	private static DbPoolImpl pool = DbPoolManager.getInstance();
	
	public synchronized static void selectData(){
		DbConnection conn = pool.getConnection();
		ResultSet rSet = conn.queryBySql("select * from acc_earn_type");
		try {
			while(rSet.next()){
				System.out.println(rSet.getString("earn_type_name"));
			}
			rSet.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		for(int i=0; i<20; i++){
			new Thread(new Runnable(){
				@Override
				public void run() {
					selectData();
				}
			}).start();
		}
	}
	
}
