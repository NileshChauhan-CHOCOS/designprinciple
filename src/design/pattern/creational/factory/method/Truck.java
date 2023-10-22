package design.pattern.creational.factory.method;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by Truck in cargo");
    }
}
