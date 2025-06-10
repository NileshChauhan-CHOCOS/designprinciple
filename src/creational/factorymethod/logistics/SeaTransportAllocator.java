package creational.factorymethod.logistics;

import creational.factorymethod.logistics.enums.SeaVehicle;
import creational.factorymethod.logistics.vehicles.Bulker;
import creational.factorymethod.logistics.vehicles.ContainerShip;
import creational.factorymethod.logistics.vehicles.CruiseShip;
import creational.factorymethod.logistics.vehicles.SeaLogisticVehicle;

public interface SeaTransportAllocator extends TransportAllocator{
    
    static SeaLogisticVehicle fromSeaTransporters(String vehicleNumber, SeaVehicle seaVehicle){
        return switch (seaVehicle) {
            case BULKERS -> Bulker.getInstance(vehicleNumber);
            case CONTAINER_SHIP -> ContainerShip.getInstance(vehicleNumber);
            case CRUISE_SHIP -> CruiseShip.getInstance(vehicleNumber);
        };
    }
    
    static SeaLogisticVehicle fromSeaTransporters(SeaVehicle seaVehicle){
        return switch (seaVehicle){
            case BULKERS -> Bulker.getInstance();
            case CONTAINER_SHIP -> ContainerShip.getInstance();
            case CRUISE_SHIP -> CruiseShip.getInstance();
        };
    }
}
