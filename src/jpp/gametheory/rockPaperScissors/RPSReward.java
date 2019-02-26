package jpp.gametheory.rockPaperScissors;

import jpp.gametheory.generic.IChoice;
import jpp.gametheory.generic.IGameRound;
import jpp.gametheory.generic.IPlayer;
import jpp.gametheory.generic.IReward;

import java.util.List;
import java.util.Map;

public class RPSReward implements IReward<RPSChoice> {

    private final int rewardGewinn = 2;
    private final int rewardVerloren = -1;

    @Override
    public int getReward(IPlayer player, IGameRound gameRound) {
        int gesammtReward = 0;
        for(Object otherPlayer : gameRound.getPlayers()){
            if(otherPlayer.equals(player));
            else{
                RPSChoice playersChoice = (RPSChoice) gameRound.getPlayerChoices().get(player);
                RPSChoice otherPlayersChoice = (RPSChoice) gameRound.getPlayerChoices().get(otherPlayer);
                if(playersChoice.equals(otherPlayersChoice));
                else{
                    if(playersChoice.equals(RPSChoice.PAPER) & (otherPlayersChoice.equals(RPSChoice.ROCK))) gesammtReward += rewardGewinn;
                    else if(playersChoice.equals(RPSChoice.PAPER) & (otherPlayersChoice.equals(RPSChoice.SCISSORS))) gesammtReward += rewardVerloren;
                    else if(playersChoice.equals(RPSChoice.ROCK) & (otherPlayersChoice.equals(RPSChoice.PAPER))) gesammtReward += rewardVerloren;
                    else if(playersChoice.equals(RPSChoice.ROCK) & (otherPlayersChoice.equals(RPSChoice.SCISSORS))) gesammtReward += rewardGewinn;
                    else if(playersChoice.equals(RPSChoice.SCISSORS) & (otherPlayersChoice.equals(RPSChoice.PAPER))) gesammtReward += rewardGewinn;
                    else if(playersChoice.equals(RPSChoice.SCISSORS) & (otherPlayersChoice.equals(RPSChoice.ROCK))) gesammtReward += rewardVerloren;
                }
            }
        }
        return gesammtReward;
    }
}
