package creational.factorymethod.logistics.vehicles;

import factorymethod.transport.vehicle.VehicleType;
@SuppressWarnings("unused")
public class FreightTruck extends RoadLogisticVehicle {
    private static final String DEFAULT_VEHICLE_NUMBER = "MP-12 AC-8379";
    private FreightTruck(){
        super(DEFAULT_VEHICLE_NUMBER,VehicleType.ROAD);
    }
    private FreightTruck(String vehicleNumber){
        super(vehicleNumber, VehicleType.ROAD);
    }
    public FreightTruck createTransport(String vehicleNumber) {
        return new FreightTruck(vehicleNumber);
    }
    public static FreightTruck getInstance(){
        return new FreightTruck();
    }
    public static FreightTruck getInstance(String vehicleNumber){
        return new FreightTruck(vehicleNumber);
    }
}
