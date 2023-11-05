package Que1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Que1Main {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/java";
	public static final String DB_USER = "D1_80636_Ashutosh";
	public static final String DB_PASSWORD = "80636";

	static {
		try {
			Class.forName(DB_DRIVER);
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
				System.out.println("1. Insert new candidate");
				System.out.println("2. Display all candidates");
				System.out.println("3. Increment votes of candidate with given id");
				System.out.println("4. Delete candidate with given id");
				System.out.println("5. Find candidate of given id");
				System.out.println("6. Find candidates of given party");
				System.out.println("7. Display total votes for each party");
				System.out.println("0. EXIT");
				System.out.println("=================================================");
				System.out.println("Enter your choice : ");
				key = sc.nextInt();

				switch (key) {
				case 1:
					String sql = "Insert into candidates values(default,?,?,?)";
					try (PreparedStatement stmt = con.prepareStatement(sql)) {
						System.out.println("Enter name : ");
						String name = sc.next();
						System.out.println("Enter party : ");
						String party = sc.next();
						System.out.println("Enter votes : ");
						int votes = sc.nextInt();

						stmt.setString(1, name);
						stmt.setString(2, party);
						stmt.setInt(3, votes);

						int count = stmt.executeUpdate();
						System.out.println("Rows affected : " + count);
					} // stmt.close()
					catch (Exception e) {
						e.printStackTrace();
					}
					break;

				case 2:
					String sql1 = "select * from candidates";
					try (Statement stmt = con.createStatement()) {
						try (ResultSet rs = stmt.executeQuery(sql1)) {
							System.out.println("==============================================");
							while (rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
							}
							System.out.println("==============================================");
						}
					} // stmt.close()
					catch (Exception e) {
						e.printStackTrace();
					}
					break;

				case 3:

					String sql2 = "update candidates set votes=? where id=?";

					try (PreparedStatement stmt = con.prepareStatement(sql2)) {
						System.out.println("Enter id to be updated : ");
						int id = sc.nextInt();
						System.out.println("Enter votes : ");
						int votes = sc.nextInt();

						stmt.setInt(1, votes);
						stmt.setInt(2, id);

						int count = stmt.executeUpdate();
						System.out.println("Rows affected : " + count);
						System.out.println("==============================================");
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;

				case 4:

					String sql3 = "delete from candidates where id=?";

					try (PreparedStatement stmt = con.prepareStatement(sql3)) {
						System.out.println("Enter id to be deleted : ");
						int id = sc.nextInt();

						stmt.setInt(1, id);

						int count = stmt.executeUpdate();
						System.out.println("Rows affected : " + count);
						System.out.println("==============================================");
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;

				case 5:

					String sql4 = "select * from candidates where id=?";

					try (PreparedStatement stmt = con.prepareStatement(sql4)) {
						System.out.println("Enter id to be displayed : ");
						int id = sc.nextInt();

						stmt.setInt(1, id);

						ResultSet rs = stmt.executeQuery();
						while (rs.next()) {
							int id1 = rs.getInt("id");
							String name = rs.getString("name");
							String party = rs.getString("party");
							int votes = rs.getInt("votes");
							System.out.printf("%d, %s, %s, %d\n", id1, name, party, votes);
						}
						System.out.println("==============================================");
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;

				case 6:

					String sql5 = "select * from candidates where party=?";

					try (PreparedStatement stmt = con.prepareStatement(sql5)) {
						System.out.println("Enter party to be displayed : ");
						String party = sc.next();

						stmt.setString(1, party);

						ResultSet rs = stmt.executeQuery();
						while (rs.next()) {
							int id = rs.getInt("id");
							String name = rs.getString("name");
							String party1 = rs.getString("party");
							int votes = rs.getInt("votes");
							System.out.printf("%d, %s, %s, %d\n", id, name, party1, votes);
						}
						System.out.println("==============================================");
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;

				case 7:

					String sql6 = "select party, sum(votes) from candidates group by party";

					try (Statement stmt = con.createStatement()) {
						try (ResultSet rs = stmt.executeQuery(sql6)) {
							while (rs.next()) {
								String party1 = rs.getString("party");
								int votes = rs.getInt("sum(votes)");
								System.out.printf("%s, %d\n", party1, votes);
							}
							System.out.println("==============================================");
						}

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;

				case 0:
					System.out.println("Thank you for using the app");
					System.exit(0);
					break;
				default:
					System.out.println("Wrong choice entered");
					break;
				}
			} while (bool);
		} // con.close(0
		catch (

		Exception e) {
			e.printStackTrace();
		}
	}
}
