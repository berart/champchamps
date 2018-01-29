package no.ber.champchamps.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import no.ber.champchamps.constants.TournamentGroup;

@Entity
public class Team extends BaseEntity {

    private String name;
    private String code;
    @Enumerated(EnumType.STRING)
    private TournamentGroup tournamentGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public TournamentGroup getTournamentGroup() {
        return tournamentGroup;
    }

    public void setTournamentGroup(TournamentGroup tournamentGroup) {
        this.tournamentGroup = tournamentGroup;
    }
}
