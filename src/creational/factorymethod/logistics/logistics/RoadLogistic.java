package creational.factorymethod.logistics.logistics;



public class RoadLogistic implements Transport{
    
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
