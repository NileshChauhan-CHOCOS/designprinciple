package creational.factorymethod.logistics.logistics;

public class TransportApplication {
    
    public static void main(String[] args) {
        
        RoadLogistic roadLogistic = new RoadLogistic();
        SeaLogistic seaLogistic = new SeaLogistic();
        Truck truck = (Truck) roadLogistic.createTransport();
        ContainerShip containerShip = (ContainerShip) seaLogistic.createTransport();
        truck.setCargo("Television");
        truck.setCurrentLocation("Indore");
        truck.setStartLocation("Mumbai");
        truck.setDestination("Agra");
        truck.planDelivery();
        containerShip.setCargo("Vaccines");
        containerShip.setCurrentLocation("Chabahar port");
        containerShip.setStartLocation("India");
        containerShip.setDestinationPort("Afghanistan");
        containerShip.planDelivery();
        
    }
}
