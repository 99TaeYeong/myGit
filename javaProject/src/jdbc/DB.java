package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
	public static Connection oraConn() {
		Connection conn = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\driver\\oracle.prop");
			//key와 value를 세트로 저장
			Properties prop = new Properties();
			prop.load(fis);
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String passwd = prop.getProperty("pwd");
			//DB접속
			conn=DriverManager.getConnection(url,id,passwd);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}
}
