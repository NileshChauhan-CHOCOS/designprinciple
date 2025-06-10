package creational.factorymethod.logistics.logistics;

public class ContainerShip extends SeaLogisticVehicle{
    
    public ContainerShip(){
        super("Container Ship", 500.450);
    }
    
   // @Override
    public void planDelivery() {
        System.out.println("Cargo is delivered by container ship : \n" + this); // NOSONAR
    }
    
    @Override
    public String toString() {
        return "{ id : " + getVesselId() + ", " +
                "capacity : " + getCapacity() + ", " +
                "vessel type : " + getVesselType() + ", " +
                "start location : " + getStartLocation() + ", " +
                "destination location : " + getDestinationPort() + ", " +
                "current location : " + getCurrentLocation() + ", " +
                "max speed : " + getMaxSpeed() + ", " +
                "cargo : " + getCargo() +
                " }";
    }
}
