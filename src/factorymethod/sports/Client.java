package factorymethod.sports;

import factorymethod.sports.dto.SportDto;
import factorymethod.sports.enums.SPORT_TYPE;

import java.util.Scanner;

public class Client {
    public static String extractString(String str){
        return str + "_SPORT";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SportDto sportDto = new SportDto();
        System.out.println("Enter SportName, Number Of Players and Type Of Sport");
        while (!scanner.nextLine().equalsIgnoreCase("quit")){
            String str=scanner.nextLine();
            String [] tempStr = str.split(", ");
            sportDto.setSportName(tempStr[0]);
            sportDto.setNumberOfPlayers(Integer.parseInt(tempStr[1]));
            String sportType = extractString(tempStr[2].toUpperCase());
            Sport sport = Sport.createSport(SPORT_TYPE.valueOf(sportType), sportDto);
            System.out.println(sport);
            System.out.println("Enter SportName, Number Of Players and Type Of Sport");
        }
    }
}
