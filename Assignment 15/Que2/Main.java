package Que2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static User acceptUser(Scanner sc) {
		User user = new User();

		System.out.println("Enter user details : ");
		System.out.println("Enter id : ");
		user.setId(sc.nextInt());
		System.out.println("Enter first name : ");
		user.setFirst_name(sc.next());
		System.out.println("Enter last name : ");
		user.setLast_name(sc.next());
		System.out.println("Enter email : ");
		user.setEmail(sc.next());
		System.out.println("Enter password : ");
		user.setPassword(sc.next());

		System.out.println("Enter date (in dd-mm-yyyy format) : ");
		String dateStr = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			java.util.Date udate = sdf.parse(dateStr);
			user.setDob(udate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter status : ");
		user.setStatus(sc.nextBoolean());

		System.out.println("Enter role : ");
		user.setRole(sc.next());
		return user;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		int key = 0;
		do {
			System.out.println("1. DISPLAY ALL USERS");
			System.out.println("2. DISPLAY USER BY ID");
			System.out.println("3. CREATE NEW USER");
			System.out.println("4. UPDATE USER");
			System.out.println("5. DELETE USER BY ID");
			System.out.println("0. EXIT");
			System.out.println("========================");
			System.out.println("ENTER YOUR CHOICE : ");
			key = sc.nextInt();
			switch (key) {
			case 1:
				try (UserDao dao = new UserDao()) {
					List<User> list = dao.displayAllUsers();
					list.forEach(e -> System.out.println(e));
					System.out.println("***************************************************");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try (UserDao dao = new UserDao()) {

					System.out.println("Enter id of user : ");
					User u = dao.displayUserById(sc.nextInt());
					System.out.println(u);
					System.out.println("***************************************************");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try (UserDao dao = new UserDao()) {
					User u = acceptUser(sc);
					System.out.println("*********** USER ACCEPTED SUCCESSFULLY *************");
					int count = dao.createUser(u);
					System.out.println(count + " user added successfully");
					System.out.println("===============================================");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try (UserDao dao = new UserDao()) {
					System.out.println("Enter id of user to be updated : ");
					int id = sc.nextInt();
					User u = acceptUser(sc);
					u.setId(id);
					int count = dao.updateUser(u);

					if (count == 0) {
						System.out.println("User with given id not found hence cannot be updated");
					} else {
						System.out.println(count + " user updated successfully");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 5:
				try (UserDao dao = new UserDao()) {
					System.out.println("****************************************************");
					System.out.println("Enter id to be deleted : ");
					int id = sc.nextInt();
					int count = dao.deleteUser(id);
					System.out.println(count + " user deleted successfully");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 0:
				bool = false;

			default:
				System.out.println("******* Wrong choice entered *******");
				break;
			}
		} while (bool != false);
		// try(UserDao dao=new UserDao()){
//	
//}
	}
}
