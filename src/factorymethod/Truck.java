package factorymethod;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by truck trough land in a box");
    }
}
