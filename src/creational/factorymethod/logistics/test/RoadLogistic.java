package creational.factorymethod.logistics.test;



public class RoadLogistic implements Transport{
    
    @Override
    public Truck createTransport() {
        return new Truck();
    }
}
