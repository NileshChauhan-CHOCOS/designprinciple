package creational.factorymethod.logistics.vehicles.sea;

import creational.factorymethod.logistics.Transport;
import creational.factorymethod.logistics.enums.FuelType;
import creational.factorymethod.logistics.enums.VesselType;
import creational.factorymethod.logistics.vehicles.SeaLogisticVehicle;

/**
 * Cruise ships are large passenger ships used mainly for vacationing. Unlike ocean liners, which are used for transport, cruise ships typically embark on round-trip voyages to various ports of call, where passengers may go on tours known as "shore excursions".
 */
public class CruiseShip extends SeaLogisticVehicle implements Transport {
    
    private static final String DEFAULT_VEHICLE_NUMBER = "MM-01 PR-4846";
    
    public CruiseShip(){
        super(DEFAULT_VEHICLE_NUMBER, 130000.00, VesselType.CRUISE_SHIP, FuelType.MDO);
    }
    
    public CruiseShip(String vehicleNumber){
        super(vehicleNumber, 130000.00, VesselType.CRUISE_SHIP, FuelType.MDO);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
