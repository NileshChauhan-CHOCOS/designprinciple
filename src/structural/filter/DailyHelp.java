package structural.filter;

import design.pattern.creational.factory.method.institution.GENDER;

import java.util.List;

public class DailyHelp {
    private String dHelpName;
    private GENDER dHelpGender;
    private double rating;

    public String getdHelpName() {
        return dHelpName;
    }

    public void setdHelpName(String dHelpName) {
        this.dHelpName = dHelpName;
    }

    public GENDER getdHelpGender() {
        return dHelpGender;
    }

    public void setdHelpGender(GENDER dHelpGender) {
        this.dHelpGender = dHelpGender;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getFreeTimeSlot() {
        return freeTimeSlot;
    }

    public void setFreeTimeSlot(List<String> freeTimeSlot) {
        this.freeTimeSlot = freeTimeSlot;
    }

    private List<String> freeTimeSlot;
}
