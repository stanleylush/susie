package com.susie.stanleylus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	// 封装JDK提供管道对象
	private Connection connection;
	// 是否被占用
	private boolean isBusy = false;
	
	DbConnection(Connection conn, boolean isBusy){
		this.connection = conn;
		this.isBusy = isBusy;
	}
	// 释放链接
	public void close(){
		this.isBusy = false;
	}
	
	public ResultSet queryBySql(String sql){
		ResultSet rs = null;
		Statement sm = null;
		
		try {
			sm = this.connection.createStatement();
			rs = sm.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	public boolean isBusy() {
		return isBusy;
	}
	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}
}
