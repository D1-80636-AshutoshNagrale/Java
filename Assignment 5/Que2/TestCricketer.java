package Que2;

import java.util.Scanner;

public class TestCricketer {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Player[] players = new Player[11];
		Player[] players = new Player[4];

		for (int i = 0; i < players.length; i++) {
			players[i] = new Cricketer();
			players[i].accept(sc);
		}

		System.out.println("********************************");
		System.out.println("Details of all players in a team");
		System.out.println("********************************");
		for (Player player : players) {
			System.out.println(player.toString());
		}
		System.out.println("********************************");
		System.out.println();
		System.out.println("Total Batsman in a team : " + Players.totalBatter(players));
		System.out.println("Total Bowler in a team : " + Players.totalBowler(players));
		System.out.println("Total runs of all the batsman : " + Players.totalBatterRuns(players));
		System.out.println("Total wickets of all the bowler : " + Players.totalBowlerWickets(players));
		System.out.println("Player with maximum runs : " + Players.maxRunsBatter(players));
		System.out.println("Player with maximum wickets : " + Players.maxWicketBowler(players));
	}
}
