package no.ber.sofachamps.entity.bet;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import no.ber.sofachamps.entity.User;
import no.ber.sofachamps.entity.model.Match;
import no.ber.sofachamps.entity.model.Team;

@Entity
public class MatchBet extends Match {

    public MatchBet(Team home, Team away) {
        super(home, away);
    }

    @ManyToOne
    private User user = null;
    @OneToOne
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
