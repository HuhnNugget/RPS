package jpp.gametheory.generic;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Game<C extends IChoice> {

    private Set<IPlayer<C>> players;
    private IReward reward;

    public Game(Set<IPlayer<C>> players, IReward<C> reward){
        if(players.size() < 1){
            throw new IllegalArgumentException();
        }
        else{
            this.players = players;
        }

        this.reward = reward;

    }

    public Set<IPlayer<C>> getPlayers(){
        return players;
    }

    public IGameRound<C> playRound(){

    }

    public void playNRounds(int n){

    }

    public Optional<IGameRound<C>> undoRound(){

    }

    public void undoNRounds(){

    }

    public List<IGameRound<C>> getPlayedRounds(){

    }

    public int getPlayerProfit(IPlayer<C> player){

    }

    public Optional<IPlayer<C>> getBestPlayer(){

    }

    public String toString(){

    }
}
