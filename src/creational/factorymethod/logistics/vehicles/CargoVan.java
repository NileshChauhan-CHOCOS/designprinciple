package creational.factorymethod.logistics.vehicles;

import factorymethod.transport.vehicle.VehicleType;
@SuppressWarnings("unused")
public class CargoVan extends RoadLogisticVehicle {
    private static final String DEFAULT_VEHICLE_NUMBER = "MH-09 TA9734";
    public CargoVan(){
        super(DEFAULT_VEHICLE_NUMBER, VehicleType.ROAD);
    }
    public CargoVan(String vehicleNumber){
        super(vehicleNumber,VehicleType.ROAD);
    }
    public static CargoVan getInstance(){
        return new CargoVan();
    }
    public static CargoVan getInstance(String vehicleNumber){
        return new CargoVan(vehicleNumber);
    }
}
