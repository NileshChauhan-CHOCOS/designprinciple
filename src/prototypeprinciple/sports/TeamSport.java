package prototypeprinciple.sports;

public class TeamSport extends Sport{
    private int numberOfPlayers;
    private final String type;
    public TeamSport(){
        this.type = "TEAM GAME";
    }
    public TeamSport(TeamSport ts) throws NullPointerException{
        super(ts);
        this.type = ts.type;
    }
    public void setNumberOfPlayers(int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
    }
    public int getNumberOfPlayers(){
        return this.numberOfPlayers;
    }
    @Override
    public Sport clone(){
        return new TeamSport(this);
    }
    public String getDescription(){
        return super.getDescription();
    }
}
