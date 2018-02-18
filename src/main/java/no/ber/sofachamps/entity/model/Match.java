package no.ber.sofachamps.entity.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;

import no.ber.sofachamps.constants.StageType;
import no.ber.sofachamps.entity.BaseEntity;

@Entity
@Inheritance
public class Match extends BaseEntity {

    private LocalDate date;
    @ManyToOne
    private Team home;
    @ManyToOne
    private Team away;
    private Integer homeScore;
    private Integer awayScore;
    @Enumerated(EnumType.STRING)
    private StageType stage;

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

    public StageType getStage() {
        return stage;
    }

    public void setStage(StageType stage) {
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
