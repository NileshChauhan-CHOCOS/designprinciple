package design.pattern.creational.factory.method;

public class Ship extends SeaLogistics implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by Ship in container");
    }
}
