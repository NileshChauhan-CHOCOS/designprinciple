package creational.factorymethod.logistics;

import creational.factorymethod.logistics.enums.RoadVehicle;
import creational.factorymethod.logistics.enums.VesselType;
import creational.factorymethod.logistics.vehicles.sea.ContainerShip;
import creational.factorymethod.logistics.vehicles.land.CargoVan;
import creational.factorymethod.logistics.vehicles.sea.Bulker;

public class TransportApplication {
    
    public static void main(String[] args) {
        
        SeaLogistic seaLogistic = new SeaLogistic();
        
        RoadLogistic roadLogistic = new RoadLogistic();
        
        Bulker bulker = (Bulker) seaLogistic.createTransport(VesselType.BULKER, "IMO 9811000");
        bulker.setCargo("Wheat");
        bulker.setDestinationPort("Chabahar port");
        bulker.setStartPort("Mumbai");
        bulker.setVehicleName("Flying Dutchman");
        bulker.setCurrentLocation("Mumbai");
        
        ContainerShip containerShip = (ContainerShip) seaLogistic.createTransport(VesselType.CONTAINER_SHIP, "IPR 9380983");
        containerShip.setCargo("Clothing");
        containerShip.setStartPort("Kochin");
        containerShip.setDestinationPort("Hamburg");
        containerShip.setCurrentLocation("Kochin");
        containerShip.setVehicleName("Black Perl");
        
        CargoVan cargoVan = (CargoVan) roadLogistic.createTransport(RoadVehicle.CARGO_VAN,"MP-03 TA 39095");
        cargoVan.setCargo("Furniture");
        cargoVan.setStartLocation("Pune");
        cargoVan.setCurrentLocation("Indore");
        cargoVan.setDestination("Agra");
        
        System.out.println(bulker); // NOSONAR
        
        System.out.println(cargoVan); // NOSONAR
        
        System.out.println(containerShip); // NOSONAR
    }
}
