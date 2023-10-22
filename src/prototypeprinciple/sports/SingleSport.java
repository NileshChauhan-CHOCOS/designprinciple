package prototypeprinciple.sports;

public class SingleSport extends Sport{
    private final String type;
    public SingleSport(){
        this.type = "SINGLE GAME";
    }
    public SingleSport(SingleSport ts) throws NullPointerException {
        super(ts);
        this.type = ts.type;
    }
    @Override
    public Sport clone(){
        return new SingleSport(this);
    }
    public String getDescription(){
        return super.getDescription();
    }
}
