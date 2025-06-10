package creational.factorymethod.logistics.allocators;

import creational.factorymethod.logistics.enums.RoadVehicle;
import creational.factorymethod.logistics.vehicles.*;
import creational.factorymethod.logistics.vehicles.land.CargoVan;
import creational.factorymethod.logistics.vehicles.land.FreightTruck;
import creational.factorymethod.logistics.vehicles.land.FuelTanker;
import creational.factorymethod.logistics.vehicles.land.PickupTruck;

@SuppressWarnings("unused")
public class RoadTransportAllocator implements TransportAllocator {
    
    public static RoadLogisticVehicle fromRoadTransporters(String vehicleNumber, RoadVehicle roadVehicle){
        return switch (roadVehicle){
            case CARGO_VAN -> new CargoVan(vehicleNumber);
            case PICKUP_TRUCK -> new PickupTruck(vehicleNumber);
            case FREIGHT_TRUCK -> new FreightTruck(vehicleNumber);
            case FUEL_TANKER -> new FuelTanker(vehicleNumber);
        };
    }
    public static RoadLogisticVehicle fromRoadTransporters(RoadVehicle roadVehicle){
        return switch (roadVehicle){
            case CARGO_VAN -> new CargoVan();
            case PICKUP_TRUCK -> new PickupTruck();
            case FREIGHT_TRUCK -> new FreightTruck();
            case FUEL_TANKER -> new FuelTanker();
        };
    }
}
