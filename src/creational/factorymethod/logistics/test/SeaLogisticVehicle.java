package creational.factorymethod.logistics.test;

import java.util.UUID;

public class SeaLogisticVehicle extends SeaLogistic{
    
    private final String vesselId;
    
    private final Double capacity;
    
    private final String vesselType;
    
    private String startLocation;
    
    private String currentLocation;
    
    private String destinationPort;
    
    private Double maxSpeed;
    
    private String cargo;
    
    protected SeaLogisticVehicle(String vesselType, Double capacity){
        this.vesselId = UUID.randomUUID().toString();
        this.vesselType = vesselType;
        this.capacity = capacity;
    }
    
    public String getVesselId() {
        return vesselId;
    }
    
    public Double getCapacity() {
        return capacity;
    }
    
    public String getVesselType() {
        return vesselType;
    }
    
    public String getCurrentLocation() {
        return currentLocation;
    }
    
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
    
    public Double getMaxSpeed() {
        return maxSpeed;
    }
    
    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
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
    
    public String getDestinationPort() {
        return destinationPort;
    }
    
    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }
}
