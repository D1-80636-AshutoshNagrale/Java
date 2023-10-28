package Que2;

import java.util.Objects;
import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler {
	private int runs;
	private double average;
	private double strikeRate;
	private int wickets;
	private double economy;

	private int ballsFacedByBatsman;
	private int ballsBowledByBowler;
	private int concededRuns;

	public Cricketer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cricketer(int runs, int wickets) {
		super();
		this.runs = runs;
		this.wickets = wickets;
	}

	public Cricketer(int runs, int wickets, int id, String name, int age, int matchesPlayed) {
		super(id, name, age, matchesPlayed);
		this.runs = runs;
		this.wickets = wickets;
	}

	
	public int getBallsFacedByBatsman() {
		return ballsFacedByBatsman;
	}

	public void setBallsFacedByBatsman(int ballsFacedByBatsman) {
		this.ballsFacedByBatsman = ballsFacedByBatsman;
	}

	public int getBallsBowledByBowler() {
		return ballsBowledByBowler;
	}

	public void setBallsBowledByBowler(int ballsBowledByBowler) {
		this.ballsBowledByBowler = ballsBowledByBowler;
	}

	public int getConcededRuns() {
		return concededRuns;
	}

	public void setConcededRuns(int concededRuns) {
		this.concededRuns = concededRuns;
	}

	@Override
	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	@Override
	public double getAverage() {
		return this.runs / getMatchesPlayed();
	}

	@Override
	public double getStrikeRate() {
		return this.runs / this.ballsFacedByBatsman;
	}

	@Override
	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public double getEconomy() {
		return this.concededRuns/this.ballsBowledByBowler;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Cricketer [runs=" + runs + ", average=" + average + ", strikeRate=" + strikeRate + ", wickets="
				+ wickets + ", economy=" + economy + "]";
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter runs scored by player");
		this.runs = sc.nextInt();
		System.out.println("Enter wickets taken by player");
		this.wickets = sc.nextInt();
		System.out.println("Enter number of balls played by player");
		this.ballsFacedByBatsman = sc.nextInt();
		System.out.println("Enter number of balls bowled by player");
		this.ballsBowledByBowler = sc.nextInt();
		System.out.println("Enter number of runs given by player");
		this.concededRuns = sc.nextInt();
		System.out.println("****************************************");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(average, economy, runs, strikeRate, wickets);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cricketer other = (Cricketer) obj;
		return Double.doubleToLongBits(average) == Double.doubleToLongBits(other.average)
				&& Double.doubleToLongBits(economy) == Double.doubleToLongBits(other.economy) && runs == other.runs
				&& Double.doubleToLongBits(strikeRate) == Double.doubleToLongBits(other.strikeRate)
				&& wickets == other.wickets;
	}

}
