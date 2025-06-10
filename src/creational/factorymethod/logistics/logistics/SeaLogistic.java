package creational.factorymethod.logistics.logistics;

public class SeaLogistic implements Transport{
    
    @Override
    public Transport createTransport() {
        return new ContainerShip();
    }
}
