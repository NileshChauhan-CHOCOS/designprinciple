package factorymethod.sports;

import factorymethod.sports.dto.SportDto;

public class IndividualSport extends Sport{
    private final String typeOfSport;
    public IndividualSport(SportDto sportDto){
        super(sportDto);
        this.typeOfSport ="IndividualSport";
    }
    public String toString(){
        return super.toString() + "typeOf Sport - > " + typeOfSport;
    }
}
