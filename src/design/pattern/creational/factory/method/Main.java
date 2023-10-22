package design.pattern.creational.factory.method;

public class Main {
    public static void main(String[] args){
        Transport t1= new RoadLogistics().createTransport();
        Transport t2= new SeaLogistics().createTransport();
        t1.deliver();
        t2.deliver();
    }
}
