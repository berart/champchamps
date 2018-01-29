package no.ber.champchamps.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import no.ber.champchamps.constants.Stage;

@Entity
public class Match extends BaseEntity {

	private LocalDate date;
	private Team home;
	private Team away;
	private Integer homeScore;
	private Integer awayScore;
	private Stage stage;

	public Team getHome() {
		return home;
	}

	public void setHome(Team home) {
		this.home = home;
	}

	public Team getAway() {
		return away;
	}

	public void setAway(Team away) {
		this.away = away;
	}

	public Integer getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(Integer homeScore) {
		this.homeScore = homeScore;
	}

	public Integer getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(Integer awayScore) {
		this.awayScore = awayScore;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Team getWinner() {
		if (homeScore > awayScore)
			return home;
		else if (awayScore > homeScore)
			return away;
		else
			return null;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
