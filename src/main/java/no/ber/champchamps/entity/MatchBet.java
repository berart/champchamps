package no.ber.champchamps.entity;

import javax.persistence.Entity;

@Entity
public class MatchBet extends Match {

	private User user = null;
	private Match match = null;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

}
