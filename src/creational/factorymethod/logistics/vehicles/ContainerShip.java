package creational.factorymethod.logistics.vehicles;

import creational.factorymethod.logistics.Transport;
import creational.factorymethod.logistics.enums.VehicleType;
@SuppressWarnings("unused")
public class ContainerShip extends SeaLogisticVehicle implements Transport {
    private static final String DEFAULT_VEHICLE_NUMBER = "MM-03 PR-4046";
    public ContainerShip(){
        super(DEFAULT_VEHICLE_NUMBER, VehicleType.SEA);
    }
    public ContainerShip(String vehicleNumber){
        super(vehicleNumber,VehicleType.SEA);
    }
    public static ContainerShip getInstance(){
        return new ContainerShip(DEFAULT_VEHICLE_NUMBER);
    }
    public static ContainerShip getInstance(String vehicleNumber){
        return new ContainerShip(vehicleNumber);
    }
    @Override
    public void deliver(){
        System.out.println("Delivered by `Container Ship`");
    }
}
