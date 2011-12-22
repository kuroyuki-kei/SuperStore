package com.superstore.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

import com.mysql.jdbc.Connection;
import com.superstore.servlets.SuperStoreConstant;

@SuppressWarnings("restriction")
public class DatabaseFactory {
	private static DatabaseFactory dbFactory = new DatabaseFactory();
	private static ConfigurationFileReader databaseConfigFile = ConfigurationFileReader
			.getInstance().readFile();
	private static HashMap<String, String> databaseConfig = databaseConfigFile
			.readDatabaseHashMapProperties();

	static {
		try {
			System.out.println(databaseConfig.get("jdbcDriver"));
			System.out.println(databaseConfig
					.get(SuperStoreConstant.JDBCDRIVER));
			Class.forName(databaseConfig.get(SuperStoreConstant.JDBCDRIVER));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DatabaseFactory getInstance() {
		return dbFactory;
	}

	public Connection getConnection() {

		System.out.println(SuperStoreConstant.DBURL);

		try {

			Connection con = (Connection) DriverManager.getConnection(
					databaseConfig.get(SuperStoreConstant.DBURL),
					databaseConfig.get(SuperStoreConstant.DBUSER),
					databaseConfig.get(SuperStoreConstant.DBPASSWORD));

			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
