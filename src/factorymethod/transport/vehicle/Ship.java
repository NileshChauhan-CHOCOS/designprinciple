package factorymethod.transport.vehicle;


import factorymethod.transport.Transport;
import factorymethod.transport.vehicle.Vehicle;
import factorymethod.transport.vehicle.VehicleType;

public class Ship extends Vehicle implements Transport {
    public Ship(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
        this.type = VehicleType.SEA;
    }
    @Override
    public void deliver() {
        System.out.println("Delivered by Ship through sea in a container by ship :- " + this.vehicleNumber);
    }
}
