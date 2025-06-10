package creational.factorymethod.logistics.test;

public class TransportApplication {
    
    public static void main(String[] args) {
        
        RoadLogistic roadLogistic = new RoadLogistic();
        SeaLogistic seaLogistic = new SeaLogistic();
        Truck truck = roadLogistic.createTransport();
        ContainerShip containerShip = seaLogistic.createTransport();
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
