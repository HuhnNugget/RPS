package jpp.gametheory.generic;

import java.util.Map;
import java.util.Set;

public class GameRound<C extends IChoice> implements IGameRound {

    private Map<IPlayer,C> playerChoices;

    public GameRound(Map<IPlayer, C> playerChoices) {
        if(playerChoices.isEmpty()) {
            throw new IllegalArgumentException("Es befindet sich kein Spieler in der Liste");
        } else{
            this.playerChoices = playerChoices;
        }
    }

    @Override
    public Map getPlayerChoices() {
        return null;
    }

    @Override
    public IChoice getChoice(IPlayer player) {
        return null;
    }

    @Override
    public Set<IPlayer> getPlayers() {
        return null;
    }

    @Override
    public Set<IPlayer> getOtherPlayers(IPlayer player) {
        return null;
    }

    @Override
    public String toString(){
        StringBuilder spielerString = null;
        for(Map.Entry<IPlayer, C> entry : playerChoices.entrySet()){
            spielerString.append(String.format("<%s>(<%s>)", entry.getKey().getName(), entry.getValue().name()));
        }

        return spielerString.toString();
    }
}
