package jpp.gametheory.strategies;

import jpp.gametheory.generic.IGameRound;
import jpp.gametheory.generic.IPlayer;
import jpp.gametheory.generic.IStrategy;
import jpp.gametheory.rockPaperScissors.RPSChoice;

import java.util.List;

public class CircleChoice implements IStrategy<RPSChoice> {

    public CircleChoice(){

    }

    @Override
    public String name() {
        return "Circle Choice";
    }

    @Override
    public RPSChoice getChoice(IPlayer<RPSChoice> player, List<IGameRound<RPSChoice>> previousRounds) {
        RPSChoice rpsChoice = null;
        if(previousRounds.isEmpty()){
            rpsChoice = RPSChoice.ROCK;
        }
        else{
            RPSChoice lastRoundsChoice = previousRounds.get(previousRounds.size() - 1).getChoice(player);
            switch (lastRoundsChoice){
                case ROCK:
                    rpsChoice = RPSChoice.PAPER;
                    break;
                case PAPER:
                    rpsChoice = RPSChoice.SCISSORS;
                    break;
                case SCISSORS:
                    rpsChoice = RPSChoice.ROCK;
                    break;
            }
        }
        return rpsChoice;
    }
}
