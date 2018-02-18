package no.ber.sofachamps.entity.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;

import no.ber.sofachamps.constants.StageType;
import no.ber.sofachamps.constants.TournamentGroup;
import no.ber.sofachamps.entity.BaseEntity;

@Entity
public class Stage extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private StageType type;
    @Enumerated(EnumType.STRING)
    private TournamentGroup tournamentGroup;
    @ManyToMany
    private List<Team> teams;
    @ManyToMany
    private List<Match> matches;

    public StageType getType() {
        return type;
    }

    public void setType(StageType type) {
        this.type = type;
    }

    public TournamentGroup getTournamentGroup() {
        return tournamentGroup;
    }

    public void setTournamentGroup(TournamentGroup tournamentGroup) {
        this.tournamentGroup = tournamentGroup;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

}
