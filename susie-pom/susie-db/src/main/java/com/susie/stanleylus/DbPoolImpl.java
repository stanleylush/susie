package com.susie.stanleylus;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;

public class DbPoolImpl implements DbPool {
	
	private static String jdbcDriver="";
	private static String jdbcUrl="";
	private static String userName="";
	private static String password="";
	private static int initCount;
	private static int stepSize;
	private static int poolMaxSize;
	// 连接池管道集合
	private static Vector<DbConnection> dbConnectionPool = new Vector<DbConnection>();
	
	DbPoolImpl(){
		// 初始化参数
		init();
	}
	
	private void init() {
		InputStream in = DbPoolImpl.class.getClassLoader().getResourceAsStream("db.properties");
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
		
		try {
			// 驱动
			Driver driver = (Driver) Class.forName(jdbcDriver).newInstance();
			DriverManager.registerDriver(driver);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		createConnection(stepSize);
	}
	@Override
	public DbConnection getConnection() {
		if(dbConnectionPool.size() <= 0){
			throw new RuntimeException("数据库连接池为空，没有可用管道！");
		}
		DbConnection conn = getConnectionFromPool();
		// 并发情况下判断
		while(conn == null){
			createConnection(stepSize);
			conn = getConnectionFromPool();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

	/**
	 * 从连接池中获取有效并且未被占用的管道
	 * @return
	 */
	private synchronized DbConnection getConnectionFromPool() {
		for(DbConnection conn:dbConnectionPool){
			// 判断管道是否被占用
			if(!conn.isBusy()){
				Connection connection = conn.getConnection();
				try {
					// 判断管道是否有效，如果无效则新建替换
					if(!connection.isValid(2000)){
						Connection connTemp = DriverManager.getConnection(jdbcUrl, userName, password);
						conn.setConnection(connTemp);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				conn.setBusy(true);
				return conn;
			}
		}
		return null;
	}
	@Override
	public void createConnection(int count) {
		if(poolMaxSize > 0 && dbConnectionPool.size()+count > poolMaxSize){
			throw new RuntimeException("创建管道失败，超过最大管道数！");
		}
		// 创建连接管道，放到连接池中
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
			DbConnection conn = new DbConnection(connection, false);
			dbConnectionPool.add(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
