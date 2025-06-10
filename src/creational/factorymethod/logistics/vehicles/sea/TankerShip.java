package creational.factorymethod.logistics.vehicles.sea;

import creational.factorymethod.logistics.Transport;
import creational.factorymethod.logistics.enums.FuelType;
import creational.factorymethod.logistics.enums.VesselType;
import creational.factorymethod.logistics.vehicles.SeaLogisticVehicle;

public class TankerShip extends SeaLogisticVehicle implements Transport {
    
    private static final String DEFAULT_VEHICLE_NUMBER = "MM-01 TR-4846";
    
    public TankerShip(){
        super(DEFAULT_VEHICLE_NUMBER, 130000.00, VesselType.CRUISE_SHIP, FuelType.HFO);
    }
    
    public TankerShip(String vehicleNumber){
        super(vehicleNumber, 130000.00, VesselType.CRUISE_SHIP, FuelType.HFO);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
