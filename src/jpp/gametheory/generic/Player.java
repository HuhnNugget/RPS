package jpp.gametheory.generic;


import java.util.List;

public class Player implements IPlayer {

    private IStrategy strategy;
    private final String name;

    public Player(String name, IStrategy strategy){
        this.strategy = strategy;
        this.name = name;
    }

    public String getName(){
        return null;
    }

    @Override
    public IStrategy getStrategy() {
        return null;
    }


    @Override
    public IChoice getChoice(List previousRounds) {
        return null;
    }

    @Override
    public int compareTo(Object playerObject) {
        Player player = (Player) playerObject;
        return this.name.compareTo(player.name);
    }

    @Override
    public boolean equals(Object playerObject){
        Player player = (Player) playerObject;
        if(this.name.equalsIgnoreCase(player.name)) return true;
        else return false;
    }

//    @Override
//    public int hashCode(){
//        if(this.name.equalsIgnoreCase(player.name)) return 1;
//        else return 2;
//    }

    @Override
    public String toString(){
        return String.format("<%s>(<%s>)", this.name, this.strategy.name());
    }
}
