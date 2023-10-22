package prototypeprinciple.sports;

import java.rmi.registry.Registry;

public class Client {
    public static void fillRegistry(SportRegistry registry){
        if(registry == null){
            throw new NullPointerException("Null Pointer Exception");
        }
        TeamSport ts = new TeamSport();
        registry.register("teamSport", ts);

        SingleSport st = new SingleSport();
        registry.register("singleSport", st);

        Sport sport = new Sport();
        registry.register("sport", sport);

    }
    public static void main(String[] args) {
        SportRegistry registry = SportRegistry.getInstance();
        fillRegistry(registry);
        System.out.println(registry.hashCode());
        Sport sport = registry.get("sport").clone();
        System.out.println(sport.toString());
        Sport football = registry.get("teamSport");
                //.clone();
        football.setNameOfSport("Football");
        football.setDescription("Football is played");
        football.setHistory("History of Football");
        football.setNumberOfPlayers(10);
        football.setPlayedAt("Outdoor");
        System.out.println(football.getClass());
        Sport chess = registry.get("singleSport").clone();
        //chess.setDescription("This is Chess Game");
        chess.setNameOfSport("Chess Game");
        chess.setHistory("Originated from India");
        chess.setNumberOfPlayers(1);
        chess.setPlayedAt("Indoor");
        registry.print();
        SportRegistry registry1 = SportRegistry.getInstance();
        System.out.println(registry1.hashCode());
        System.out.println("Description : " + football.getDescription());
        System.out.println("Description : " + chess.getDescription());

    }
}
