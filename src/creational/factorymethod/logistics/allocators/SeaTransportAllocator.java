package creational.factorymethod.logistics.allocators;

import creational.factorymethod.logistics.enums.VesselType;
import creational.factorymethod.logistics.vehicles.*;
import creational.factorymethod.logistics.vehicles.sea.*;

public class SeaTransportAllocator implements TransportAllocator {
    
    public static SeaLogisticVehicle fromSeaTransporters(String vehicleNumber, VesselType vesselType){
        return switch (vesselType) {
            case BULKER -> new Bulker(vehicleNumber);
            case CONTAINER_SHIP -> new ContainerShip(vehicleNumber);
            case CRUISE_SHIP -> new CruiseShip(vehicleNumber);
            case TANKER -> new TankerShip(vehicleNumber);
            case BARGE -> new BargeShip(vehicleNumber);
        };
    }
    
    public static SeaLogisticVehicle fromSeaTransporters(VesselType vesselType){
        return switch (vesselType){
            case BULKER -> new Bulker();
            case CONTAINER_SHIP -> new ContainerShip();
            case CRUISE_SHIP -> new CruiseShip();
            case TANKER -> new TankerShip();
            case BARGE -> new BargeShip();
        };
    }
}
