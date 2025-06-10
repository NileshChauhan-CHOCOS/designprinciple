package creational.factorymethod.logistics.vehicles.land;

import creational.factorymethod.logistics.enums.FuelType;
import creational.factorymethod.logistics.enums.TransportMode;
import creational.factorymethod.logistics.vehicles.RoadLogisticVehicle;

@SuppressWarnings("unused")
public class FreightTruck extends RoadLogisticVehicle {
    
    private static final String DEFAULT_VEHICLE_NUMBER = "MP-12 AC-8379";
    
    public FreightTruck(){
        super(DEFAULT_VEHICLE_NUMBER, TransportMode.ROAD, 200.00, FuelType.DIESEL);
    }
    
    public FreightTruck(String vehicleNumber){
        super(vehicleNumber, TransportMode.ROAD, 200.00, FuelType.DIESEL);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
