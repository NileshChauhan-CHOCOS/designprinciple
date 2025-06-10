package creational.factorymethod.logistics;

import creational.factorymethod.logistics.enums.RoadVehicle;
import creational.factorymethod.logistics.vehicles.*;

@SuppressWarnings("unused")
public interface RoadTransportAllocator extends TransportAllocator{
    static RoadLogisticVehicle fromRoadTransporters(String vehicleNumber, RoadVehicle roadVehicle){
        return switch (roadVehicle){
            case CARGO_VAN -> CargoVan.getInstance(vehicleNumber);
            case PICKUP_TRUCK -> PickupTruck.getInstance(vehicleNumber);
            case FREIGHT_TRUCK -> FreightTruck.getInstance(vehicleNumber);
            case FUEL_TANKER -> FuelTanker.getInstance(vehicleNumber);
        };
    }
    static RoadLogisticVehicle fromRoadTransporters(RoadVehicle roadVehicle){
        return switch (roadVehicle){
            case CARGO_VAN -> CargoVan.getInstance();
            case PICKUP_TRUCK -> PickupTruck.getInstance();
            case FREIGHT_TRUCK -> FreightTruck.getInstance();
            case FUEL_TANKER -> FuelTanker.getInstance();
        };
    }
}
