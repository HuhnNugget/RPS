package jpp.gametheory.strategies;

import jpp.gametheory.generic.IGameRound;
import jpp.gametheory.generic.IPlayer;
import jpp.gametheory.generic.IStrategy;
import jpp.gametheory.rockPaperScissors.RPSChoice;

import java.util.Arrays;
import java.util.List;

public class MostCommon implements IStrategy<RPSChoice> {

    private IStrategy<RPSChoice> alternate;
    private int anzahlRockChoices = 0;
    private int anzahlPaperChoices = 0;
    private int anzahlSciccoreChoices = 0;

    public MostCommon(IStrategy<RPSChoice> alternate){
        this.alternate = alternate;
    }

    @Override
    public String name() {
        return "Most Common Choice(Alternate: " + alternate.name() + ")";
    }

    @Override
    public RPSChoice getChoice(IPlayer<RPSChoice> player, List<IGameRound<RPSChoice>> previousRounds) {

        for (IGameRound<RPSChoice> previousRound : previousRounds) {
            for (IPlayer players : previousRound.getPlayers()) {
                switch (previousRound.getChoice(players)) {
                    case ROCK:
                        anzahlRockChoices++;
                        break;
                    case PAPER:
                        anzahlPaperChoices++;
                        break;
                    case SCISSORS:
                        anzahlSciccoreChoices++;
                        break;
                }
            }
        }
        if(anzahlRockChoices > anzahlPaperChoices && anzahlRockChoices > anzahlSciccoreChoices){
            return RPSChoice.ROCK;
        }
        else if(anzahlPaperChoices > anzahlSciccoreChoices && anzahlPaperChoices > anzahlRockChoices){
            return RPSChoice.PAPER;
        }
        else if (anzahlSciccoreChoices > anzahlRockChoices && anzahlSciccoreChoices > anzahlPaperChoices){
            return RPSChoice.SCISSORS;
        }
        return alternate.getChoice(player, previousRounds);
    }
}
