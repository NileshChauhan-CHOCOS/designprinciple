package factorymethod.transport;

import factorymethod.transport.vehicle.Truck;

public class RoadLogistics implements Logistics {
    @Override
    public Truck createTransport(String vehicleNumber) {
        return new Truck(vehicleNumber);
    }
}
