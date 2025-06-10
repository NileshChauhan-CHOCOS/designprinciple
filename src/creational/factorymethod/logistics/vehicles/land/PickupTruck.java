package creational.factorymethod.logistics.vehicles.land;

import creational.factorymethod.logistics.enums.FuelType;
import creational.factorymethod.logistics.enums.TransportMode;
import creational.factorymethod.logistics.vehicles.RoadLogisticVehicle;

@SuppressWarnings("unused")
public class PickupTruck extends RoadLogisticVehicle {
    
    private static final String DEFAULT_VEHICLE = "PQ-09 LA-9374";
    
    public PickupTruck(){
        super(DEFAULT_VEHICLE, TransportMode.ROAD, 300.00, FuelType.GASOLINE);
    }
    
    public PickupTruck(String vehicleNumber){
        super(vehicleNumber, TransportMode.ROAD,300.00, FuelType.GASOLINE);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
