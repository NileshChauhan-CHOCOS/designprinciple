package structural.filter;

import design.pattern.creational.factory.method.institution.GENDER;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<DailyHelp> dailyHelps = new ArrayList<>();
        dailyHelps = dailyHelps.stream()
                .filter(dailyHelp -> dailyHelp.getdHelpGender().equals(GENDER.FEMALE))
                .filter(dailyHelp -> dailyHelp.getRating() >= 3.4)
                .collect(Collectors.toList());
    }
}
