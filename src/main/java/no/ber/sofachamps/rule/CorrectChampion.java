package no.ber.sofachamps.rule;

import org.springframework.stereotype.Component;

import no.ber.sofachamps.entity.bet.Bet;

@Component
public class CorrectChampion implements Rule {

	@Override
	public int getScore(Bet bet) {
		return 0;
	}

}
