package no.ber.champchamps.rule;

import org.springframework.stereotype.Component;

import no.ber.champchamps.entity.bet.Bet;

@Component
public class CorrectTeamInStage implements Rule {

	@Override
	public int getScore(Bet bet) {
		return 0;
	}

}
