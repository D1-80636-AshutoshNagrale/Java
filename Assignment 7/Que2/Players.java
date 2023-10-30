package Que2;

public class Players {

	public static int totalBatter(Player[] arr) {
		int batter = 0;
		for (Player p : arr) {
			if (p instanceof Cricketer) {
				Cricketer c = (Cricketer) p;
				if (c.getBallsFacedByBatsman() > 0) {
					batter++;
				}
			}
		}
		return batter;
	}

	public static int totalBowler(Player[] arr) {
		int bowler = 0;
		for (Player p : arr) {
			if (p instanceof Cricketer) {
				Cricketer c = (Cricketer) p;
				if (c.getBallsBowledByBowler() > 0) {
					bowler++;
				}
			}
		}
		return bowler;
	}

	public static int totalBatterRuns(Player[] arr) {
		int runs = 0;
		for (Player p : arr) {
			if (p instanceof Cricketer) {
				Cricketer c = (Cricketer) p;
				if (c.getBallsFacedByBatsman() > 0) {
					runs = runs + c.getRuns();
				}
			}
		}
		return runs;
	}

	public static int totalBowlerWickets(Player[] arr) {
		int wickets = 0;
		for (Player p : arr) {
			if (p instanceof Cricketer) {
				Cricketer c = (Cricketer) p;
				if (c.getBallsBowledByBowler() > 0) {
					wickets = wickets + c.getWickets();
				}
			}
		}
		return wickets;
	}

	public static Player maxRunsBatter(Player[] arr) {
		int runs = 0;
		for (Player p : arr) {
			if (p instanceof Cricketer) {
				Cricketer c = (Cricketer) p;
				if (c.getRuns() > runs) {
					runs = c.getRuns();
				}
			}
		}
		for (Player p : arr) {
			if (p instanceof Cricketer) {
				Cricketer c = (Cricketer) p;
				if (runs == c.getRuns()) {
					return (Player) c;
				}
			}
		}
		return null;
	}

	public static Player maxWicketBowler(Player[] arr) {
		int wickets = 0;
		for (Player p : arr) {
			if (p instanceof Cricketer) {
				Cricketer c = (Cricketer) p;
				if (c.getWickets() > wickets) {
					wickets = c.getWickets();
				}
			}
		}
		for (Player p : arr) {
			if (p instanceof Cricketer) {
				Cricketer c = (Cricketer) p;
				if (wickets == c.getWickets()) {
					return (Player) c;
				}
			}
		}
		return null;
	}
}
