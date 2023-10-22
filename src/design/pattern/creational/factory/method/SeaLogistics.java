package design.pattern.creational.factory.method;

public class SeaLogistics extends Logistics{
    public Transport createTransport(){
        return new Ship();
    }
}
