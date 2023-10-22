package factorymethod.sports;

import factorymethod.sports.dto.SportDto;

public class TeamSport extends Sport{
    private final String typeOfSport;
    public TeamSport(SportDto sportDto){
        super(sportDto);
        this.typeOfSport="TeamSport";
    }


    public String toString(){
        return super.toString() + "Type Of Sport" + typeOfSport;
    }
}
