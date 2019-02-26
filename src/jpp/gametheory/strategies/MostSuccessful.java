package jpp.gametheory.strategies;

import jpp.gametheory.generic.IGameRound;
import jpp.gametheory.generic.IPlayer;
import jpp.gametheory.generic.IReward;
import jpp.gametheory.generic.IStrategy;
import jpp.gametheory.rockPaperScissors.RPSChoice;

import java.util.List;

public class MostSuccessful implements IStrategy<RPSChoice> {

    private IStrategy<RPSChoice> alternate;
    private IReward<RPSChoice> reward;

    public MostSuccessful(IStrategy<RPSChoice> alternate, IReward<RPSChoice> reward){
        this.alternate = alternate;
        this.reward = reward;
    }

    @Override
    public String name() {
        return "Most Successful Choice(Alternate: " + alternate.name() + ")";
    }

    @Override
    public RPSChoice getChoice(IPlayer<RPSChoice> player, List<IGameRound<RPSChoice>> previousRounds) {
        return null;
    }
}
