package com.susie.stanleylus;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyPoolImpl implements MyPool {
	
	private static String jdbcDriver="";
	private static String jdbcUrl="";
	private static String userName="";
	private static String password="";
	private static int initCount;
	private static int stepSize;
	private static int poolMaxSize;

	MyPoolImpl(){
		// 初始化参数
		init();
	}
	private void init() {
		InputStream in = MyPoolImpl.class.getClassLoader().getResourceAsStream("db.properties");
		Properties properties = new Properties();
		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.jdbcDriver = properties.getProperty("jdbcDriver");
		this.jdbcUrl = properties.getProperty("jdbcUrl");
		this.userName = properties.getProperty("userName");
		this.password = properties.getProperty("password");
		this.initCount = Integer.valueOf(properties.getProperty("initCount"));
		this.stepSize = Integer.valueOf(properties.getProperty("stepSize"));
		this.poolMaxSize = Integer.valueOf(properties.getProperty("poolMaxSize"));
	}
	@Override
	public DbConnection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createConnection(int count) {
		// TODO Auto-generated method stub

	}

}
