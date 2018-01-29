package no.ber.champchamps.entity.bet;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import no.ber.champchamps.entity.BaseEntity;
import no.ber.champchamps.entity.User;

@Entity
public class Bet extends BaseEntity {

    @OneToOne
    private User user = null;
    @OneToMany
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
