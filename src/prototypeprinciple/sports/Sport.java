package prototypeprinciple.sports;

public class Sport implements SportPrototype<Sport>{
    private String nameOfSport;
    private String description;
    private String history;
    private int numberOfPlayers;
    private String playedAt;
    public Sport(){}
    public Sport(Sport sport){
        if(sport != null){
            this.nameOfSport = sport.nameOfSport;
            this.history = sport.history;
            this.description = sport.description;
            this.numberOfPlayers = sport.numberOfPlayers;
            this.playedAt = sport.playedAt;
        }
        else{
            throw new NullPointerException("Null Pointer Exception");
        }

    }
    public String getNameOfSport() {
        return nameOfSport;
    }

    public String getDescription() {
        return description;
    }

    public String getHistory() {
        return history;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public String getPlayedAt() {
        return playedAt;
    }
    public void setNameOfSport(String nameOfSport) {
        this.nameOfSport = nameOfSport;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHistory(String history) {
        this.history = history;
    }
    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
    public void setPlayedAt(String playedAt){
        this.playedAt = playedAt;
    }
    @Override
    public Sport clone() {
        return new Sport(this);
    }
    public String toString(){
        return this.nameOfSport + " "
                +this.description + " "
                +this.history;
    }
}
