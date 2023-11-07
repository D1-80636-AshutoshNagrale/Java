package Que1;

public class PartyVotes {

	private String party;
	private int votes;

	public PartyVotes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartyVotes(String party, int votes) {
		super();
		this.party = party;
		this.votes = votes;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PartyVotes [party=");
		builder.append(party);
		builder.append(", votes=");
		builder.append(votes);
		builder.append("]");
		return builder.toString();
	}

}
