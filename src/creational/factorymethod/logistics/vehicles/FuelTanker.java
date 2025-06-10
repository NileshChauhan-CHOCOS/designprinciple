package creational.factorymethod.logistics.vehicles;

import factorymethod.transport.vehicle.VehicleType;

@SuppressWarnings("unused")
public class FuelTanker extends RoadLogisticVehicle{
    private static final String DEFAULT_VEHICLE_NUMBER = "MP-01 GT-7646";
    private FuelTanker(){
        super(DEFAULT_VEHICLE_NUMBER,VehicleType.ROAD);
    }
    private FuelTanker(String vehicleNumber){
        super(vehicleNumber,VehicleType.ROAD);
    }
    public static FuelTanker getInstance(){
        return new FuelTanker();
    }
    public static FuelTanker getInstance(String vehicleNumber){
        return new FuelTanker(vehicleNumber);
    }
}
