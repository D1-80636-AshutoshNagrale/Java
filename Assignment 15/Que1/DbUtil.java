package Que1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Core Java @ Sunbeam DAC Sep 2023 Author: Nilesh Ghule
 * <nilesh@sunbeaminfo.com> Time: 2023-11-06 08:59
 */

public class DbUtil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/java";
	public static final String DB_USER = "D1_80636_Ashutosh";
	public static final String DB_PASSSWD = "80636";

	static {
		System.out.println("DbUtil static block got executed");
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSSWD);
		return con;
	}
}
