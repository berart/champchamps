package no.ber.champchamps.rule;

import org.springframework.stereotype.Component;

import no.ber.champchamps.entity.Bet;

@Component
public class CorrectHomeScore implements Rule {

	@Override
	public int getScore(Bet bet) {
		return 0;
	}

}
