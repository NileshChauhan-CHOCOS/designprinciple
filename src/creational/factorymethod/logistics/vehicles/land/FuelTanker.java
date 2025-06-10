package creational.factorymethod.logistics.vehicles.land;

import creational.factorymethod.logistics.enums.FuelType;
import creational.factorymethod.logistics.enums.TransportMode;
import creational.factorymethod.logistics.vehicles.RoadLogisticVehicle;

@SuppressWarnings("unused")
public class FuelTanker extends RoadLogisticVehicle {
   
    private static final String DEFAULT_VEHICLE_NUMBER = "MP-01 GT-7646";
   
    public FuelTanker(){
        super(DEFAULT_VEHICLE_NUMBER, TransportMode.ROAD, 600.00, FuelType.DIESEL);
    }
    public FuelTanker(String vehicleNumber){
        super(vehicleNumber,TransportMode.ROAD, 600.00, FuelType.DIESEL);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
