package creational.factorymethod.logistics.test;

import java.util.UUID;

public abstract class RoadLogisticVehicle extends RoadLogistic {
    
    private final String vehicleId;
    
    private final Double capacity;
    
    private final String fuelType;
    
    private String startLocation;
    
    private String currentLocation;
    
    private String destination;
    
    private String cargo;
    
    protected RoadLogisticVehicle(Double capacity, String fuelType) {
        this.vehicleId = UUID.randomUUID().toString();
        this.capacity = capacity;
        this.fuelType = fuelType;
    }
    
    public String getVehicleId() {
        return vehicleId;
    }
    
    public Double getCapacity() {
        return capacity;
    }
    
    public String getFuelType() {
        return fuelType;
    }
    
    public String getCurrentLocation() {
        return currentLocation;
    }
    
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getStartLocation() {
        return startLocation;
    }
    
    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
}
