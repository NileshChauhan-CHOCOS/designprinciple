package creational.factorymethod.logistics;


import creational.factorymethod.logistics.allocators.RoadTransportAllocator;
import creational.factorymethod.logistics.enums.RoadVehicle;
import creational.factorymethod.logistics.enums.VesselType;

public class RoadLogistic implements Transport {
    
    @Override
    public Transport createTransport(RoadVehicle roadVehicle, String vehicleNumber) {
        return RoadTransportAllocator.fromRoadTransporters(vehicleNumber, roadVehicle);
    }
    
    @Override
    public Transport createTransport(VesselType vesselType, String vehicleNumber) {
        throw new UnsupportedOperationException();
    }
}
