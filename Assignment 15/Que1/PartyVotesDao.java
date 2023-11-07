package Que1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartyVotesDao implements AutoCloseable {

	Connection con;

	public PartyVotesDao() throws Exception {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//	List<PartyVotes> getPartywiseVotes();  get partywise total votes. 
	// create a POJO class "PartyVotes" with two fields "party" and "votes".
	// no separate db table to be created

	public List<PartyVotes> getPartywiseVotes() throws Exception {

		String sql = "select party,sum(votes) from candidates group by party";
		List<PartyVotes> list = new ArrayList<PartyVotes>();

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String party = rs.getString("party");
				int votes = rs.getShort("sum(votes)");

				list.add(new PartyVotes(party, votes));
			}
			return list;
		}
	}
}
