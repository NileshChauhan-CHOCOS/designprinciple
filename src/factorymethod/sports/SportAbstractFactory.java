package factorymethod.sports;

import factorymethod.sports.dto.SportDto;
import factorymethod.sports.enums.SPORT_TYPE;

public abstract class SportAbstractFactory {
    public static Sport createSport(SPORT_TYPE sportType, SportDto sportDto){
        switch (sportType){
            case TEAM_SPORT -> {
                return new TeamSport(sportDto);
            }
            case INDIVIDUAL_SPORT -> {
                return new IndividualSport(sportDto);
            }
            default -> {
                return null;
            }
        }
    }
}
