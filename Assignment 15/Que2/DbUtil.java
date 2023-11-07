
//2. Create an UserDAO class. Implement CRUD operations (similar to CandidateDAO)

package Que2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/java";
	public static final String DB_USER = "D1_80636_Ashutosh";
	public static final String DB_PASSWD = "80636";

	static {// on class loading only....static block will be executed
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
		return con;
	}
}
