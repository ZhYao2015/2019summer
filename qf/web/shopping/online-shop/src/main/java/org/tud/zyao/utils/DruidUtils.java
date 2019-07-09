package org.tud.zyao.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;

@SuppressWarnings("deprecation")
public class DruidUtils {
	
	private static DruidDataSource dds;
	
	static {
		dds=new DruidDataSource();
		InputStream is=DruidUtils.class.getClassLoader().getResourceAsStream("database.properties");
		
		Properties properties=new Properties();
		try {
			properties.load(is);
			//dds.setDriverClassName(properties.getProperty("driverClassName"));
			dds.setUrl(properties.getProperty("url"));
			dds.setUsername(properties.getProperty("username"));
			dds.setPassword(properties.getProperty("password"));
			dds.setInitialSize(Integer.parseInt(properties.getProperty("initialSize")));
			dds.setMaxActive(Integer.parseInt(properties.getProperty("maxActive")));
			dds.setMaxIdle(Integer.parseInt(properties.getProperty("maxIdle")));
			dds.setMinIdle(Integer.parseInt(properties.getProperty("minIdle")));
			
			dds.setMaxWait(Long.parseLong(properties.getProperty("maxWait")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static DataSource getDataSource() {
		return dds;
	}
	
	public static Connection getConnection(){
		try {
			return dds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
