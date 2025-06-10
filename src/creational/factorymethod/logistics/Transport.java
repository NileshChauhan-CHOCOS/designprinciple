package creational.factorymethod.logistics;

import creational.factorymethod.logistics.enums.RoadVehicle;
import creational.factorymethod.logistics.enums.VesselType;

public interface Transport {
    
    Transport createTransport(VesselType vesselType, String vehicleNumber);
    
    Transport createTransport(RoadVehicle roadVehicle, String vehicleNumber);
}
