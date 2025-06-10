package creational.factorymethod.logistics.vehicles.land;

import creational.factorymethod.logistics.enums.FuelType;
import creational.factorymethod.logistics.enums.TransportMode;
import creational.factorymethod.logistics.vehicles.RoadLogisticVehicle;

@SuppressWarnings("unused")
public class CargoVan extends RoadLogisticVehicle {
    
    private static final String DEFAULT_VEHICLE_NUMBER = "MH-09 TA9734";
    
    public CargoVan(){
        super(DEFAULT_VEHICLE_NUMBER, TransportMode.ROAD, 33.0, FuelType.GASOLINE);
    }
    public CargoVan(String vehicleNumber){
        super(vehicleNumber,TransportMode.ROAD, 33.00, FuelType.GASOLINE);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
