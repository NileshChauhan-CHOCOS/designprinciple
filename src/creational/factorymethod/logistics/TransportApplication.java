package creational.factorymethod.logistics;

import creational.factorymethod.logistics.enums.RoadVehicle;
import creational.factorymethod.logistics.enums.SeaVehicle;
import creational.factorymethod.logistics.vehicles.*;

public class TransportApplication {
    public static void main(String[] args) {
        Bulker bulker = (Bulker) SeaTransportAllocator.fromSeaTransporters("MP-09 TA0395", SeaVehicle.BULKERS);
        bulker.deliver();
        CruiseShip cruiseShip = (CruiseShip) SeaTransportAllocator.fromSeaTransporters(SeaVehicle.CRUISE_SHIP);
        cruiseShip.deliver();
        ContainerShip containerShip = (ContainerShip) SeaTransportAllocator.fromSeaTransporters(SeaVehicle.CONTAINER_SHIP);
        containerShip.deliver();
        
        CargoVan cargoVan = (CargoVan) RoadTransportAllocator.fromRoadTransporters("MP-03 TA 39095", RoadVehicle.CARGO_VAN);
        
    }
}
