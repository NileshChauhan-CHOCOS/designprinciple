package factorymethod.sports.dto;

public class SportDto {
    private String sportName;
    private int numberOfPlayers;

    public String getSportName() {
        return sportName;
    }

    public SportDto setSportName(String sportName) {
        this.sportName = sportName;
        return this;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public SportDto setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        return this;
    }
}
