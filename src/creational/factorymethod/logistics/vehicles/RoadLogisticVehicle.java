package creational.factorymethod.logistics.vehicles;

import creational.factorymethod.logistics.RoadLogistic;
import creational.factorymethod.logistics.enums.FuelType;
import creational.factorymethod.logistics.enums.TransportMode;

public abstract class RoadLogisticVehicle extends RoadLogistic {
    
    private final String vehicleNumber;
    
    private final Double capacity;
    
    private final FuelType fuelType;
    
    private String startLocation;
    
    private String currentLocation;
    
    private String destination;
    
    private String cargo;
    
    private final TransportMode transportMode;
    
    protected RoadLogisticVehicle(String vehicleNumber, TransportMode transportMode, Double capacity, FuelType fuelType){
        this.vehicleNumber = vehicleNumber;
        this.transportMode = transportMode;
        this.capacity = capacity;
        this.fuelType = fuelType;
    }
    
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    
    public Double getCapacity() {
        return capacity;
    }
    
    public FuelType getFuelType() {
        return fuelType;
    }
    
    public String getStartLocation() {
        return startLocation;
    }
    
    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }
    
    public String getCurrentLocation() {
        return currentLocation;
    }
    
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public TransportMode getVehicleType() {
        return transportMode;
    }
    
    @Override
    public String toString() {
        return "{ vehicle number : " + vehicleNumber + ", " +
                "capacity : " + capacity + ", " +
                "fuel type : " + fuelType + ", " +
                "start location : " + startLocation + ", " +
                "destination location : " + destination + ", " +
                "current location : " + currentLocation + ", " +
                " }";
    }
}
