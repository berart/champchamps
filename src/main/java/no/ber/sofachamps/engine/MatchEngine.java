package no.ber.sofachamps.engine;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

import no.ber.sofachamps.entity.model.Match;
import no.ber.sofachamps.entity.model.Team;

/**
 * Engine to create group stage matches. Heavily influenced by: https://github.com/codeecho/fixture-generator
 */
public class MatchEngine {

    private MatchEngine() {
    }

    public static List<Match> getMatches(List<Team> teams, boolean includeReversematches) {
        int numberOfTeams = teams.size();
        if (numberOfTeams % 2 != 0) {
            throw new IllegalStateException("Uneven number of teams: " + numberOfTeams);
        }

        List<List<Match>> rounds = createRounds(numberOfTeams, teams);
        rounds = interleave(numberOfTeams, rounds);
        flipHomeAwayTeams(rounds);

        if (includeReversematches) {
            createReverseMatches(rounds);
        }
        return rounds.stream().flatMap(List::stream).collect(toList());
    }

    private static void createReverseMatches(List<List<Match>> rounds) {
        List<List<Match>> reverseMatches = new ArrayList<>();
        for (List<Match> round : rounds) {
            List<Match> reverseRound = new ArrayList<>();
            for (Match fixture : round) {
                reverseRound.add(new Match(fixture.getAway(), fixture.getHome()));
            }
            reverseMatches.add(reverseRound);
        }
        rounds.addAll(reverseMatches);
    }

    private static void flipHomeAwayTeams(List<List<Match>> rounds) {
        // Last team can't be away for every game so flip them to home on odd rounds.
        for (int roundNumber = 0; roundNumber < rounds.size(); roundNumber++) {
            if (roundNumber % 2 == 1) {
                Match fixture = rounds.get(roundNumber).get(0);
                rounds.get(roundNumber).set(0, new Match(fixture.getAway(), fixture.getHome()));
            }
        }
    }

    private static List<List<Match>> interleave(int numberOfTeams, List<List<Match>> rounds) {
        // Interleave so that home and away games are fairly evenly dispersed.
        List<List<Match>> interleaved = new ArrayList<>();

        int evn = 0;
        int odd = (numberOfTeams / 2);
        for (int i = 0; i < rounds.size(); i++) {
            if (i % 2 == 0) {
                interleaved.add(rounds.get(evn++));
            } else {
                interleaved.add(rounds.get(odd++));
            }
        }
        return interleaved;
    }

    private static List<List<Match>> createRounds(int numberOfTeams, List<Team> teams) {
        // Generate the matches using the cyclic algorithm.
        int totalRounds = numberOfTeams - 1;
        int matchesPerRound = numberOfTeams / 2;
        List<List<Match>> rounds = new ArrayList<>();

        for (int round = 0; round < totalRounds; round++) {
            List<Match> matches = new ArrayList<>();
            for (int match = 0; match < matchesPerRound; match++) {
                int home = (round + match) % (numberOfTeams - 1);
                int away = (numberOfTeams - 1 - match + round) % (numberOfTeams - 1);
                // Last team stays in the same place while the others rotate around it.
                if (match == 0) {
                    away = numberOfTeams - 1;
                }
                matches.add(new Match(teams.get(home), teams.get(away)));
            }
            rounds.add(matches);
        }
        return rounds;
    }
}
