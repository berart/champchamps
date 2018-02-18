package no.ber.sofachamps.rule;

import no.ber.sofachamps.entity.bet.Bet;

public interface Rule {

	int getScore(Bet bet);

}
