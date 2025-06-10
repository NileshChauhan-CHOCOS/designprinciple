package creational.factorymethod.logistics.vehicles;

import factorymethod.transport.vehicle.VehicleType;
@SuppressWarnings("unused")
public class PickupTruck extends RoadLogisticVehicle{
    private static final String DEFAULT_VEHICLE = "PQ-09 LA-9374";
    
    private PickupTruck(){
        super(DEFAULT_VEHICLE,VehicleType.ROAD);
    }
    private PickupTruck(String vehicleNumber){
        super(vehicleNumber, VehicleType.ROAD);
    }
    public static PickupTruck getInstance(){
        return new PickupTruck();
    }
    public static PickupTruck getInstance(String vehicleNumber){
        return new PickupTruck(vehicleNumber);
    }
}
