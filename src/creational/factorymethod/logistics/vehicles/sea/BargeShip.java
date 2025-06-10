package creational.factorymethod.logistics.vehicles.sea;

import creational.factorymethod.logistics.Transport;
import creational.factorymethod.logistics.enums.FuelType;
import creational.factorymethod.logistics.enums.VesselType;
import creational.factorymethod.logistics.vehicles.SeaLogisticVehicle;

public class BargeShip extends SeaLogisticVehicle implements Transport {
    
    private static final String DEFAULT_VEHICLE_NUMBER = "MM-01 BR-4846";
    
    public BargeShip() {
        super(DEFAULT_VEHICLE_NUMBER, 50000.00, VesselType.BARGE ,FuelType.MDO);
    }
    
    public BargeShip(String vehicleNumber) {
        super(vehicleNumber, 50000.00, VesselType.BARGE ,FuelType.MDO);
    }
}
