package design.pattern.creational.factory.method;

public class RoadLogistics extends Logistics{
    public Transport createTransport(){
        return new Truck();
    }
}
