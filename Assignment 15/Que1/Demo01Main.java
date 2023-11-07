package Que1;

import java.util.List;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam DAC Sep 2023 Author: Nilesh Ghule
 * <nilesh@sunbeaminfo.com> Time: 2023-11-06 08:52
 */

public class Demo01Main {
	public static Candidate acceptCandidate(Scanner sc) {
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Party: ");
		String party = sc.next();
		System.out.print("Enter Votes: ");
		int votes = sc.nextInt();
		Candidate c = new Candidate(id, name, party, votes);
		return c;
	}

	public static void main(String[] args) {
		System.out.println("main() method got executed");
		// TODO: Menu driven program

		Scanner sc = new Scanner(System.in);
		/*
		 * try(CandidateDao dao = new CandidateDao()) { Candidate c =
		 * acceptCandidate(sc); int count = dao.update(c);
		 * System.out.println("Rows Updated: " + count); } // dao.close(); catch
		 * (Exception e) { e.printStackTrace(); }
		 */

		try (CandidateDao dao = new CandidateDao()) {

			System.out.println("**************************************************");

			System.out.println("Enter candidate details to be updated :");
			Candidate c2 = acceptCandidate(sc);

			int count1 = dao.update(c2);
			System.out.println(count1 + " Candidate updated successfully");

			System.out.println("**************************************************");

			System.out.print("Enter party name to be searched : ");
			String party = sc.next();

			List<Candidate> list = dao.findByParty(party);
			list.forEach(c -> System.out.println(c));

			System.out.println("**************************************************");

			System.out.println("Enter id to be deleted");
			int id = sc.nextInt();
			dao.deleteById(id);
			System.out.println("Person with id " + id + " deleted");

			System.out.println("**************************************************");

			System.out.println("Enter candidate details :");
			Candidate c = acceptCandidate(sc);
			int count = dao.save(c);
			System.out.println(count + " Candidate added successfully");

			System.out.println("**************************************************");

			System.out.println("All candidates details : ");
			List<Candidate> list1 = dao.findAll();
			list1.forEach(e -> System.out.println(e));

			System.out.println("**************************************************");
			System.out.println("Enter id of name to be found : ");
			int id1 = sc.nextInt();
			Candidate c3 = dao.findById(id1);
			System.out.println(c3);
			System.out.println("**************************************************");

		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}

		try (PartyVotesDao dao1 = new PartyVotesDao()) {
			System.out.println("List of party and total votes : ");
			List<PartyVotes> list = dao1.getPartywiseVotes();

			list.forEach(e -> System.out.println(e));
			System.out.println("***************************************************");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
