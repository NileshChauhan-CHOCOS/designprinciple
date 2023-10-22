package factorymethod.transport;

import factorymethod.transport.vehicle.Ship;

public class SeaLogistics implements Logistics {
    @Override
    public Ship createTransport(String vehicleNumber) {
        return new Ship(vehicleNumber);
    }
}
