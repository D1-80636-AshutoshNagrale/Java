//2. Write a menu driven program to do following operations on users table using JDBC PreparedStatement.
//Insert new user (Voter)
//Display all users
//Delete voter with given id
//Change status of voter with given id to true
//Change the name and birth date of voter

package Que2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Que2Main {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/java";
	public static final String DB_USER = "D1_80636_Ashutosh";
	public static final String DB_PASSWORD = "80636";
	public static SimpleDateFormat sdf;
	public static java.util.Date udate;
	public static java.sql.Date sdate;

	static {
		try {
			Class.forName(DB_DRIVER);
			sdf = new SimpleDateFormat("dd-MM-yyyy");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		int key = 0;

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			do {
				System.out.println("1. Insert new user");
				System.out.println("2. Display all users");
				System.out.println("3. Delete voter with given id");
				System.out.println("4. Change status of voter with given id to true");
				System.out.println("5. Change the name and birth date of voter");
				System.out.println("0. EXIT");
				System.out.println("=================================================");
				System.out.println("Enter your choice : ");
				key = sc.nextInt();

				switch (key) {
				case 0:
					System.exit(0);
					break;
				case 1:
					String sql = "insert into users values (default,?,?,?,?,?,?,?)";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {
						System.out.println("Enter first name : ");
						String fname = sc.next();
						System.out.println("Enter last name : ");
						String lname = sc.next();
						System.out.println("Enter email : ");
						String email = sc.next();
						System.out.println("Enter password : ");
						String password = sc.next();

						System.out.println("Enter dat of birth in dd-mm-yyyy format");
						String date = sc.next();
						// java.util.Date uDate = sdf.parse(date);// converts String date to
						// java.util.Date;
						udate = sdf.parse(date);// converts String date to java.util.Date
						// java.sql.Date sdate = new java.sql.Date(uDate.getTime());//
						// java.sql.Date(Long value)
						sdate = new java.sql.Date(udate.getTime());// java.sql.Date(Long value)

						System.out.println("Enter status : ");// user will enter true or false
						boolean status = sc.nextBoolean();

						System.out.println("Enter role : ");
						String role = sc.next();

						stmt.setString(1, fname);
						stmt.setString(2, lname);
						stmt.setString(3, email);
						stmt.setString(4, password);
						stmt.setDate(5, sdate);
						stmt.setBoolean(6, status);
						stmt.setString(7, role);

						int count = stmt.executeUpdate();
						System.out.println("Rows affected : " + count);
						System.out.println("=================================================================");

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					String sql1 = "select * from users";
					try (PreparedStatement stmt = con.prepareStatement(sql1)) {
						ResultSet rs = stmt.executeQuery();
						System.out.println("=================================================================");
						while (rs.next()) {
							int id = rs.getInt("id");
							String first_name = rs.getString("first_name");
							String last_name = rs.getString("last_name");
							String email = rs.getString("email");
							String password = rs.getString("password");
							boolean status = rs.getBoolean("status");
							String role = rs.getString("role");

							sdate = rs.getDate("dob");
							String date = sdf.format(sdate);

							System.out.printf("%d, %s, %s, %s, %s, %s, %s, %s\n", id, first_name, last_name, email,
									password, date, status, role);
						}
						System.out.println("=================================================================");
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 3:
					String sql2 = "delete from users where id =?";
					try (PreparedStatement stmt = con.prepareStatement(sql2)) {
						System.out.println("Enter id to be deleted : ");
						int id = sc.nextInt();

						stmt.setInt(1, id);

						int count = stmt.executeUpdate();
						System.out.println("Rows affected : " + count);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 4:
					String sql3 = "update users set status=true where id=? ";
					try (PreparedStatement stmt = con.prepareStatement(sql3)) {

						System.out.println("Enter id to be deleted : ");
						int id = sc.nextInt();
						stmt.setInt(1, id);

						int count = stmt.executeUpdate();
						System.out.println("Rows affected : " + count);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 5:
					String sql4 = "update users set first_name=?,last_name=?, dob=? where id=? ";
					try (PreparedStatement stmt = con.prepareStatement(sql4)) {

						System.out.println("Enter id to be updated : ");
						int id = sc.nextInt();
						stmt.setInt(4, id);

						System.out.println("Enter first_name to be updated : ");
						String fname = sc.next();
						stmt.setString(1, fname);

						System.out.println("Enter last_name to be updated : ");
						String lname = sc.next();
						stmt.setString(2, lname);

						System.out.println("Enter date (in dd-mm-yyyy format) to be updated : ");
						String date = sc.next();
						udate = sdf.parse(date);
						sdate = new java.sql.Date(udate.getTime());
						stmt.setDate(3, sdate);

						int count = stmt.executeUpdate();
						System.out.println("Rows affected : " + count);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;

				default:
					System.out.println("Wrong choice entered");
					break;
				}
			} while (bool);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
