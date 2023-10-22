package factorymethod.transport.vehicle;

import factorymethod.transport.Transport;

public class Truck extends Vehicle implements Transport {
    public Truck(String vehicleNumber){
        this.vehicleNumber =vehicleNumber;
        this.type = VehicleType.ROAD;
    }
    @Override
    public void deliver() {
        System.out.println("Delivered by truck trough land in a box by truck :- " + this.vehicleNumber);
    }
}
