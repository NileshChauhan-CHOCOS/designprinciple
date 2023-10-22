package factorymethod.transport.vehicle;
public class Bus extends Vehicle{
    public Bus(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
        this.type = VehicleType.ROAD;
    }
}
