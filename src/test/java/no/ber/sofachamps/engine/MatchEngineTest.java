package no.ber.sofachamps.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import no.ber.sofachamps.constants.StageType;
import no.ber.sofachamps.entity.model.Match;
import no.ber.sofachamps.entity.model.Stage;
import no.ber.sofachamps.entity.model.Team;
import no.ber.sofachamps.entity.model.Tournament;

public class MatchEngineTest {

    private List<Team> GROUP_A = Arrays.asList(createTeam("Norway", "NOR"), createTeam("Sweden", "SWE"), createTeam("Denmark", "DEN"),
            createTeam("Finland", "FIN"));

    @Test
    public void test() throws Exception {
        List<Match> matches = MatchEngine.getMatches(GROUP_A, false);
        matches.stream().forEach(System.out::println);
    }

    public void testTournament() throws Exception {
        Tournament tournament = new Tournament();
        tournament.setName("Fotball VM 2018");
        tournament.getStages().add(createStage());
    }

    private Stage createStage() {
        Stage stage = new Stage();
        stage.setType(StageType.GROUP);
        return null;
    }

    private Match createMatch() {
        Match match = new Match();
        return match;
    }

    private Team createTeam(String name, String code) {
        Team team = new Team();
        team.setName(name);
        team.setCode(code);
        return team;
    }

    List<Match> createMatches(List<Team> teams) {
        List<Match> matches = new ArrayList<>();
        return matches;
    }

}
