package creational.factorymethod.logistics.vehicles;

import creational.factorymethod.logistics.Transport;
import creational.factorymethod.logistics.enums.VehicleType;

/**
 * <p>	Bulk carriers ({@link Bulker}) are cargo ships used to transport bulk cargo items such as ore or food staples (rice, grain, etc.) and similar cargo. They can be recognized by the large box-like hatches on their deck, designed to slide outboard for loading. A bulk carrier could be either dry or wet. Most lakes are too small to accommodate bulk ships, but a large fleet of lake freighters has been plying the Great Lakes and St. Lawrence Seaway of North America for over a century</p>
 */
@SuppressWarnings("unused")
public class Bulker extends SeaLogisticVehicle implements Transport {
    private static final String DEFAULT_VEHICLE_NUMBER = "MM-01 PR-4846";
    private Bulker(){
        super(DEFAULT_VEHICLE_NUMBER, VehicleType.SEA);
    }
    private Bulker(String vehicleNumber){
        super(vehicleNumber,VehicleType.SEA);
    }
    public static Bulker getInstance(){
        return new Bulker();
    }
    public static Bulker getInstance(String vehicleNumber){
        return new Bulker(vehicleNumber);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public void deliver() {
        System.out.println("Delivered by `Bulkers`");
    }
}
