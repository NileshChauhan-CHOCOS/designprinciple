package design.pattern.creational.factory.method;

public abstract class Logistics{
    public void planDelivery(){
        System.out.println("Delivery is planed at " + System.currentTimeMillis());
    }
    public abstract Transport createTransport();
}
