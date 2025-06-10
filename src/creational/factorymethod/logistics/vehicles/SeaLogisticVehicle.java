package creational.factorymethod.logistics.vehicles;

import creational.factorymethod.logistics.enums.VehicleType;

@SuppressWarnings("unused")
public abstract class SeaLogisticVehicle {
    protected String vehicleName;
    protected Integer capacity;
    
    protected final String vehicleNumber;
    protected final VehicleType vehicleType;
    protected SeaLogisticVehicle(String vehicleNumber, VehicleType vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
}
