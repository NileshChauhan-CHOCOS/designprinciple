package creational.factorymethod.logistics.vehicles.sea;

import creational.factorymethod.logistics.Transport;
import creational.factorymethod.logistics.enums.FuelType;
import creational.factorymethod.logistics.enums.VesselType;
import creational.factorymethod.logistics.vehicles.SeaLogisticVehicle;

@SuppressWarnings("unused")
public class ContainerShip extends SeaLogisticVehicle implements Transport {
    
    private static final String DEFAULT_VEHICLE_NUMBER = "MM-03 PR-4046";
    
    public ContainerShip(){
        super(DEFAULT_VEHICLE_NUMBER, 3000000.00, VesselType.CONTAINER_SHIP, FuelType.HFO);
    }
    
    public ContainerShip(String vehicleNumber){
        super(vehicleNumber, 3000000.00, VesselType.CONTAINER_SHIP, FuelType.HFO);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
