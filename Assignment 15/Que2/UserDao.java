package Que2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements AutoCloseable {

	private Connection con;
	private PreparedStatement stmt1;// createUser;
	private PreparedStatement stmt2;// showAllUsers;
	private PreparedStatement stmt3;// updateUser;
	private PreparedStatement stmt4;// deleteUserById;
	private PreparedStatement stmt5;// findUserById;

	public UserDao() throws Exception {
		con = DbUtil.getConnection();
		stmt1 = con.prepareStatement("insert into users values (default,?,?,?,?,?,?,?)");
		stmt2 = con.prepareStatement("select * from users");
		stmt3 = con.prepareStatement(
				"update users set first_name=?,last_name=?,email=?,password=?,dob=?,status=?,role=? where id=?");
		stmt4 = con.prepareStatement("delete from users where id=?");
		stmt5 = con.prepareStatement("select * from users where id=?");
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<User> displayAllUsers() throws Exception {

		List<User> list = new ArrayList<User>();

//		try (stmt1 = con.prepareStatement(sql)) {              inside try with resource you cannot use variables or fields
//			try(ResultSet rs = stmt1.executeQuery()){
//			while (rs.next()) {
//				list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
//						rs.getDate(6), rs.getBoolean(7), rs.getString(8)));
//			}
//			}
//			return list;

		ResultSet rs = stmt2.executeQuery();
		while (rs.next()) {
			list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getDate(6), rs.getBoolean(7), rs.getString(8)));
		}
		return list;
	}

	public User displayUserById(int id) throws Exception {

		stmt5.setInt(1, id);
		ResultSet rs = stmt5.executeQuery();

		User u = null;
		while (rs.next()) {
			u = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getDate(6), rs.getBoolean(7), rs.getString(8));
		}
		return u;
	}

	public int deleteUser(int id) throws Exception {

		UserDao dao = new UserDao();
		User u = dao.displayUserById(id);
		if (u != null) {

			stmt4.setInt(1, id);
			int count = stmt4.executeUpdate();
			return count;
		}
		return 0;
	}

	public int updateUser(User user) throws Exception {
		UserDao dao = new UserDao();

		User u = dao.displayUserById(user.getId());
		if (u != null) {

			if (u.getId() == user.getId()) {
				stmt3.setInt(1, user.getId());
				stmt3.setString(2, user.getFirst_name());
				stmt3.setString(3, user.getLast_name());
				stmt3.setString(4, user.getEmail());
				stmt3.setString(5, user.getPassword());

				java.util.Date udate = user.getDob();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				java.sql.Date sdate = new java.sql.Date(udate.getTime());
				stmt3.setDate(6, sdate);

				stmt3.setBoolean(7, user.isStatus());
				stmt3.setString(8, user.getRole());

				int count = stmt3.executeUpdate();
				return count;
			}
		} else {
			return 0;
		}
		return 0;
	}

	public int createUser(User u) throws Exception {
		stmt1.setString(1, u.getFirst_name());
		stmt1.setString(2, u.getLast_name());
		stmt1.setString(3, u.getEmail());
		stmt1.setString(4, u.getPassword());

		java.util.Date udate = u.getDob();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.sql.Date sdate = new java.sql.Date(udate.getTime());
		stmt1.setDate(5, sdate);

		stmt1.setBoolean(6, u.isStatus());

		stmt1.setString(7, u.getRole());

		int count = stmt1.executeUpdate();
		return count;

	}
}
