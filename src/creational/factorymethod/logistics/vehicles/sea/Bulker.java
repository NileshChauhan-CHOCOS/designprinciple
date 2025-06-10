package creational.factorymethod.logistics.vehicles.sea;

import creational.factorymethod.logistics.Transport;
import creational.factorymethod.logistics.enums.FuelType;
import creational.factorymethod.logistics.enums.VesselType;
import creational.factorymethod.logistics.vehicles.SeaLogisticVehicle;

/**
 * <p>	Bulk carriers ({@link Bulker}) are cargo ships used to transport bulk cargo items such as ore or food staples (rice, grain, etc.) and similar cargo. They can be recognized by the large box-like hatches on their deck, designed to slide outboard for loading. A bulk carrier could be either dry or wet. Most lakes are too small to accommodate bulk ships, but a large fleet of lake freighters has been plying the Great Lakes and St. Lawrence Seaway of North America for over a century</p>
 */
@SuppressWarnings("unused")
public class Bulker extends SeaLogisticVehicle implements Transport {
    
    private static final String DEFAULT_VEHICLE_NUMBER = "MM-01 PR-4846";
    
    public Bulker(){
        super(DEFAULT_VEHICLE_NUMBER,400000.00, VesselType.BULKER, FuelType.HFO);
    }
    public Bulker(String vehicleNumber){
        super(vehicleNumber,4000000.00, VesselType.BULKER, FuelType.HFO);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
