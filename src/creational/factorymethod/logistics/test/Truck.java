package creational.factorymethod.logistics.test;

public class Truck extends RoadLogisticVehicle{
    
    public Truck(){
        super(100.450, "Diesel");
    }
    
    public void planDelivery() {
        System.out.println("Cargo is delivered by truck \n" +  this); // NOSONAR
    }
    
    @Override
    public String toString() {
        return "{ vehicle id : " + getVehicleId() + ", " +
                "capacity : " + getCapacity() + ", " +
                "fuel type : " + getFuelType() + ", " +
                "start location : " + getStartLocation() + ", " +
                "destination location : " + getDestination() + ", " +
                "current location : " + getCurrentLocation() + ", " +
                "cargo : " + getCargo() +
                 " }";
    }
}
