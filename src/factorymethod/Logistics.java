package factorymethod;

public abstract class Logistics {
    void planDelivery(){
        System.out.println("Plan is delivered");
    }
    abstract Transport createTransport();
}
