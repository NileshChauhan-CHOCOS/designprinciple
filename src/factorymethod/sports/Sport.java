package factorymethod.sports;

import factorymethod.sports.dto.SportDto;
import factorymethod.sports.enums.SPORT_TYPE;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Sport {
    private String id;
    private String sportName;
    private int numberOfPlayers;
    private double duration;
    private String playedAt;
    private String description;
    private String history;
    private String fact;
    private Date addedAt;
    protected Sport(SportDto sportDto){
        this.sportName=sportDto.getSportName();
        this.id = UUID.randomUUID().toString();
        this.numberOfPlayers=sportDto.getNumberOfPlayers();
    }
    public static Sport createSport(SPORT_TYPE sportType, SportDto sportDto){
       return SportAbstractFactory.createSport(sportType, sportDto);
    }

    public String getId() {
        return id;
    }

    public Sport setId(String id) {
        this.id = id;
        return this;
    }

    public String getSportName() {
        return sportName;
    }

    public Sport setSportName(String sportName) {
        this.sportName = sportName;
        return this;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public Sport setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        return this;
    }

    public double getDuration() {
        return duration;
    }

    public Sport setDuration(double duration) {
        this.duration = duration;
        return this;
    }

    public String getPlayedAt() {
        return playedAt;
    }

    public Sport setPlayedAt(String playedAt) {
        this.playedAt = playedAt;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Sport setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getHistory() {
        return history;
    }

    public Sport setHistory(String history) {
        this.history = history;
        return this;
    }

    public String getFact() {
        return fact;
    }

    public Sport setFact(String fact) {
        this.fact = fact;
        return this;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public Sport setAddedAt(Date addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sport sport)) return false;
        return getNumberOfPlayers() == sport.getNumberOfPlayers() && Double.compare(sport.getDuration(), getDuration()) == 0 && Objects.equals(getId(), sport.getId()) && Objects.equals(getSportName(), sport.getSportName()) && Objects.equals(getPlayedAt(), sport.getPlayedAt()) && Objects.equals(getDescription(), sport.getDescription()) && Objects.equals(getHistory(), sport.getHistory()) && Objects.equals(getFact(), sport.getFact()) && Objects.equals(getAddedAt(), sport.getAddedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSportName(), getNumberOfPlayers(), getDuration(), getPlayedAt(), getDescription(), getHistory(), getFact(), getAddedAt());
    }
}
