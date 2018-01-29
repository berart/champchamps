package no.ber.champchamps.entity.bet;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import no.ber.champchamps.entity.User;
import no.ber.champchamps.entity.model.Match;

@Entity
public class MatchBet extends Match {

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
