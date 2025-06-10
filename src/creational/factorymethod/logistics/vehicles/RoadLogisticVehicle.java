package creational.factorymethod.logistics.vehicles;

import factorymethod.transport.vehicle.VehicleType;

public abstract class RoadLogisticVehicle {
    protected final String vehicleNumber;
    protected final VehicleType vehicleType;
    protected RoadLogisticVehicle(String vehicleNumber, VehicleType vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
}
