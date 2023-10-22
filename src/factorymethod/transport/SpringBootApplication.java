package factorymethod.transport;

import factorymethod.transport.vehicle.Ship;
import factorymethod.transport.vehicle.Truck;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SpringBootApplication {
    private static final String BANNER = "banner.txt";
    public static void main(String[] args) {
        String file = new File("").getAbsolutePath().concat("/" + BANNER);
       try(FileReader reader = new FileReader(file, StandardCharsets.UTF_8)){
           System.out.println("abolute path " + file);
           String strline;
           BufferedReader br =new BufferedReader(reader);
           while((strline = br.readLine()) != null){
               System.out.println(strline);
           }

       }
       catch (IOException ioException){
           ioException.fillInStackTrace();
       }
        Logistics logistics = new RoadLogistics();

        Truck truck = (Truck) logistics.createTransport("MP-09 HH 6439");
        truck.deliver();
        logistics = new SeaLogistics();
        Ship ship = (Ship) logistics.createTransport("FL 3717 ZW");
        ship.deliver();
    }
    public static void run(String[] args){
        main(args);
    }
}
