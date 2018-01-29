package no.ber.champchamps.rule;

import no.ber.champchamps.entity.bet.Bet;

public interface Rule {

	int getScore(Bet bet);

}
