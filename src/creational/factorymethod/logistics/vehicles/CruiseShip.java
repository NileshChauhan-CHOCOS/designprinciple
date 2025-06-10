package creational.factorymethod.logistics.vehicles;

import creational.factorymethod.logistics.Transport;
import creational.factorymethod.logistics.enums.VehicleType;

public class CruiseShip extends SeaLogisticVehicle implements Transport {
    private static final String DEFAULT_VEHICLE_NUMBER = "MM-01 PR-4846";
    private CruiseShip(){
        super(DEFAULT_VEHICLE_NUMBER, VehicleType.SEA);
    }
    private CruiseShip(String vehicleNumber){
        super(vehicleNumber,VehicleType.SEA);
    }
    public static CruiseShip getInstance(){
        return new CruiseShip(DEFAULT_VEHICLE_NUMBER);
    }
    public static CruiseShip getInstance(String vehicleNumber){
        return new CruiseShip(vehicleNumber);
    }
    @Override
    public void deliver() {
        System.out.println("Delivered by `Cruise Ship`");
    }
}
