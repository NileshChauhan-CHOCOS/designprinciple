package creational.factorymethod.logistics.vehicles;

import creational.factorymethod.logistics.SeaLogistic;
import creational.factorymethod.logistics.enums.FuelType;
import creational.factorymethod.logistics.enums.TransportMode;
import creational.factorymethod.logistics.enums.VesselType;

@SuppressWarnings("unused")
public abstract class SeaLogisticVehicle extends SeaLogistic {
    
    private final String vesselId;
    
    private final Double capacity;
    
    private final VesselType vesselType;
    
    private String startPort;
    
    private String currentLocation;
    
    private String destinationPort;
    
    private final FuelType fuelType;
    
    private String cargo;
    
    protected String vehicleName;
    
    protected final TransportMode transportMode;
    
    protected SeaLogisticVehicle(String vesselId, Double capacity, VesselType vesselType, FuelType fuelType){
        this.vesselId = vesselId;
        this.transportMode = TransportMode.SEA;
        this.capacity = capacity;
        this.vesselType = vesselType;
        this.fuelType = fuelType;
    }
    
    public String getVesselId() {
        return vesselId;
    }
    
    public Double getCapacity() {
        return capacity;
    }
    
    public VesselType getVesselType() {
        return vesselType;
    }
    
    public String getStartPort() {
        return startPort;
    }
    
    public void setStartPort(String startPort) {
        this.startPort = startPort;
    }
    
    public String getCurrentLocation() {
        return currentLocation;
    }
    
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
    
    public String getDestinationPort() {
        return destinationPort;
    }
    
    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }
    
    public FuelType getFuelType() {
        return fuelType;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getVehicleName() {
        return vehicleName;
    }
    
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
    
    public TransportMode getTransportMode() {
        return transportMode;
    }
    
    @Override
    public String toString() {
        return "{ vessel id : " + vesselId + ", " +
                "capacity : " + capacity + ", " +
                "vessel type : " + vesselType + ", " +
                "start port : " + startPort + ", " +
                "destination port : " + destinationPort + ", " +
                "current location : " + currentLocation + ", " +
                "vehicle name : " + vehicleName + ", " +
                " }";
    }
}
