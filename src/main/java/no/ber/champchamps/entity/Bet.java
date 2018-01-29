package no.ber.champchamps.entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Bet extends BaseEntity {

	private User user = null;
	private List<MatchBet> matchBets;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<MatchBet> getMatchBets() {
		return matchBets;
	}

	public void setMatchBets(List<MatchBet> matchBets) {
		this.matchBets = matchBets;
	}

}
