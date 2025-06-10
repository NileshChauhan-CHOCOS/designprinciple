package creational.factorymethod.logistics.test;

public class SeaLogistic implements Transport{
    
    @Override
    public ContainerShip createTransport() {
        return new ContainerShip();
    }
}
