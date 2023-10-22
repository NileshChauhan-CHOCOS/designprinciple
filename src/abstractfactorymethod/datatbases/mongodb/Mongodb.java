package abstractfactorymethod.datatbases.mongodb;

import abstractfactorymethod.datatbases.Database;

public class Mongodb implements Database {
    private static Mongodb instance = null;
    private Mongodb(){
        super();

    }
    public static synchronized Mongodb getInstance(){
        if(instance == null){
            instance = new Mongodb();
        }
        return instance;
    }

    @Override
    public void connect() {
        System.out.println("you are connected to Mogodb database " + instance);
    }
    @Override
    public void add() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
