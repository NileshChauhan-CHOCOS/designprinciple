package creational.factorymethod.logistics;

import creational.factorymethod.logistics.allocators.SeaTransportAllocator;
import creational.factorymethod.logistics.enums.RoadVehicle;
import creational.factorymethod.logistics.enums.VesselType;

public class SeaLogistic implements Transport{
    
    @Override
    public Transport createTransport(RoadVehicle roadVehicle, String vehicleNumber) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Transport createTransport(VesselType vesselType, String vehicleNumber) {
        return SeaTransportAllocator.fromSeaTransporters(vehicleNumber,vesselType);
    }
}
